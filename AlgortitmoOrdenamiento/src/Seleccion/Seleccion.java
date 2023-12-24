/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seleccion;

import java.util.Random;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Seleccion {

    public static void main(String[] args) {
        Random r = new Random();
        int temp = 0, menor = 0, pos;
        int[] a = new int[20];
        //inicializo el arreglo
        //ingreso los elementos aleatorios al arreglo 
        System.out.println("Ingreso los numero aleatorios al arreglo");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10);
            System.out.printf("%2d", a[i]);
        }
        System.out.println("");
        System.out.println("el metodo ordenado es: ");

        //metodo seleccion del arreglo
        for (int i = 0; i < a.length - 1; i++) {
            menor = i;// declaro el primer elemento como un menor en posicion 0
            for (int j = i + 1; j < a.length; j++) {
                //hago la misma comparacion pero sobre la posicion no sobre el otro vector
                if (a[j] < a[menor]) {// REALIZO LA COMPARACION DEL NUEVO 
                    menor = j;//encuentro el nuevo menor
                }
            }//FIN DEL FOR DE J
            temp = a[i];//ASIGNO EL NUEVO MENOR  
            a[i] = a[menor];//LA POSICION MENOR 
            a[menor] = temp;// EL NUEVO MENOR COMO POSICION
        }//FIN DEL IF DE COMPARACION

        for (int i = 0; i < a.length; i++) {
            System.out.printf("%2d", a[i]);
        }

    }
}
