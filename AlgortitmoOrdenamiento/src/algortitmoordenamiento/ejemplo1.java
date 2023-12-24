/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algortitmoordenamiento;

import java.util.Random;

/**
 *
 * @author Dell G15 Ryzen
 */
public class ejemplo1 {

    public static void main(String[] args) {
        Random r = new Random();
        int aux = 0;
        int[] a = new int[1000];
        //inicializo el arreglo

        System.out.println("ingreso los numero aleatorios al arreglo");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
            System.out.printf("%3d", a[i]);
        }
        System.out.println("");
        System.out.println("el metodo ordenado es: ");
        //metodo burbuja del arreglo
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }

            }
        }//fin de la comparacion
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%3d", a[i]);
        }

    }
}
