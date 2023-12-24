package talle_recursividad;

import java.util.Scanner;

public class ejercicio_14 {

    public static void main(String[] args) {
        /*/La función de Ackerman se define como:
         Ackerman(m, n) = n + 1   si m = 0
         Ackerman(m, n) = Ackerman(m - 1, 1) si m > 0 y n = 0
         Ackerman(m, n) = Ackerman(m - 1, Ackerman(m, n - 1))  si m > 0 y n > 0
        
         Ej.  Si se tiene  Ackermann(1, 2) = 4;	 Ackermann(3, 2) = 29
         Realice un programa para encontrar el valor de lfuncion de Ackerman, para dos valores enteros m,n.
         /*/
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("\n ingrese el primer valor ");
        n = sc.nextInt();
        System.out.print("\n ingrese el segundo valor ");
        m = sc.nextInt();
        System.out.print("\nel valor de la funcion es " + ack(m,n));
        System.out.println("");
        System.out.println("eso es todo");
    }
    //cambiar de int a long para que no moleste el return
    static long ack(long m, long n) {
        if (m == 0) 
            return n + 1;
         else if (n == 0) 
            return (ack(m - 1, 1));
        else 
         return (ack(m-1, ack(m, n-1)));   
        
    }

}
