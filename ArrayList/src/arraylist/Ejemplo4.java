/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Ejemplo4 {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int i;
        //a) Adicionar 6 datos (10,20,…60)  e imprimir la lista.
        a.add(10);//Uso de add para agregar datos
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(60);
        System.out.println("\na.Impresion de los datos iniciales ");
        for (i = 0; i < a.size(); i++) {
            System.out.print("\nElemento No " + i + " = " + a.get(i));
        }

        //b) Adicione 2 valores en la posición 1 (1000) y en la posición 3(2000) e imprima de nuevo.
        a.add(1, 1000);
        a.add(3, 2000);
        System.out.println("\n\nb.Impresion con los datos adicionados en posiciones 1 y 3");
        for (i = 0; i < a.size(); i++)//Uso de size() para conocer el tamaño de la lista
        {
            System.out.print("\nElemento No " + i + "=" + a.get(i));//Usa get()para recuperar datos
        }
        // c) Reemplace 2 valores en las posiciones 0 (5000) y 2 (10000) e imprima.
        a.set(2, 5000);
        a.set(0, 50000);
        System.out.println("\n\nc.Impresion reemplazando valores en posiciones 2 y 0");
        for (i = 0; i < a.size(); i++) {
            System.out.print("\nElemento No " + i + " = " + a.get(i));
        }
        System.out.println(a.contains(i));
        //Realizar los demas ejercicios

    }

}
