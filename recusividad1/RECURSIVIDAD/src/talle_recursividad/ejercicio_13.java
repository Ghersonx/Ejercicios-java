package talle_recursividad;

import java.util.Scanner;

public class ejercicio_13 {

    public static void main(String[] args) {
        /*/13. La serie de Fibonacci puede definirse en términos recursivos asi:
         (1) Fib(1) = 1 ; Fib(0) = 0
         (2) Fib(n) = Fib(n-1) + Fib(n-2) si n >= 2.
         Lea un valor entero que representa el limite de la serie e imprimala  hasta el valor limite. 
         /*/

        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println(" ingrese el limite ");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print(fibonaci(i) + " ");
        }
        System.out.println("");
    }

    static int fibonaci(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return fibonaci(numero - 1) + fibonaci(numero - 2);
        }
    }

}
