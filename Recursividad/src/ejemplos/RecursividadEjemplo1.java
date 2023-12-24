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
public class RecursividadEjemplo1 {

    public static void main(String[] args) {
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero a leer");
        n = leer.nextInt();        
        descendente(n);
        System.out.print("\n");
    }

    static void descendente (int n) {
        if (n > 0) {
            System.out.print(n+" ");
            descendente(n - 1);
        }
        

    }
}

        
