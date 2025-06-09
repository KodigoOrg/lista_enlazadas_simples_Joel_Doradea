// Clase que representa un nodo de la lista enlazada simple
public class Nodo {
    // Valor entero almacenado en el nodo
    private int dato;
    // Referencia al siguiente nodo en la lista
    private Nodo siguiente;

    /**
     * Constructor del nodo.
     * @param dato Valor entero que se almacenará en el nodo.
     */
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    /**
     * Obtiene el valor almacenado en el nodo.
     * @return El valor entero del nodo.
     */
    public int getDato() {
        return dato;
    }

    /**
     * Establece el valor del nodo.
     * @param dato Nuevo valor entero para el nodo.
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * Obtiene la referencia al siguiente nodo.
     * @return El siguiente nodo en la lista.
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Establece la referencia al siguiente nodo.
     * @param siguiente Nodo que será el siguiente en la lista.
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

