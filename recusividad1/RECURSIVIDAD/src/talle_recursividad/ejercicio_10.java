package talle_recursividad;

import java.util.Scanner;

public class ejercicio_10 {

    public static void main(String[] args) {
        //10. Leer 2 numeros enteros y realizar  la multiplicacion de los 2 numeros mediante sumas sucesivas.
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("igrese el primer numero ");
        n = sc.nextInt();
        System.out.println("ingrese el segundo numero ");
        m = sc.nextInt();
        System.out.println(" la multiplicacion de " + n + " x " + m + " = " + multiplicacion(n, m));
    }

    public static int multiplicacion(int n, int m) {
        if (n > 1) {
            return multiplicacion(n - 1, m) + m;
        } else {
            return m;
        }
    }

}
