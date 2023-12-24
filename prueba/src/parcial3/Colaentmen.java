/* Escribe un programa para crear una estructura de datos tipo COLA DE DATOS ENTEROS. Su programa debe mostrar un menu de opciones para operar 
estructura de datos de la cola desde teclado. Las opciones del menu deben incluir
a) añadie elementos
b) eliminar elementos
c) mostrar el numero de elementos
d) encontrar un elemento
e) imprimir todos los elementos
f) Mostrar numeros impares de la cola
g)Mostrar numeros primos de la cola
*/
import java.util.Scanner;

public class Colaentmen {
    public static void main(String[] args) {
        final int MAX_ELEMENTOS = 100; // Máximo número de elementos en la cola
        int[] cola = new int[MAX_ELEMENTOS];
        int inicio = 0; // Índice del primer elemento en la cola
        int fin = 0; // Índice del próximo espacio disponible en la cola
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar el menú de opciones al usuario
            System.out.println("1. Añadir elementos");
            System.out.println("2. Eliminar elementos");
            System.out.println("3. Mostrar número de elementos");
            System.out.println("4. Encontrar un elemento");
            System.out.println("5. Imprimir todos los elementos");
            System.out.println("6. Mostrar números impares de la cola");
            System.out.println("7. Mostrar números primos de la cola");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                // Añadir elemento a la cola
                if (fin < MAX_ELEMENTOS) {
                    System.out.print("Ingrese el elemento a añadir: ");
                    int elemento = scanner.nextInt();
                    cola[fin] = elemento;
                    fin++;
                    System.out.println("Elemento añadido a la cola.");
                } else {
                    System.out.println("La cola está llena. No se pueden añadir más elementos.");
                }
            } else if (opcion == 2) {
                // Eliminar elemento de la cola
                if (inicio < fin) {
                    int eEliminado = cola[inicio];
                    inicio++;
                    System.out.println("Elemento eliminado de la cola: " + eEliminado);
                } else {
                    System.out.println("La cola está vacía.");
                }
            } else if (opcion == 3) {
                // Mostrar número de elementos en la cola
                System.out.println("Número de elementos en la cola: " + (fin - inicio));
            } else if (opcion == 4) {
                // Encontrar un elemento en la cola
                System.out.print("Ingrese el elemento a buscar: ");
                int eBuscar = scanner.nextInt();
                boolean encontrado = false;
                for (int i = inicio; i < fin; i++) {
                    if (cola[i] == eBuscar) {
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) {
                    System.out.println("El elemento " + eBuscar + " se encuentra en la cola.");
                } else {
                    System.out.println("El elemento " + eBuscar + " no se encuentra en la cola.");
                }
            } else if (opcion == 5) {
                // Imprimir todos los elementos de la cola
                System.out.print("Elementos en la cola: ");
                for (int i = inicio; i < fin; i++) {
                    System.out.print(cola[i] + " ");
                }
                System.out.println();
            } else if (opcion == 6) {
                // Mostrar números impares en la cola
                System.out.println("Números impares en la cola:");
                for (int i = inicio; i < fin; i++) {
                    if (cola[i] % 2 != 0) {
                        System.out.println(cola[i]);
                    }
                }
            } else if (opcion == 7) {
                // Mostrar números primos en la cola
                System.out.println("Números primos en la cola:");
                for (int i = inicio; i < fin; i++) {
                    boolean esPrimo = true;
                    int num = cola[i];
                    if (num <= 1) {
                        esPrimo = false;
                    } else {
                        for (int j = 2; j < num; j++) {
                            if (num % j == 0) {
                                esPrimo = false;
                                break;
                            }
                        }
                    }
                    if (esPrimo) {
                        System.out.println(num);
                    }
                }
            } else if (opcion == 8) {
                // Salir del programa
                System.out.println("Nos vemos");
                break;
            } 
        }
    }
}
