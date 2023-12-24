/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShellSort;

import java.util.Arrays;

/**
 *
 * @author Dell G15 Ryzen
 */
public class ShellSort {

    public static void main(String[] args) {
        int arrayEntrada[] = {321, 123, 213, 234, 1, 4, 5, 6};// Este es el array de elementos que vamos a ordenar 
        System.out.println("Arreglo desordenado " + Arrays.toString(arrayEntrada));

        shellSort(arrayEntrada);// llamada al metodo shellSort 
        System.out.println("Arreglo Ordenado " + Arrays.toString(arrayEntrada));
    }//fin del main 

    public static void shellSort(int a[]) {
        for (int salto = a.length / 2; salto > 0; salto /= 2) {
            for (int i = salto; i < a.length; i++) {
                int tmp;                
                if (a[i - salto] > a[i]) {       // y si están desordenados
                    tmp = a[i];                  // se reordenan
                    a[i] = a[i - salto];
                    a[i - salto] = tmp;

                }
            }
        }
    }
}
