/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author Dell G15 Ryzen
 */
public class InicializarMatrices {

    public static void main(String[] args) {

        int[][] arr = new int[10][20];
        arr[0][0] = 1;

        System.out.println("arr[0][0] = " + arr[0][0]);

        int[][] arr1 = {{1, 2}, {3, 4}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr1[i][j]);
            }
        }

        int[][] NumArrays = new int[5][];

        NumArrays[0] = new int[]{1, 2, 3, 4};
        NumArrays[1] = new int[]{5, 6, 7, 8};
        NumArrays[2] = new int[]{9, 10, 11, 12};
        NumArrays[3] = new int[]{13, 14, 15, 16};
        NumArrays[4] = new int[]{17, 18, 19, 20};

        for (int[] array : NumArrays) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // create a 2d array
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6, 9},
            {7},};

        // calculate the length of each row
        System.out.println(
                "tamaño del arreglo 1: " + a[0].length);
        System.out.println(
                "tamaño del arreglo 2: " + a[1].length);
        System.out.println(
                "tamaño del arreglo 3 " + a[2].length);

        for (int[] array : a) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
