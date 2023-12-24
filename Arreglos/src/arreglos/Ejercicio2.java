/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author Dell G15 Ryzen
 *
 */
//import java.util.Arrays;
// 100 enteros pares validar los pares con salto de 2 en
// 2 en el FOR imprimir en una sola linea en 10 lineas o sea 5 lineas
public class Ejercicio2 {

    public static void main(String[] args) {
        int[] par = new int[100];// Se puede hacer esto?? int par[]= new int[10];
        int numeroPar, i;//se declaran las variables numero par,i(indice) y número de linea
        System.out.println("Inicializacion del Arreglo !!");
        //inicializacion del arreglo con los 100 primeros pares
        for (i = 0, numeroPar = 2; i < 200; i++, numeroPar += 2) {
            par[i] = numeroPar;
        }
        System.out.println("Arreglo inicializado!!");

        System.out.println("Impresion del Arreglo en una sola linea!");
        //impresion del arreglo
        for (i = 0; i < par.length/2; i++) //par.length =>tamaño del arreglo
        {
            //codigo para colocar el numero de lineas
           System.out.print(par[i] + "  "); 
        }  
     
        
    }
}
