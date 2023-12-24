/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuickSort;

import java.util.Arrays;

/**
 *
 * @author Dell G15 Ryzen
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] a = {9, 2, 4, 7, 3, 7, 10};
        System.out.println("Arreglo Desordenado "+Arrays.toString(a));

        int izq = 0;
        int der = a.length - 1;

        quickSort(a, izq, der);
        System.out.println("Arreglo Ordenado "+Arrays.toString(a));
    }

    public static void quickSort(int[] arr, int izq, int der) {
        if (arr == null || arr.length == 0) {
            return;
        }
        if (izq >= der) {
            return;
        }
        // Elegir el pivote
        int mitad = izq + (der - izq) / 2;
        int pivote = arr[mitad];

        // Hacer pivote izquierdo <pivote y derecha>

        int i = izq, j = der;
        while (i <= j) {
            while (arr[i] < pivote) {
                i++;
            }
            while (arr[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        // ordenar recursivamente dos subpartes
        if (izq < j) {
            quickSort(arr, izq, j);
        }
        if (der > i) {
            quickSort(arr, i, der);
        }
    }
}
