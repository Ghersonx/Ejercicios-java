/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algortitmoordenamiento;

import java.util.Arrays;

/**
 *
 * @author Dell G15 Ryzen
 */
public class BurbujaSimple {
    // Código de llamada e imprimir en pantalla
    public static void main(String args[]) {
        int[] data = {8,5,3,1,2};
        System.out.println("Arreglo desordenado");//imprimir arreglo desordenado
        System.out.println(Arrays.toString(data));

        BurbujaSimple bs = new BurbujaSimple();
        bs.ordenaBurbuja(data);
        System.out.println("Arreglo ordenado con burbuja"); //Arreglo ordenado
        System.out.println(Arrays.toString(data));
    }

    void ordenaBurbuja(int array[]) {
        int size = array.length;
        // ejecutar el bucle dos veces, uno para recorrer el array y otro para hacer la comparación
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) // Orden ascencente. Para descendente en esta línea cambiar > a <
            {
                if (array[j] > array[j + 1]) {
                    // intercambiar posicione
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
