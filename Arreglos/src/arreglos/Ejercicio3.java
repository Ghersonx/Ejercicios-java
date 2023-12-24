/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        float[] arregloNumeros = new float[10];
        Scanner leerNumero = new Scanner(System.in);
        int i;
        float sumanNumeros;
        //inicializacion del arreglo
        for (i = 0; i < arregloNumeros.length; i++) {
            System.out.print("Elemento No " + (i + 1) + " => ");
            arregloNumeros[i] = leerNumero.nextFloat();
        }
        System.out.println("Arreglo inicializado!!");
        //impresion del arreglo 
        System.out.println("Los valores del arreglo son:\n");
        for (i = 0; i < arregloNumeros.length; i++) {
            System.out.print("\nElemento [" + i + "] => " + arregloNumeros[i]);
        }

        System.out.println("\n\nCalculo de la suma y del promedio!");

        for (i = 0, sumanNumeros = 0; i < arregloNumeros.length; i++) // .length =>tamaño del arreglo
        {
            sumanNumeros = sumanNumeros + arregloNumeros[i];
        }
        System.out.print("La suma de los elementos es: " + sumanNumeros);
        System.out.printf("\nEl promedio de valores es: %.2f ", (sumanNumeros / arregloNumeros.length));

    }

}
