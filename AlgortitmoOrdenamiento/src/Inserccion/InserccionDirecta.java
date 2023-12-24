/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inserccion;

import java.util.Random;

/**
 *
 * @author Dell G15 Ryzen
 */
public class InserccionDirecta {

    public static void main(String[] args) {
        Random r = new Random();
        int temp = 0, j = 0;
        int[] a = new int[20];
        //inicializo el arreglo

        System.out.println("Ingreso los numero aleatorios al arreglo");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10);
            System.out.printf("%2d", a[i]);
        }
        System.out.println("");
        System.out.println("el metodo ordenado es: ");
        //ordenamiento por inserccion 
        for (int i = 0; i < a.length ; i++) {
            //temp es el numero de elemento que se va a ir comparando
            temp = a[i];
            for (j = i-1; j >= 0 && a[j] > temp; j--) {
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }

        //fin metodo ordenamineto por insercion
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%2d", a[i]);
        }
        System.out.println("");
        
        /*for (int i = 0; i < a.length; i++) {
            int pos = 1;
            temp = a[i];
            while((pos>0) && (a[pos-1]>temp)){
                a[pos] = a[pos-1];
                pos--;
            }
            a[pos]=temp;
            
        }
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%2d", a[i]);
        }
        System.out.println("");
       */

    }
}
