
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices3D;

import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class SumaArray3D {

    public static void main(String[] args) {
        int fila, columna, i, j;
//ingresar el numero de filas y columnas
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de la matriz");
        fila = in.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz");
        columna = in.nextInt();
        System.out.println("su matrix es de"+fila+"x"+columna);
//initialization of two matrices and sum matrix
        int[][] primeraMatriz = new int[fila][columna];
        int[][] segundaMatriz = new int[fila][columna];
        int[][] sumaMatrices = new int[fila][columna];
//adding elements to first matrix
        System.out.println("ingrese los valores a la primera matriz");
        for (i = 0; i < fila; i++) {
            for (j = 0; j < columna; j++) {
                primeraMatriz[i][j] = in.nextInt();
            }
        }
//adding elements to second matrix
        System.out.println("Enter the elements to be added to the second matrix");
        for (i = 0; i < fila; i++) {
            for (j = 0; j < columna; j++) {
                segundaMatriz[i][j] = in.nextInt();
            }
        }
//sum of the two matrices
        for (i = 0; i < fila; i++) {
            for (j = 0; j < columna; j++) {
                sumaMatrices[i][j] = primeraMatriz[i][j] + segundaMatriz[i][j];
            }
        }
        System.out.println("la suma de las dos matrices es: ");
//printing the sum matrix
        for (i = 0; i < fila; i++) {
            for (j = 0; j < columna; j++) {
                System.out.print(sumaMatrices[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

