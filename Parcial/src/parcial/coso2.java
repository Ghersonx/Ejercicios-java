/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell G15 Ryzen
 */
public class coso2 
{
    public static void main(String[] args) {
                    int [][] numeros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9,19}
        };
                                  ;

        System.out.println("Maximo v1: " + maximoRec(numeros, 0, numeros[0][0]));

        System.out.println("Maximo v2: " + maximoRecV2(numeros, 0));

    }

    public static int maximoRec(int[][] numeros, int indice, int max) {

        //Cuando el indice sea igual a la longitud del array, terminaremos la recursividad
        if (indice != numeros.length) {

            //Si el valor actual es mayor que el actual, lo llamaremos de forma distinta
            if (numeros[indice][indice] > max) {
                max = maximoRec(numeros, indice + 1, numeros[indice][indice]);
            } else {
                max = maximoRec(numeros, indice + 1, max);
            }

        }

        return max;

    }
        public static int maximoRecV2(int[][] numeros, int indice) {

        int maximo = Integer.MIN_VALUE;

        if (indice != numeros.length) {

            //no funciona
            maximo = Math.max(numeros[indice][indice], maximoRecV2(numeros, indice + 1));

        }

        return maximo;

    }
}