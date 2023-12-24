package talle_recursividad;

import java.util.Scanner;

public class ejercicio_2 {

    public static void main(String[] args) {
        //2.Leer un numero entero e invertirlo. Ejemplo: Entrada: 123 Salida: 321
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero a invertir");
        n = sc.nextInt();
        invertido(n);
        
    }

    public static void invertido(int n) {
        System.out.print(n % 10);
        if (n / 10 != 0) {
            invertido(n / 10);
        }
        
    }

}
