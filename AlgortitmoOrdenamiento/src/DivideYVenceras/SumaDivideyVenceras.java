/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DivideYVenceras;

/**
 *
 * @author Dell G15 Ryzen
 */
public class SumaDivideyVenceras {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sumaArrayDyV(0, array.length - 1, array));

    }

    public static int sumaArrayDyV(int inicio, int fin, int[] array) {

        if (inicio >= fin) {
            return array[inicio];
        } else {
            int mitad = (inicio + fin) / 2;

            System.out.println("Inicio: " + inicio);
            System.out.println("Mitad: " + mitad);
            System.out.println("Fin: " + fin);
            System.out.println("");
            
            int x = sumaArrayDyV(inicio, mitad, array);
            int y = sumaArrayDyV(mitad + 1, fin, array);

            System.out.println("X: " + x);
            System.out.println("Y: " + y);
            System.out.println("");

            return x + y;
        }

    }
}
