/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talle_recursividad;

import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el valor de n:");
        int n = entrada.nextInt();
        System.out.println(sumatoria(n));

    }

    public static int sumatoria(int n) {
        if (n == 1) {
            return 1;
        } else if (n > 1) {
            return n + sumatoria(n - 1);
        } else {
            return 0;
        }
    }

}
