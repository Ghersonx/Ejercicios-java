package talle_recursividad;

import java.util.Scanner;

public class ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el valor de n:");
        float n = entrada.nextFloat();
        System.out.println(sumaFraccionarios(n));

    }

    public static double sumaFraccionarios(float n) {
        if (n == 1) {
            return n;
        } else {
            return 1 / n + sumaFraccionarios(n - 1);
        }
    }

}
