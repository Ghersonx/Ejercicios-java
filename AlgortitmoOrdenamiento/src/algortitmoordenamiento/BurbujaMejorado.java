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
public class BurbujaMejorado {
    // Código de llamada e impresión
    public static void main(String args[]) {
        int[] data = {8,5,3,1,2};
        BurbujaMejorado bs = new BurbujaMejorado();
        bs.bubbleSort(data);
        System.out.println("ordenamiento de forma ascendente");
        System.out.println(Arrays.toString(data));
    }

    void bubbleSort(int array[]) {
        int size = array.length;
        // Ejecutar el bucle dos veces: uno para recorrer el Array  y otro para comparaciones
        for (int i = 0; i < size - 1; i++) {
            // Se genera un registro de los intercambios
            boolean swapped = true;
            for (int j = 0; j < size - i - 1; j++) {
                // Para ordenar en orden descendiente cambiar > por <
                if (array[j] > array[j + 1]) {
                    // Intercambio
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = false;
                }
            }

            // Si no ha habido intercambio en la última comparación, entonces el array está ya ordenado.
            if (swapped == true) {
                break;
            }
        }
    }


}
