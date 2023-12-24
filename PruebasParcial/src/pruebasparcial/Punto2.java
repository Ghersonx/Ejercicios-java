package parcial3;


import java.util.Scanner;

class ListaCircular {
    Nodo inicio;
    
    public ListaCircular() {
        inicio = null;
    }
    
    public void insertarElemento(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        
        if (inicio == null) {
            inicio = nuevoNodo;
            nuevoNodo.siguiente = inicio;
        } else {
            Nodo actual = inicio;
            
            while (actual.siguiente != inicio) {
                actual = actual.siguiente;
            }
            
            actual.siguiente = nuevoNodo;
            nuevoNodo.siguiente = inicio;
        }
        
        System.out.println("Se ha insertado el elemento " + dato + " en la lista.");
    }
    
    public boolean estaVacia() {
        return (inicio == null);
    }
    
    public int contarElementos() {
        if (estaVacia()) {
            return 0;
        }
        
        int contador = 0;
        Nodo actual = inicio;
        
        do {
            contador++;
            actual = actual.siguiente;
        } while (actual != inicio);
        
        return contador;
    }
    
    public int buscarDato(int dato) {
        if (estaVacia()) {
            return -1;
        }
        
        Nodo actual = inicio;
        int posicion = 0;
        
        do {
            if (actual.dato == dato) {
                return posicion;
            }
            
            actual = actual.siguiente;
            posicion++;
        } while (actual != inicio);
        
        return -1;
    }
    
    public void retirarElemento(int dato) {
        if (estaVacia()) {
            System.out.println("La lista esta vacia. No se puede retirar ningun elemento.");
            return;
        }
        
        Nodo actual = inicio;
        Nodo anterior = null;
        boolean encontrado = false;
        
        do {
            if (actual.dato == dato) {
                encontrado = true;
                break;
            }
            
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != inicio);
        
        if (encontrado) {
            if (anterior != null) {
                anterior.siguiente = actual.siguiente;
            } else {
                Nodo ultimo = inicio;
                
                while (ultimo.siguiente != inicio) {
                    ultimo = ultimo.siguiente;
                }
                
                ultimo.siguiente = actual.siguiente;
                inicio = actual.siguiente;
            }
            
            System.out.println("Se ha retirado el elemento " + dato + " de la lista.");
        } else {
            System.out.println("El elemento " + dato + " no se encuentra en la lista.");
        }
    }
    
    public void imprimirLista(int datoInicio) {
        if (estaVacia()) {
            System.out.println("La lista esta vacia. No hay elementos para imprimir.");
            return;
        }
        
        Nodo actual = inicio;
        boolean encontrado = false;
        
        do {
            if (actual.dato == datoInicio) {
                encontrado = true;
                break;
            }
            
            actual = actual.siguiente;
        } while (actual != inicio);
        
        if (encontrado) {
            System.out.println("Elementos de la lista a partir del dato " + datoInicio + ":");
            
            do {
                System.out.print(actual.dato + " ");
                actual = actual.siguiente;
            } while (actual != inicio);
            
            System.out.println();
        } else {
            System.out.println("El elemento " + datoInicio + " no se encuentra en la lista.");
        }
    }
    
    public double calcularFactorial(double numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        
        int factorial = 1;
        
        for (double i = 2; i <= numero; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
    
    public void imprimirFactorial() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia. No hay elementos para calcular el factorial.");
            return;
        }
        
        Nodo actual = inicio;
        
        do {
            double factorial = calcularFactorial(actual.dato);
            System.out.println("Factorial de " + actual.dato + ": " + factorial);
            actual = actual.siguiente;
        } while (actual != inicio);
    }
    
    public int calcularSuma() {
        if (estaVacia()) {
            return 0;
        }
        
        int suma = 0;
        Nodo actual = inicio;
        
        do {
            suma += actual.dato;
            actual = actual.siguiente;
        } while (actual != inicio);
        
        return suma;
    }
    
    public void imprimirEnOrdenDescendente() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia. No hay elementos para imprimir en orden descendente.");
            return;
        }
        
        int cantidadElementos = contarElementos();
        int[] elementos = new int[cantidadElementos];
        int indice = cantidadElementos - 1;
        Nodo actual = inicio;
        
        do {
            elementos[indice] = actual.dato;
            actual = actual.siguiente;
            indice--;
        } while (actual != inicio);
        
        System.out.println("Elementos de la lista en orden descendente:");
        
        for (int elemento : elementos) {
            System.out.print(elemento + " ");
        }
        
        System.out.println();
    }
}

public class Punto2 {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de numeros a ingresar en la lista: ");
            int cantidadNumeros = scanner.nextInt();
            
            for (int i = 1; i <= cantidadNumeros; i++) {
                System.out.print("Ingrese el numero " + i + ": ");
                int numero = scanner.nextInt();
                lista.insertarElemento(numero);
            }
            
            int opcion = 0;
            
            while (opcion != 7) {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Buscar un dato en la lista");
                System.out.println("2. Retirar un elemento de la lista");
                System.out.println("3. Imprimir la lista desde un dato determinado");
                System.out.println("4. Calcular e imprimir el factorial de cada elemento");
                System.out.println("5. Calcular la suma de los numeros");
                System.out.println("6. Imprimir en orden descendente");
                System.out.println("7. Salir");
                System.out.print("Seleccione una opcion: ");
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el dato a buscar: ");
                        int datoBuscar = scanner.nextInt();
                        int posicion = lista.buscarDato(datoBuscar);
                        
                        if (posicion != -1) {
                            System.out.println("El dato " + datoBuscar + " se encuentra en la posicion " + posicion);
                        } else {
                            System.out.println("El dato " + datoBuscar + " no se encuentra en la lista.");
                        }
                    }
                    case 2 -> {
                        System.out.print("Ingrese el elemento a retirar: ");
                        int elementoRetirar = scanner.nextInt();
                        lista.retirarElemento(elementoRetirar);
                    }
                    case 3 -> {
                        System.out.print("Ingrese el dato desde donde imprimir la lista: ");
                        int datoInicio = scanner.nextInt();
                        lista.imprimirLista(datoInicio);
                    }
                    case 4 -> lista.imprimirFactorial();
                    case 5 -> {
                        int suma = lista.calcularSuma();
                        System.out.println("La suma de los numeros de la lista es: " + suma);
                    }
                    case 6 -> lista.imprimirEnOrdenDescendente();
                    case 7 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion invalida. Intente nuevamente.");
                }
            }
        }
    }
}

