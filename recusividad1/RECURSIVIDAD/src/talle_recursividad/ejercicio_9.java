package talle_recursividad;

import java.util.Scanner;

public class ejercicio_9 {

    public static void main(String[] args) {
        //9. Leer 2 numeros enteros y calcular el cociente de la división entera.(sugerencia:use restas sucesivas)
        
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print(" ingrese el dividendo ");
        n = sc.nextInt();
        System.out.print(" ingrese el divisor ");
        m = sc.nextInt();
        System.out.print(" la division de " + n + " / " + m + " = " + division(n, m));

    }

    public static int division(int n, int m) {
        if (m > n) {
            return 0;
        } else {
            return division(n - m, m)+1;
        }
    }

}
