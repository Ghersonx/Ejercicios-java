/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices3D;

/**
 *
 * @author Dell G15 Ryzen
 */
public class multiplicacionMatrices {

    static int N = 4;
// multiply matrices a and b, and then stores the result in c

    static void mul(int a[][],int b[][], int c[][]) {
        int i, j, k;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                c[i][j] = 0;
                for (k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[k][j]; //multiply a and b matrices
                }
            }
        }
    }
//main method

    public static void main(String[] args) {
        int a[][] = {{9, 7, 2, 3},{9, 7, 2, 3},{4, 13, 32, 2},{9, 7, 2, 3}};
        int b[][] = {{9, 7, 2, 3}, {9, 7, 2, 3},{9, 7, 2, 3},{4, 13, 32, 2}};
// Store the result in c
        int c[][] = new int[N][N];
        int i, j;
        mul(a, b, c); //calling the mul method
        System.out.println("Multiplication result matrix" + " is ");
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
