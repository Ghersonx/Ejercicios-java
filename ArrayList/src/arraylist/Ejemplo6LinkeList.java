/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Ejemplo6LinkeList {

    public static void main(String[] args) {
        ArrayList nombres = new ArrayList();
        System.out.println("Elementos al inicio: " + nombres.size());
        nombres.add("Ana");
        nombres.add("Bea");
        nombres.add("Dalia");
        nombres.add("Pedro");
        nombres.add("Bea");  //comprobar que admite duplicados
 
        System.out.println("Contenido: " + nombres);
        System.out.println("Elementos: " + nombres.size());
        System.out.println(nombres.contains("Ana"));
 
        nombres.remove("Ana"); //eliminamos un elemento
 
        System.out.println("Contenido: " + nombres);
        System.out.println("Elementos: " + nombres.size());
        System.out.println(nombres.contains("Ana"));
 
        nombres.add(3, "Ana"); //Añadir en posicion x
        System.out.println("Contenido: " + nombres);
 
        System.out.println("SubLista(1,4):" + nombres.subList(1,4));
    
        
        
        System.out.println("-------------------------------");
        LinkedList nombres2 = new LinkedList();
        nombres2.add("Ana");
        nombres2.add("Maria");
        nombres2.add("Pedro");
        nombres2.addFirst("Elena"); //insertamos al ppio.
        nombres2.addLast("Bea"); //insertamos al final.
        nombres2.add(2, "Lola"); //insertamos en posicion x

        System.out.println("\nContenido: " + nombres2);
        System.out.println("getFirst(): " + nombres2.getFirst());
        System.out.println("getLast(): " + nombres2.getLast());

        System.out.println("\nHacemos peek(): " + nombres2.peek());
        System.out.println("Contenido: " + nombres2);

        System.out.println("\nHacemos poll(): " + nombres2.poll());
        System.out.println("Contenido: " + nombres2);

        System.out.println("\nHacemos offer(): " + nombres2.offer("Luis"));
        System.out.println("Contenido: " + nombres2);

    }

}
