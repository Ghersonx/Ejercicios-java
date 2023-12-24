/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero a leer");
        int n =leer.nextInt();
        for (int i = n; i >=1; i--) {
            System.out.print(i+ " ");
        }
        System.out.print("\n");
        
        
    }
         
}
