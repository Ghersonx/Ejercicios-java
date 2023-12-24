package talle_recursividad;

import java.util.Scanner;

public class ejercicio_7 {

    public static void main(String[] args) {
        /*/7.Leer dos números enteros y calcular el máximo común divisor(M.C.D. ),de dos números enteros (M,N)
         utilizando el algoritmo de Euclides.
         Si M >= N una función recursiva para MCD es
         MCD = M si N =0
         MCD = MCD (N, M % N) si N <> 0/*/
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println(" ingrese un numero ");
        m = sc.nextInt();
        System.out.println(" ingrese otro numero");
        n = sc.nextInt();
        System.out.println(" el mcd es  " + mcd(m, n));
    }

    public static int mcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {

            return mcd(n, m % n);
        }

    }

}
