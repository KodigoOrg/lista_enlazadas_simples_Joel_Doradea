public class ListaEnlazadaSimple {
    private Nodo cabeza;

    /**
     * Incializamos Nodo
     */
    public ListaEnlazadaSimple() {
        this.cabeza = cabeza;
    }

    /**
     * Inserta un nuevo nodo al inicio de la lista
     * @param dato
     */

    public void insetarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
    }

    /**
     * Elimina el nodo al inicio de la lista
     * @return true si se eliminó correctamente, false si la lista estaba vacía.
     */
    public boolean eliminarAlInicio(){
        if (cabeza == null) {
            return false;
        }
        cabeza = cabeza.getSiguiente();
        return true;
    }

    /**
     * Inserta un nuevo nodo al final de la lista
     * @param dato
     */
    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            return;
        }
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
    }

    /**
     * Metodo que dato un objetivo (dato) busca y elimina el nodo que contiene ese dato.
     * @param dato
     * @return si el ibjeto fue eliminado o no.
     */
    public boolean eliminar(int dato) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.getDato() == dato) {
            cabeza = cabeza.getSiguiente();
            return true;

        }
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getDato() == dato) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    /**
     * Verifica la cantidad de nodos que hay en la lista.
     * @return
     */
    public int tamanio() {
        int contador = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }
    /**
     * Imprime el contenido de la lista enlazada.
     */
    public void imprimir() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.println("Contenido de la lista:");

        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println("actual.getDato() = " + actual.getDato());
            if (actual.getSiguiente() != null) {
                System.out.print(" -> ");
            }
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    /**
     *
     * @param obj
     * @return
     */
    public boolean buscar (int obj){
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.getDato() == obj) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    /**
     * Devuelve una cadena de texto con la información de la memoria utilizada por el programa.
     * @return String con la información de memoria.
     */
    public String informacionMemoria() {
        Runtime runtime = Runtime.getRuntime();
        long memoriaUtilizada = runtime.totalMemory();

        return String.format(
                "Tamaño toral del programa: %d bytes\n" +
                        "Tiempo de ejecución: %d",
                memoriaUtilizada,
                runtime.freeMemory()
        );
    }
}
