/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Ejercicio4 {

    public static void main(String args[])  {
        
        int[] arreglo;
        arreglo = new int[100];
        int contador = 0;
        for (int i = 0; i <= 200; i++) {
            if (i % 2 == 0 && i != 0) {
                arreglo[contador] = i;
                contador = contador + 1;
            }
        }
        System.out.println("Impresion en una sola linea");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(" "+ arreglo[i]);

        }
        System.out.println(" ");
        
        
        System.out.println("Los 100 primeros numeros pares en 10 lineas");
        contador = 0;
        int linea = 1;
        
        for (int i = 0; i < arreglo.length; i++) {
            if (i == 0) {
                System.out.print("numero de linea: " + linea + " " + "10 numeros: ");
                System.out.print(arreglo[i] + "-");
                contador = contador + 1;
            }

            if (contador < 10 && i > 0) {
                System.out.print(arreglo[i] + "-");
                contador = contador + 1;
            }        
            
            if (contador == 10 && i < arreglo.length) {
                System.out.println("");
                linea = linea + 1;
                contador = 0;
                System.out.print("numero de linea: " + linea + " " + "10 numeros: ");
            }
            

        }
    }

}
