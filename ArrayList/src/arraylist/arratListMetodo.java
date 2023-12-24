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
public class arratListMetodo {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Ana");
        nombres.add("Luisa");
        nombres.add("Felipe");
        nombres.add("Pablo");
        System.out.println(nombres);
        nombres = invertir(nombres);
        System.out.println(nombres);
    }
    public static ArrayList<String> invertir(ArrayList<String> nombres) {                             
        // Crea una lista para el resultado del método
        ArrayList<String> resultado = new ArrayList();
        // Recorre la lista de nombres en orden inverso
        for (int i = nombres.size() - 1; i >= 0; i--) {                                                           
             // Añade cada nombre al resultado
              resultado.add(nombres.get(i));
        }
        return resultado;
    }
}
