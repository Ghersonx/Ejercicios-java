package talle_recursividad;

import java.util.Scanner;

public class ejercicio_5 {

    public static void main(String[] args) {
        //5. Leer  un numero entero y  calcular la sumatoria hasta el numero leído.
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el limite del numero a sumar");
        n = sc.nextInt();
        System.out.println("La Sumatoria hasta " + n + " es: " + sumatoria(n));
    }

    static int sumatoria(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n+sumatoria(n - 1));
        }
    }
}
