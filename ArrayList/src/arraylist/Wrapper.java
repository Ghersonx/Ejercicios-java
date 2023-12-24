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
public class Wrapper {
    public static void main(String[] args) {
        double x = 19.95;
        ArrayList<Double> data = new ArrayList<Double>();
        data.add(29.95); //almacenado
        data.add(x);
        
        double y = data.get(0);
        System.out.println(y);
        
    }
    
    

    
}
