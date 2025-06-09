// Clase principal para demostrar el uso de la lista enlazada simple
public class Main {

    public static void main(String[] args) {
        // Se crea una nueva lista enlazada simple
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        System.out.println("Demostración de una lista enlazada simple");

        // Se verifica si la lista está vacía
        System.out.println("¿Es una lista vacía? " + lista.esListaVacia());

        // Se insertan elementos al inicio de la lista
        lista.insetarAlInicio(5);
        lista.insetarAlInicio(50);
        lista.insetarAlInicio(100);

        // Se inserta un elemento al final de la lista
        lista.insertarAlFinal(20);
        // Se elimina un elemento específico
        lista.eliminar(50);
        // Se elimina el primer elemento de la lista
        lista.eliminarAlInicio();
        System.out.println();
        // Se busca si existen ciertos valores en la lista
        System.out.println("¿Existe el número 5? "+ lista.buscar(5));
        System.out.println("Existe el número 50? "+ lista.buscar(50));
        System.out.println();
        // Se muestra el tamaño de la lista y la información de memoria
        System.out.println("Tamaño de la lista: " +lista.tamanio());
        System.out.println("Informe de memoria: "+  lista.informacionMemoria());
        System.out.println();

        // Se imprime el contenido de la lista
        lista.imprimir();

    }
}