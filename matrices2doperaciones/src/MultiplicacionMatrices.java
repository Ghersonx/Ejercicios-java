/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell G15 Ryzen
 */
public class MultiplicacionMatrices {
    public static void main(String[] args) {
        int[][] array1 ={{1,2,1},{3,4,1}};
        int[][] array2 ={{2,3},{4,1},{8,3}};
        
        int fila1 =array1.length;
        int fila2 =array2.length;
        int columna1= array1[0].length;
        int columna2= array2[0].length;
        
        if (fila2 != columna1 ) {
            System.out.println("no se puede realizar la operacion");
        } else {
            int[][] multiplicar =new int [fila1][columna2];
            
            for (int i = 0; i < fila1; i++) {
                for (int j = 0; j <  columna2; j++) {
                    for (int k = 0; k < fila2; k++) {
                        multiplicar[i][j] += array1[i][k] * array2[k][j];
                    }
                }
                
            }
            for (int[] temp : multiplicar) {
                for (int cal : temp) {
                    System.out.println(cal+"");
                }
                System.out.println();
            }
        }
        
    }
}
