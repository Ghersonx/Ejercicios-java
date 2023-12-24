/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices3D;

/**
 *
 * @author Dell G15 Ryzen
 */
public class multiplicacion {

    public static void main(String[] args) {
        int[][] array1 = {
            {1, 2, 1}, {3, 4, 1}};   // declaring array1
        int[][] array2 = {
            {2, 3}, {4, 1}, {8, 3}};    // declaring array2
        // rows and columns of arrays respectively
        int row1 = array1.length, row2 = array2.length, col1 = array1[0].length, col2 = array2[0].length;

        // Check if multiplication is Possible 
        if (row2 != col1) {
            System.out.println("number of rows of array1 is not equal to the number of columns of array2");
        } else {
            int[][] arrayAns = new int[row1][col2]; // ans array

            // Multiplying the two matrices
            for (int i = 0; i < row1; i++) { // row of array1
                for (int j = 0; j < col2; j++) { // column of array 2
                    for (int k = 0; k < row2; k++) {
                        arrayAns[i][j] += array1[i][k] * array2[k][j];
                    }
                }
            }
            // printing the resultant array
            for (int[] temp : arrayAns) {
                for (int val : temp) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }

    }
}
