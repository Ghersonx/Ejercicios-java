/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices3D;

/**
 *
 * @author Dell G15 Ryzen
 */
public class matrices3Ddeclaracion {

    public static void main(String[] args) {
        int[][][] array3D = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int z = 0; z < 2; z++) {
                    System.out.println("arreglo[" + i
                            + "]["
                            + j + "]["
                            + z + "] = "
                            + array3D[i][j][z]);
                }
            }
        }
    }
}

