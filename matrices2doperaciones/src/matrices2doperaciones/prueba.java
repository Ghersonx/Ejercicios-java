/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices2doperaciones;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell G15 Ryzen
 */
public class prueba {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

//        variables
        int m, n;

//        pide por teclado numero de filas y columnas
        System.out.println("Digite el numero de filas ");
        m = leer.nextInt();

        System.out.println("Digite el numero de columnas ");
        n = leer.nextInt();

//        creacion de la matriz
        int[][] valores = new int[m][n];

//        ciclo iterativo donde se le dan valores aleatorios a la matriz
        for (int i = 0; i < m; i++) {

            System.out.println("");
            for (int j = 0; j < n; j++) {

                valores[i][j] = (int) (Math.random() * (50 + 1));

                System.out.println("matriz [" + i + "] " + "[" + j + "]" + "= " + valores[i][j]);

            }
        }

//        variables
        int fila = 0, columna = 0;

        fila = m;
        columna = n;

        System.out.println("\nVertices de la matriz \n");

//        nos dara siemrpe el primer verice
        System.out.println("vertice #1 [" + 0 + "]" + "[" + 0 + "]=" + valores[0][0]);
//        nos dara siemrpe el verice superior derecho       
        System.out.println("vertice #2 [" + 0 + "]" + "[" + (columna - 1) + "]=" + valores[0][columna - 1]);
//        nos dara siemrpe el verice inferior izquierdo            
        System.out.println("vertice #3 [" + (fila - 1) + "]" + "[" + 0 + "]=" + valores[fila - 1][0]);
        //        nos dara siemrpe el verice inferior derecho        
        System.out.println("vertice #4= [" + (fila - 1) + "]" + "[" + (columna - 1) + "]=" + valores[fila - 1][columna - 1]);

    }
}
