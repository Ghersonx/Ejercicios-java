/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices3D;

/**
 *
 * @author Dell G15 Ryzen
 */
public class OrdenMayor {

    public static void main(String[] args) {
        double[][] matrix = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8, 8.7, 7.6}, {3.6, 5.7, 7.8}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
        
        for(double[] temp : matrix){
            for(double val : temp){
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }

}
