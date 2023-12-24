/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Transpuesta {
    public static void main(String[] args) {
        int A[][] = {{51, 21, 33, 49},
                     {12, 22, 34, 84},
                     {19, 21, 23, 44},
                     {13, 15, 02, 10}};
        
        int filas = A.length;
        int columnas = A[0].length;
        
        int B[][] = new int[A[0].length][A.length];
        
        int i,j;
        
        for(i=0;i<A.length;i++){
            for(j=0;j<A[0].length;j++){
                B[j][i] = A[i][j];
            }
        }
        
        for(i=0;i<B.length;i++){
            for(j=0;j<B[0].length;j++){
                System.out.print(" "+B[i][j]+" ");
            }
            System.out.println("");
        }
    
    }
            
}
