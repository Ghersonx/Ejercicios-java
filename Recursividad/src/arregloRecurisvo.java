/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell G15 Ryzen
 */
public class arregloRecurisvo {

    public static void main(String[] args) {
        int[] numeros = {6, 5, -9999, 10, 2, -10, 6};

        System.out.println("Maximo v1: " + maximoRec(numeros, 0, numeros[0]));

       // System.out.println("Maximo v2: " + maximoRecV2(numeros, 0));

       System.out.println("Minimo v1: " + minimoRec(numeros, 0, numeros[0]));

       // System.out.println("Minimo v2: " + minimoRecV2(numeros, 0));

    }

    static int maximoRec(int[] numeros, int indice, int max) {

        //Cuando el indice sea igual a la longitud del array, terminaremos la recursividad
        if (indice != numeros.length) {

            //Si el valor actual es mayor que el actual, lo llamaremos de forma distinta
            if (numeros[indice] > max) {
                max = maximoRec(numeros, indice + 1, numeros[indice]);
            } else {
                max = maximoRec(numeros, indice + 1, max);
            }

        }

        return max;

    }
    static int minimoRec(int[] numeros,int indice, int min){
        if (indice != numeros.length) {
            if (numeros[indice] < min) {
                min = minimoRec(numeros, indice + 1, numeros[indice]); 
            }else{
                min = minimoRec(numeros, indice + 1 , min);
            }
        }
        return min;
    }
}
