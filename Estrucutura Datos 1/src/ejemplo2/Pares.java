/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Pares {
    public static void main(String[] args) {

 
        int i, cont = 2;

        int[] pares = new int[20];

        //Llenamos el array con números pares. Utilizamos un contador
        //con valor inicial 2 y le sumamos dos en cada iteración.
        for (i = 0; i < pares.length; i++) {
            pares[i] = cont;
            cont += 2;
        }
         
        //Mostrar el array
        for (i = 0; i < pares.length; i++) {
            System.out.print("\t"+ pares[i]+"\n-");
        }
    }
}
