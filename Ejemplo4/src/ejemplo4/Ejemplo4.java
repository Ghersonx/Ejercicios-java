/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo4;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz2D = new int[3][4];
        // visitar cada fila
        for (int fila = 0; fila < matriz2D.length; fila++) {
            // cada columna para una fila dada
            for (int columna = 0; columna < matriz2D[fila].length; columna++) {
                // almacenar el numero de fila y columna
                matriz2D[fila][columna] = fila + columna;
            }
        }
        //imprimir el resultado for each
        for (int[] temp : matriz2D) {
            for (int val : temp) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
}
