/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Arrays;

/**
 *
 * @author Dell G15 Ryzen
 */
public class ImpresionMatriz2D {

    public static void main(String[] args) {
        int[][] matrizIrregular = new int[4][];
        // array1 with 6 columns
        int[] array1 = {3, 6, 8, 1, 0, 9};
        // empty array2
        int[] array2 = {};
        // array3 with 4 columns
        int[] array3 = {90, 86, 71, 55};
        // array4 with 2 columns
        int[] array4 = {12, 6};
        // adding all the arrays to jaggedArray
        matrizIrregular[0] = array1;
        matrizIrregular[1] = array2;
        matrizIrregular[2] = array3;
        matrizIrregular[3] = array4;

        // printing jaggedArray using deepToString method
        System.out.println(Arrays.deepToString(matrizIrregular));
        System.out.println(matrizIrregular.length);

        for (int[] i : matrizIrregular) {
            for (int j : i) {
                System.out.print("[" + j + "]");
            }
            System.out.println("");
        }
                        
    }
}