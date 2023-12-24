package talle_recursividad;

import java.util.Scanner;

public class ejercicio_1 {

    public static void main(String[] args) {
        //1.Leer un numero entero y n calcular el factorial de dicho numero.
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("ingrese el limite del factorial ");
        n = leer.nextInt();
        System.out.println("el factorial de " + n + " es: " + factorial(n));
        //se imprime en la funcion principal el valor retronado

    }

    static long factorial(int n) {
        if (n == 0) {
            return 1;//hasta que se llega a cero=0
        } else {
            return (factorial(n - 1) * n);//retrono un valor a la funcion principal
        }

    }

}
