/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author Estudiante-pc
 */
public class RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*inicializar 2 arreglos de tamño n y sumar ambos arreglos en una funcion recursiva
        imprima la suma en el Main()
        a1:12345
        a2:98765
        suma=50
         */
        Scanner sc = new Scanner(System.in);
        int n, m = 0, i;

        System.out.println("Ingrese el tamaño del arreglo 1 ");
        n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("ingresar valores");

        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 0; i < a.length; i++) {
            System.out.printf("%5d", a[i]);

        }
        System.out.println("");

        System.out.println("Ingrese el tamaño del arreglo 2 ");
        m = sc.nextInt();

        int[] b = new int[m];

        System.out.println("ingresar valores");

        for (i = 0; i < a.length; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("");

        System.out.println(" el arreglo queda asi: ");
        for (i = 0; i < b.length; i++) {
            System.out.printf("%5d", b[i]);
        }

        System.out.println("la suma de los valores es: " + suma_vectores(a, b, n - 1));
    }

    public static int suma_vectores(int[] a, int[] b, int n) {
        if (n == 0) {
            return a[n] + b[n];
        } else {
            return b[n] + a[n] + suma_vectores(a, b, n - 1);
        }

    }

}
