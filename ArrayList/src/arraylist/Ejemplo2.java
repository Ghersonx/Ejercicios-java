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
public class Ejemplo2 {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Ana");
        nombres.add("Luisa");
        nombres.add("Felipe");
        System.out.println(nombres); // [Ana, Luisa, Felipe]
        nombres.add(1, "Pablo");
        System.out.println(nombres); // [Ana, Pablo, Luisa, Felipe]                                                       
        nombres.remove(0);
        System.out.println(nombres); // [Pablo, Luisa, Felipe]
        nombres.set(0, "Alfonso");
        System.out.println(nombres+"\n"); // [Alfonso, Luisa, Felipe]  
        
        String s = nombres.get(1);
        System.out.println(s);
        String ultimo = nombres.get(nombres.size() - 1);
        System.out.println(s + " " + ultimo);  // Luisa Felipe
    }

}
