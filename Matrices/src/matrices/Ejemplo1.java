/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        int i, j;
        int[][] m = {{2, 4, 3}, {6, 8, 2}, {10, 12,0 },{12,23,6}};
        int filas = m.length;
        int columna = m[0].length;
        System.out.println("Impresion de la matriz inicializada directamente!");
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columna; j++) {
                System.out.printf("%5d", m[i][j]);
            }
            System.out.println();
        }

    }

}
