/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MergeSort;

/**
 *
 * @author Dell G15 Ryzen
 */
public class MergeSort {

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int arr[] = {5, 26, 12, 6, 1, 4, 7};
        int n = arr.length;

        System.out.println("Arreglo original:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("Arreglo ordenado:");
        mergeSort.sort(arr, 0, n - 1);
        mergeSort.printArray(arr);

    }

    public void sort(int arr[], int izq, int der) {
        if (izq < der) {
            //Encuentra el punto medio del vector.
            int mitad = (izq + der) / 2;

            //Divide la primera y segunda mitad (llamada recursiva).
            sort(arr, izq, mitad);
            sort(arr, mitad + 1, der);

            //Une las mitades.
            merge(arr, izq, mitad, der);
        }
    }

    public void merge(int arr[], int izq, int mitad, int der) {
        //Encuentra el tamaño de los sub-vectores para unirlos.
        int n1 = mitad - izq + 1;
        int n2 = der - mitad;

        //arreglos temporales.
        int izqArreglo[] = new int[n1];
        int derArreglo[] = new int[n2];

        //Copia los datos a los arreglos temporales.
        for (int i = 0; i < n1; i++) {
            izqArreglo[i] = arr[izq + i];
        }
        for (int j = 0; j < n2; j++) {
            derArreglo[j] = arr[mitad + j + 1];
        }
        /* Une los vectorestemporales. */

        //Índices inicial del primer y segundo sub-arreglo.
        int i = 0, j = 0;

        //Índice inicial del sub-arreglo arr[].
        int k = izq;

        //Ordenamiento.
        while (i < n1 && j < n2) {
            if (izqArreglo[i] <= derArreglo[j]) {
                arr[k] = izqArreglo[i];
                i++;
            } else {
                arr[k] = derArreglo[j];
                j++;
            }
            k++;
        }//Fin del while.

        /* Si quedan elementos por ordenar */
        //Copiar los elementos restantes de izquierdaArreglo[].
        while (i < n1) {
            arr[k] = izqArreglo[i];
            i++;
            k++;
        }
        //Copiar los elementos restantes de derechaArreglo[].
        while (j < n2) {
            arr[k] = derArreglo[j];
            j++;
            k++;
        }
    }

    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
