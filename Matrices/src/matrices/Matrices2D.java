/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author Dell G15 Ryzen
 */
import java.util.*;
public class Matrices2D {

    public static void main(String[] args) {
        
        int[][] arreglo2Ddirecto = {
                                {1, 3, 4},
                                {9, 8, 6},
                                {2, 0, 5}
                             };
        for(int[] temp : arreglo2Ddirecto){
            for(int val : temp){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    
        
        // 2D array with 3 rows and 4 columns
        int[][] arreglo2D = new int[3][4];
        // visiting each row
        for (int row = 0; row < arreglo2D.length; row++) {
            // each column for given row
            for (int col = 0; col < arreglo2D[row].length; col++) {
                // storing row number + column number
                arreglo2D[row][col] = row + col;
            }
        }
        // printing resultant array
        for (int[] temp : arreglo2D) {
            for (int val : temp) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        
        // 2D array to store characters
        char[][] CharacterArray = new char[2][4];
        // First row stores JAVA in capital letters
        CharacterArray[0][0] = 'J';
        CharacterArray[0][1] = 'A';
        CharacterArray[0][2] = 'V';
        CharacterArray[0][3] = 'A';
        //second-row stores java in small letters
        CharacterArray[1][0] = 'j';
        CharacterArray[1][1] = 'a';
        CharacterArray[1][2] = 'v';
        CharacterArray[1][3] = 'a';
        System.out.println(
                "Printing 2D array using Arrays.deepToString() method: ");
        // deepToString() method converts the 2D array to string as printed in the
        // output.
        System.out.println(Arrays.deepToString(CharacterArray));
    
    }
}
