/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell G15 Ryzen
 */
public class Problema4 {
    /* 5. Inicializar dos arreglos de igual tamaño, uno con los números pares 
        y otro con los números impares, realice la suma de cada uno de los elementos pares 
        e impares y guarde dicha suma en otro arreglo de igual tamaño a los anteriores 
        e imprima el arreglo resultante.*/
        public static void main(String[] args) {
         int pares [] = {2,4,6,8,10,12,14};
         int impares [] = {3,5,7,9,11,13,15};
            for (int i = 0; i < pares.length; i++) {
                System.out.print(" "+ pares[i]);
            }
            System.out.println("");
            for (int i = 0; i < impares.length; i++) {
                System.out.print(" "+ impares[i]);
            }
         int resultado[]= new int[pares.length];
            System.out.println("");
         
            for (int i = 0; i < resultado.length; i++) {
                resultado[i] = pares[i]+impares[i];
                System.out.println(pares[i]+"+"+impares[i]+"="+resultado[i] );
            }
            
    }
    
}
