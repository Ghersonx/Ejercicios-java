/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices3D;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Impresion3D {
    public static void main(String[] args) {
         int[][][] arr = { { { 1, 2 }, { 3, 4 } },
                        { { 5, 6 }, { 7, 8 } } };
 
        for (int i = 0; i < 2; i++) {
 
            for (int j = 0; j < 2; j++) {
 
                for (int k = 0; k < 2; k++) {
 
                    System.out.print(arr[i][j][k] + " ");
                }
 
                System.out.println();
            }
            System.out.println();
        }
    }
}
