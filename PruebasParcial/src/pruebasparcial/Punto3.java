
package parcial3;


import java.util.Scanner;

class Nodo2<T> {
    T dato;
    Nodo2<T> anterior;
    Nodo2<T> siguiente;
    
    public Nodo2(T dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}

class ListaDoble<T> {
    Nodo2<T> inicio;
    
    public ListaDoble() {
        inicio = null;
    }
    
    public void insertarPrin(T dato) {
        Nodo2<T> nuevoNodo = new Nodo2<>(dato);
        
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            nuevoNodo.siguiente = inicio;
            inicio.anterior = nuevoNodo;
            inicio = nuevoNodo;
        }
        
        System.out.println("Se ha insertado el elemento " + dato + " al principio de la lista.");
    }
    
    public boolean estaVacia() {
        return (inicio == null);
    }
    
    public boolean buscarNombre(T nombre) {
        if (estaVacia()) {
            return false;
        }
        
        Nodo2<T> actual = inicio;
        
        while (actual != null) {
            if (actual.dato.equals(nombre)) {
                return true;
            }
            
            actual = actual.siguiente;
        }
        
        return false;
    }
    
    public void borrarSegundoNodo() {
        if (estaVacia() || inicio.siguiente == null) {
            System.out.println("La lista no tiene suficientes nodos para borrar el segundo nodo.");
            return;
        }
        
        Nodo2<T> segundoNodo = inicio.siguiente;
        
        if (segundoNodo.siguiente != null) {
            Nodo2<T> tercerNodo = segundoNodo.siguiente;
            inicio.siguiente = tercerNodo;
            tercerNodo.anterior = inicio;
        } else {
            inicio.siguiente = null;
        }
        
        System.out.println("Se ha borrado el segundo nodo de la lista.");
    }
    
    public void mostrarNombresAs() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia. No hay nombres para mostrar.");
            return;
        }
        
        Nodo2<T> actual = inicio;
        
        System.out.println("Nombres en orden ascendente:");
        
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
    
    public void invertirImprimir() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia. No hay elementos para invertir e imprimir.");
            return;
        }
        
        Nodo2<T> actual = inicio;
        
        System.out.println("Datos de la lista invertidos:");
        
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.anterior;
        }
    }
    
    public int contarQuintoNodo() {
        if (estaVacia() || inicio.siguiente == null || inicio.siguiente.siguiente == null || inicio.siguiente.siguiente.siguiente == null || inicio.siguiente.siguiente.siguiente.siguiente == null) {
            System.out.println("La lista no tiene suficientes nodos para contar los caracteres del quinto nodo.");
            return 0;
        }
        
        Nodo2<T> quintoNodo = inicio.siguiente.siguiente.siguiente.siguiente;
        String nombre = quintoNodo.dato.toString();
        int cantidadCaracteres = nombre.length();
        
        System.out.println("El quinto nodo contiene el nombre " + nombre + " que tiene " + cantidadCaracteres + " caracteres.");
        
        return cantidadCaracteres;
    }
}

public class Punto3 {
    public static void main(String[] args) {
        ListaDoble<String> lista = new ListaDoble<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese 10 nombres:");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Nombre " + i + ": ");
            String nombre = scanner.nextLine();
            lista.insertarPrin(nombre);
        }
        
        int opcion = 0;
        
        while (opcion != 7) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insertar un nodo al principio de la lista");
            System.out.println("2. Buscar un nombre en la lista");
            System.out.println("3. Borrar el segundo nodo");
            System.out.println("4. Mostrar los nombres en orden ascendente");
            System.out.println("5. Invertir e imprimir los datos de la lista");
            System.out.println("6. Contar caracteres del quinto nodo");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el nombre a insertar: ");
                    String nombreInsertar = scanner.nextLine();
                    lista.insertarPrin(nombreInsertar);
                }
                case 2 -> {
                    System.out.print("Ingrese el nombre a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    
                    if (lista.buscarNombre(nombreBuscar)) {
                        System.out.println("El nombre " + nombreBuscar + " se encuentra en la lista.");
                    } else {
                        System.out.println("El nombre " + nombreBuscar + " no se encuentra en la lista.");
                    }
                }
                case 3 -> lista.borrarSegundoNodo();
                case 4 -> lista.mostrarNombresAs();
                case 5 -> lista.invertirImprimir();
                case 6 -> lista.contarQuintoNodo();
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida. Intente nuevamente.");
            }
        }
   
    }
}

