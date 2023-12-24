
package parcial3;

import java.util.Scanner;



class Cola {
    Nodo frente;
    Nodo fin;
    
    public Cola() {
        this.frente = null;
        this.fin = null;
    }
    
    public boolean estaVacia() {
        return (frente == null);
    }
    
    public void añadirElemento(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        
        if (estaVacia()) {
            frente = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
        
        System.out.println("Se ha añadido el elemento " + dato + " a la cola.");
    }
    
    public void eliminarElemento() {
        if (estaVacia()) {
            System.out.println("La cola esta vacia. No se puede eliminar ningun elemento.");
        } else {
            int datoEliminado = frente.dato;
            frente = frente.siguiente;
            
            if (frente == null) {
                fin = null;
            }
            
            System.out.println("Se ha eliminado el elemento " + datoEliminado + " de la cola.");
        }
    }
    
    public void mostrarElementos() {
        if (estaVacia()) {
            System.out.println("La cola esta vacia. No hay elementos para mostrar.");
        } else {
            Nodo actual = frente;
            System.out.println("Elementos en la cola:");
            
            while (actual != null) {
                System.out.print(actual.dato + " ");
                actual = actual.siguiente;
            }
            
            System.out.println();
        }
    }
    
    public boolean encontrarElemento(int elemento) {
        if (estaVacia()) {
            return false;
        }
        
        Nodo actual = frente;
        
        while (actual != null) {
            if (actual.dato == elemento) {
                return true;
            }
            
            actual = actual.siguiente;
        }
        
        return false;
    }
    
    public void imprimirElementos() {
        if (estaVacia()) {
            System.out.println("La cola esta vacia. No hay elementos para imprimir.");
        } else {
            Nodo actual = frente;
            
            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
    }
    
    public void mostrarNumerosImpares() {
        if (estaVacia()) {
            System.out.println("La cola está vacia. No hay elementos para mostrar.");
        } else {
            Nodo actual = frente;
            System.out.println("Numeros impares en la cola:");
            
            while (actual != null) {
                if (actual.dato % 2 != 0) {
                    System.out.print(actual.dato + " ");
                }
                
                actual = actual.siguiente;
            }
            
            System.out.println();
        }
    }
    
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public void mostrarNumerosPrimos() {
        if (estaVacia()) {
            System.out.println("La cola esta vacia. No hay elementos para mostrar.");
        } else {
            Nodo actual = frente;
            System.out.println("Numeros primos en la cola:");
            
            while (actual != null) {
                if (esPrimo(actual.dato)) {
                    System.out.print(actual.dato + " ");
                }
                
                actual = actual.siguiente;
            }
            
            System.out.println();
        }
    }
}

public class Punto1 {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 8) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Añadir elementos");
            System.out.println("2. Eliminar elementos");
            System.out.println("3. Mostrar elementos");
            System.out.println("4. Encontrar elementos");
            System.out.println("5. Imprimir elementos");
            System.out.println("6. Mostrar numeros impares");
            System.out.println("7. Mostrar numeros primos");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el elemento a añadir: ");
                    int elemento = scanner.nextInt();
                    cola.añadirElemento(elemento);
                }
                case 2 -> cola.eliminarElemento();
                case 3 -> cola.mostrarElementos();
                case 4 -> {
                    System.out.print("Ingrese el elemento a buscar: ");
                    int elementoBuscar = scanner.nextInt();
                    boolean encontrado = cola.encontrarElemento(elementoBuscar);
                    
                    if (encontrado) {
                        System.out.println("El elemento " + elementoBuscar + " esta en la cola.");
                    } else {
                        System.out.println("El elemento " + elementoBuscar + " no esta en la cola.");
                    }
                }
                case 5 -> cola.imprimirElementos();
                case 6 -> cola.mostrarNumerosImpares();
                case 7 -> cola.mostrarNumerosPrimos();
                case 8 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida. Intente nuevamente.");
            }
        }
        
        
    }
}
  
    

