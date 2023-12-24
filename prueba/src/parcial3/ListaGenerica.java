/*Construir una clase MAIN para administrar una lista generica de 10 nombres doblemente enlazada implementando los siguientes metodos:
 a. insertar un nodo al principio de la lista
 b. Buscar un nombre de la lista pedido por el usuario
 c. Borrar el segundo nodo
 d. Mostrar los nombres ordenados de manera ascendente
 e. Invertir e imorimir los datos de la lista.
 f. Del nodo cinco contar cuantos caracteres posee e imprimir ese tamaño
 */
import java.util.Scanner;

// Definición de la clase Nodo
class Nodo<T> {
    T dato; // Dato almacenado en el nodo
    Nodo<T> siguiente; // Referencia al siguiente nodo
    Nodo<T> anterior; // Referencia al nodo anterior

    // Constructor de Nodo
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}


class ListaDoblementeEnlazada<T> {
    private Nodo<T> cabeza; 

    // Constructor de ListaDoblementeEnlazada
    public ListaDoblementeEnlazada() {
        this.cabeza = null;
    }

    // Verifica si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Inserta un nodo al principio de la lista
    public void insertarAlPrincipio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
        } else {
            // El nuevo nodo se coloca al principio de la lista
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
    }

    // Busca un nombre en la lista
    public void buscar(T nombre) {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo<T> actual = cabeza;
        int posicion = 1;
        boolean encontrado = false;

        while (actual != null) {
            if (actual.dato.equals(nombre)) {
                // Se encontró el nombre en la lista
                System.out.println("Nombre encontrado en la posición " + posicion);
                encontrado = true;
                break;
            }
            actual = actual.siguiente;
            posicion++;
        }

        if (!encontrado) {
            // El nombre no se encontró en la lista
            System.out.println("Nombre no encontrado.");
        }
    }

    // Borra el segundo nodo de la lista
    public void borrarSegundoNodo() {
        if (estaVacia() || cabeza.siguiente == null) {
            // La lista no tiene suficientes nodos para borrar el segundo nodo
            System.out.println("La lista no tiene suficientes nodos.");
            return;
        }

        Nodo<T> segundoNodo = cabeza.siguiente;
        cabeza.siguiente = segundoNodo.siguiente;
        if (segundoNodo.siguiente != null) {
            segundoNodo.siguiente.anterior = cabeza;
        }
        segundoNodo = null;

        System.out.println("Segundo nodo borrado.");
    }

    // Muestra los nombres ordenados de manera ascendente
    public void mostrarOrdenAscendente() {
        if (estaVacia()) {
            // La lista está vacía
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo<T> actual = cabeza;
        while (actual != null) {
            // Se muestra el dato del nodo actual en orden ascendente
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    // Invierte la lista y muestra los nombres invertidos
    public void invertirYMostrar() {
        if (estaVacia()) {
            // La lista está vacía
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo<T> actual = cabeza;
        Nodo<T> ultimo = null;

        while (actual != null) {
            // Se invierte la dirección de los enlaces de los nodos para invertir la lista
            Nodo<T> temp = actual.siguiente;
            actual.siguiente = actual.anterior;
            actual.anterior = temp;
            ultimo = actual;
            actual = temp;
        }

        cabeza = ultimo;

        // Se muestra la lista invertida
        mostrarOrdenAscendente();
    }

    // Cuenta los caracteres del nombre en el quinto nodo de la lista
    public void contarCaracteresEnNodoCinco() {
        if (estaVacia()) {
            // La lista está vacía
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo<T> actual = cabeza;
        int posicion = 1;
        int tamaño = 0;

        while (actual != null) {
            if (posicion == 5) {
                // Se obtiene el nombre en el quinto nodo y se calcula su tamaño
                String nombre = (String) actual.dato;
                tamaño = nombre.length();
                break;
            }
            actual = actual.siguiente;
            posicion++;
        }

        System.out.println("El tamaño del nombre en el nodo cinco es: " + tamaño);
    }
}

// Clase principal Main
public class ListaGenerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDoblementeEnlazada<String> lista = new ListaDoblementeEnlazada<>();

        // Insertar nodos al principio de la lista
        lista.insertarAlPrincipio("Carlos");
        lista.insertarAlPrincipio("Ana");
        lista.insertarAlPrincipio("Juan");
        lista.insertarAlPrincipio("Maria");
        lista.insertarAlPrincipio("Pedro");
        lista.insertarAlPrincipio("Luisa");
        lista.insertarAlPrincipio("Laura");
        lista.insertarAlPrincipio("Diego");
        lista.insertarAlPrincipio("Sara");
        lista.insertarAlPrincipio("Julia");

        System.out.print("Ingrese el nombre que desea buscar: ");
        String nombreBuscar = scanner.nextLine();
        lista.buscar(nombreBuscar);

        lista.borrarSegundoNodo();

        System.out.println("Nombres ordenados de manera ascendente:");
        lista.mostrarOrdenAscendente();

        System.out.println("Nombres invertidos:");
        lista.invertirYMostrar();

        lista.contarCaracteresEnNodoCinco();

        scanner.close();
    }
}

