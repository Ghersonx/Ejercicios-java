/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IngenieriaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class ArrylistPersona {
    public static void main(String[] args) {
        ArrayList<Persona> p = new ArrayList();
        Scanner leer = new Scanner(System.in);
        Persona auxp;
        int i;
        auxp = new Persona("Andres", 47, 3178538234L);
        p.add(auxp);
        
        //System.out.println("Nombre: "+p.get(0)+ "Edad: "+p.get(1)+ "Telfono: " +p.get(2));
        p.add(new Persona("Pedro", 20, 31785383232L));
        p.add(new Persona("Luis", 30, 31785383232L));
        p.add(new Persona("Carlos", 40, 31785383232L));
        
        for (i = 0;i < p.size();i++) {
            System.out.printf("\nNombre :%s %6s Edad :%d telefono :%5d",
                    i, p.get(i).nombre, p.get(i).edad, p.get(i).telefono);
        }
        
        
    }
}
