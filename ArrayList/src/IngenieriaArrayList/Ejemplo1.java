/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IngenieriaArrayList;

import java.util.ArrayList;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Ejemplo1 {
    public static void main(String[] args) {
       ArrayList<String> nombres = new ArrayList();
       
       nombres.add("Ana");
       nombres.add("Luisa");
       nombres.add("Andres");
       nombres.add("Andres");
       nombres.add("Andres");
        System.out.println("EL ArrayLit tiene  los iguientes nombres: " +nombres);
        nombres.add(1,"Felipe");
        System.out.println(""+nombres);
        nombres.remove(0);
        System.out.println(""+nombres);
        nombres.set(0, "Alfonso");
        System.out.println(""+nombres);
        
        String s = nombres.get(1);
        System.out.println(""+s);
        
        String ultimo =nombres.get(nombres.size()-1); 
        System.out.println(""+ultimo);
        
    }
}
