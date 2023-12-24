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
public class addArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ann");
        names.add("Cindy");
        
        System.out.println(names);
        
        names.add(1,"Bob");
        names.remove(0);
        names.set(0, "Bill");
        System.out.println(names);
        String name =names.get(0);
        System.out.println(name);
        String last =names.get(names.size()-1);
        System.out.println(last);
            
                
 
    }
}
