/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        int i, j, t, s,c;
        Scanner leer = new Scanner(System.in);
        System.out.println("1.Solicitud del tamaño de la matriz!");
        System.out.println("Digite el tamaño para filas!");
        t = leer.nextInt();
        System.out.println("Digite el tamaño paracolumnas!");
        c = leer.nextInt();
        int[][] m = new int[t][c];
        System.out.println("1. Inicializacion de la matriz con los valores!");

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m.length; j++) {
                System.out.print("Digite elemento No  m[" + i + "]" + "[" + j + "] ");
                m[i][j] = leer.nextInt();
            }
        }

        System.out.println("\n2.Impresion de la matriz para mostrar su contenido por filas!");
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m.length; j++) {
                System.out.printf("%5d", m[i][j]);
            }
            System.out.println();  //Deja una línea entre filas
        }

        System.out.print("\n3.Sumatoria de los elementos de la diagonal principal de la matriz");
        for (i = 0, s = 0; i < m.length; i++) {
            for (j = 0; j < m.length; j++) {
                if (i == j) {
                    s = s + m[i][i];
                }
            }
        }
        System.out.printf("\nSumatoria de los elementos de la diagonal = %10d", s);

       
    }

}
