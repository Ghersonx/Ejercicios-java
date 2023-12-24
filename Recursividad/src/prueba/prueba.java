/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class prueba {

   static Scanner input = new Scanner(System.in);
    static int[][] matriz;
    static int sw = 0;
    static int total = 0;

    public static void main(String[] args) {
        //Cree una matriz de tamaño mXn y sume  los elementos de la matriz.
        System.out.print("Ingrese el numero de filas: ");
        int fila = input.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int col = input.nextInt();
        matriz = new int[fila][col];
        int i = 0, j = 0;
        matriz = llenar_matriz(i, j, fila, col);
        // reiniciamos las variables
        sw = 0;

        for (int[] fila1 : matriz) {
            for (int col2 : fila1) {
                System.out.println("valores: " + col2);
            }
        }
        // se deja filas en -1 ya que generaria un error de out of bounds, lo cual no dejaria correr el programa, y ya dentro de las filas ya se suma uno para que pase y vaya un
        // número adelante esto genera que cuando i llegue a 2 no pase por la condicion y no se genere el error.
        // esto tambien se puede generar en la condicion de i < filas en la linea 43
        System.out.println("Suma: " + sumarMatriz(i, j, fila-1, col));

    }

    public static int sumarMatriz(int i, int j, int filas, int columnas) {
        if (j < columnas) {
            total += matriz[i][j];
            return sumarMatriz(i, j + 1, filas, columnas);

        }
        
        if (i < filas) {

            return sumarMatriz(i + 1, 0, filas, columnas);
        }

        return total;
    }

    public static int[][] llenar_matriz(int i, int j, int filas, int columnas) {
        Scanner teclado = new Scanner(System.in);

        if (sw == 0) {
            if (i < filas) {

                if (j < columnas) {

                    System.out.println("digite numero de posicion " + " " + i + " " + j);
                    matriz[i][j] = teclado.nextInt(); // la puta madreeeeeeee >.< 

                    llenar_matriz(i, j + 1, filas, columnas);

                }

                if (j == columnas) {

                    llenar_matriz(i + 1, 0, filas, columnas);
                }
            } else {
                System.out.println("matriz llenada satisfactoriamente");
                sw = 1;
            }
        }
        return matriz;

    }

}
