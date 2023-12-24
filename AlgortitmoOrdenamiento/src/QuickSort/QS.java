/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuickSort;

import java.util.Random;

/**
 *
 * @author Dell G15 Ryzen
 */
public class QS {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arreglo = new int[10];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt(100);
        }

        System.out.println("Arreglo desordenado:");
        printArray(arreglo);

        quicksort(arreglo, 0, arreglo.length - 1);

        System.out.println("\nArreglo ordenado:");
        printArray(arreglo);
    }

    private static void quicksort(int[] array, int indiceBajo, int indiceAlto) {

        if (indiceBajo >= indiceAlto) {
            return;
        }
        int pivote = array[indiceAlto];
        //swap(a, pivote, indiceAlto);
        int izq = indiceBajo;
        int der = indiceAlto;
        while (izq < der) {
            while (array[izq] <= pivote && izq < der) {
                izq++;
            }
            while (array[der] >= pivote && der < izq) {
                der--;
            }
            swap(array, izq, der);
        }
        swap(array, izq, indiceAlto);

        quicksort(array, indiceBajo, izq - 1);
        quicksort(array, izq + 1, indiceAlto);

    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
    }

}
