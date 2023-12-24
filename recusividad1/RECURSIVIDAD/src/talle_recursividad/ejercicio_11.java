package talle_recursividad;

import java.util.Scanner;

public class ejercicio_11 {

    public static void main(String[] args) {
        //11. Leer n valores enteros, almacenarlos en un arreglo y realizar la suma de los elementos del vector.
        Scanner sc = new Scanner(System.in);
        int n, m = 0, i;

        System.out.println("Ingrese el tamaño del arreglo ");
        n = sc.nextInt();
        
        int[] a = new int[n];

        System.out.println("ingresar valores");

        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(" el arreglo queda asi: ");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

        System.out.println("la suma de los valores es: " + suma_vectores(a, n - 1));
    }

    public static int suma_vectores(int[] a, int n) {
        if (n == 0) {
            return a[n];
        } else {
            return a[n] + suma_vectores(a, n - 1);
        }
    }

}
