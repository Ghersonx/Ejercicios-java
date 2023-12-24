/*Inicializar una lista simplemente enlazada circular con n numeros enteros solicitados desde teclado y:
 a) Solicitar un dato para buscarlo en la lista. Si lo encuentra imprima la posicion donde se encuentra, sino imprima el mensaje No encontrado.
 b) Retirar un elemento de la lista pedido por el usuario
 c) Imprimir la lista desde un dato determinado dado por el usuario
 d) Calcular e imprimr la factorial de cada uno de los elementos de la lista
 e) Calcular la suma de los digitos de cada uno de los elementos de la lista
 f) Imprimir en orden decendente
 */
import java.util.Scanner;

class Nodo {
    int dato;
    Nodo siguiente;
// Constructor de Nodo
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
//Se crea la lista enlazada
class ListaEnlazadaCircular {
    private Nodo cabeza;

    public ListaEnlazadaCircular() {
        this.cabeza = null;
    }
 // Verifica si la lista está vacía
    public boolean estaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }
//mete un dato nuevo
    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        }
    }
//busca un dato y dice la pisicion del mismo
    public void buscar(int clave) {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        int posicion = 1;
        boolean encontrado = false;

        do {
            if (actual.dato == clave) {
                System.out.println("Encontrado en la posición " + posicion);
                encontrado = true;
                break;
            }
            actual = actual.siguiente;
            posicion++;
        } while (actual != cabeza);

        if (!encontrado) {
            System.out.println("No encontrado");
        }
    }
//Se crea la opcion de eliminar
    public void eliminar(int clave) {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        Nodo anterior = null;
        boolean encontrado = false;

        do {
            if (actual.dato == clave) {
                if (anterior != null) {
                    anterior.siguiente = actual.siguiente;
                } else {
                    while (actual.siguiente != cabeza) {
                        actual = actual.siguiente;
                    }
                    actual.siguiente = cabeza.siguiente;
                    cabeza = cabeza.siguiente;
                }
                System.out.println("Elemento eliminado: " + clave);
                encontrado = true;
                break;
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != cabeza);

        if (!encontrado) {
            System.out.println("Elemento no encontrado.");
        }
    }
//se crea la opcionde imprimr desde el dato que se desea
    public void imprimirDesde(int dato) {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        boolean encontrado = false;

        do {
            if (actual.dato == dato) {
                System.out.println("Lista desde el elemento " + dato + " en adelante:");
                encontrado = true;
                break;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        if (!encontrado) {
            System.out.println("El elemento dado no se encuentra en la lista.");
            return;
        }

        do {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println();
    }
//Se define como calcular un factorial
    public int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
//se calcula factorial 
    public void calcularFactorial() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;

        do {
            int factorial = factorial(actual.dato);
            System.out.println("Factorial de " + actual.dato + ": " + factorial);
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    public int calcularSumaDigitos(int num) {
        int sumaDigitos = 0;
        while (num != 0) {
            sumaDigitos += num % 10;
            num /= 10;
        }
        return sumaDigitos;
    }

    public void calcularSumaDigitos() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;

        do {
            int sumaDigitos = calcularSumaDigitos(actual.dato);
            System.out.println("Suma de dígitos de " + actual.dato + ": " + sumaDigitos);
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}
//se crea la clase y se llaman los metodos creados anteriormente, no me acuerdo de los nombres exactos asi que espero no este mal o en su defecto se entiendo que quise decir XD
public class Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEnlazadaCircular lista = new ListaEnlazadaCircular();

        System.out.print("Ingrese la cantidad de números que desea ingresar: ");
        int n = scanner.nextInt();
        //se lee el numero que se ingreso 
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número (que no sea superior a 11 ya que sino es demasiado grande su factorial): ");
            int numero = scanner.nextInt();
            lista.insertar(numero);
        }

        System.out.print("Ingrese un número para buscar en la lista: ");
        int numeroBuscar = scanner.nextInt();
        lista.buscar(numeroBuscar);

        System.out.print("Ingrese el número que desea eliminar de la lista: ");
        int numeroEliminar = scanner.nextInt();
        lista.eliminar(numeroEliminar);

        System.out.print("Ingrese el número desde donde desea imprimir la lista: ");
        int numeroImprimir = scanner.nextInt();
        lista.imprimirDesde(numeroImprimir);

        lista.calcularFactorial();
        lista.calcularSumaDigitos();

        scanner.close();
    }
}

