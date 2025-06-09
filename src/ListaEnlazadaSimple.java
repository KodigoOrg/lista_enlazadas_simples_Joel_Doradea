// Clase que representa una lista enlazada simple de enteros
// Cada nodo apunta al siguiente, formando una cadena de nodos
public class ListaEnlazadaSimple {
    // Referencia al primer nodo de la lista
    private Nodo cabeza;

    /**
     * Constructor de la lista enlazada simple.
     * Inicializa la cabeza en null, indicando que la lista está vacía.
     */
    public ListaEnlazadaSimple() {
        this.cabeza = cabeza;
    }

    /**
     * Verifica si la lista está vacía.
     * @return true si la lista no tiene nodos, false en caso contrario.
     */
    public boolean esListaVacia() {
        if(cabeza == null) {
            return true;
        }
        return false;
    }

    /**
     * Inserta un nuevo nodo al inicio de la lista.
     * @param dato El valor entero a insertar.
     */
    public void insetarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
    }

    /**
     * Elimina el nodo al inicio de la lista.
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
     * Inserta un nuevo nodo al final de la lista.
     * @param dato El valor entero a insertar.
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
        actual.setSiguiente(nuevoNodo);
    }

    /**
     * Elimina el primer nodo que contenga el dato especificado.
     * @param dato El valor entero a eliminar.
     * @return true si el nodo fue eliminado, false si no se encontró.
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
     * Calcula la cantidad de nodos en la lista.
     * @return El número de nodos en la lista.
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
     * Imprime el contenido de la lista enlazada en consola.
     * Si la lista está vacía, lo indica.
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
     * Busca si existe un nodo con el valor especificado.
     * @param obj El valor entero a buscar.
     * @return true si se encuentra, false en caso contrario.
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
     * Devuelve información sobre la memoria utilizada por el programa.
     * @return String con la información de memoria.
     */
    public String informacionMemoria() {
        Runtime runtime = Runtime.getRuntime();
        long memoriaUtilizada = runtime.totalMemory();
        return String.format(
                "Tamaño total del programa: %d bytes\n" +
                        "Tiempo de ejecución: %d",
                memoriaUtilizada,
                runtime.freeMemory()
        );
    }
}
