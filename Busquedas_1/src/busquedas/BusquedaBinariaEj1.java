/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class BusquedaBinariaEj1 {

    public static void main(String[] args) {
        Random r = new Random();

        int[] a = new int[20];
        //inicializo el arreglo

        System.out.println("Ingreso los numero aleatorios al arreglo");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
            System.out.printf("%5d", a[i]);
        }

        //inicio la busqueda de los elementos
        System.out.println("");
        System.out.println("Ingrese el número a buscar en el arreglo");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        
        //OJO!!!la variable i llega con un valor hay que ponerlo en cero de nuevo si no tira que no esta en la posición
        int pos = 0, sw = 0, i=0;
        while (i < a.length && sw == 0) {
            if (a[i] == n) {
                sw = 1;
                pos = i;
            }
            i++;
        }//fin while
        if (sw == 1) {
            System.out.println("El número " + n + " se encuentra en la posición " + pos);
        } else {
            System.out.println("El número no se encuentra en el arreglo");
        }//fin if else

    }//

}
