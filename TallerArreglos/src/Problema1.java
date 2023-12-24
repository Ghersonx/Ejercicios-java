/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell G15 Ryzen
 */
public class Problema1 {

    /*2.Inicializar por programa un arreglo con los 100 primeros números pares e imprimirlo
            a)	En una sola línea.
            b)	En 10 líneas indicando el número de línea*/

    public static void main(String[] args) {
        int pares[] = new int[100];
        System.out.println("Arreglo creado para 100 números pares");
        int i;
        int contador = 0;

        for (i = 0; i <= 200; i++) {
            if (i % 2 == 0 && i != 0) {
                pares[contador] = i;
                contador = contador + 1;
            }
        }
        for (int pare : pares) {
            System.out.printf(" " + pare);
        }

        System.out.println("Impresion en varias líneas");
        int linea = 1;
        contador = 0;
        for (i = 0; i < pares.length; i++) {
            if (i == 0) {
                System.out.print("numero de linea: " + linea + " " + "10 numeros: ");
                System.out.print(pares[i] + "-");
                contador = contador + 1;
            }

            if (contador < 10 && i > 0) {
                System.out.print(pares[i] + "-");
                contador = contador + 1;
            }

            if (contador == 10 && i < pares.length) {
                System.out.println("");
                linea = linea + 1;
                contador = 0;
                System.out.print("numero de linea: " + linea + " " + "10 numeros: ");
            }

        }

    }
}
