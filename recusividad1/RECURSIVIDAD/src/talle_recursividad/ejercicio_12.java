package talle_recursividad;

import java.util.Scanner;

public class ejercicio_12 {

    public static void main(String[] args) {
        //12. Cree una matriz de tamaño mXn y sume  los elementos de la matriz.
        Scanner sc = new Scanner(System.in);
        int n, m, i, j = 0;
        System.out.println(" filas ");
        n = sc.nextInt();
        System.out.println("columnas ");
        m = sc.nextInt();
        int[][] matriz;
        matriz = new int[n][m];
        System.out.println(" ingresa los valores ");

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println(" matriz n*m: ");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[0].length; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
        //System.out.println("la suma de los valores es: " + suma(matriz[i][j],m-1,n-1));

    }

    int suma(int fila, int col, int orden, int mat[][]) {

        if (fila == 0 && col == 0) {
            return mat[0][0];
        } else if (col < 0) {
            return suma(fila - 1, orden, orden, mat);
        } else {
            return mat[fila][col] + suma(fila, col - 1, orden, mat);
        }

    }

}
