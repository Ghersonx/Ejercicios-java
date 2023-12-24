/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class BusquedaOrdenadaQS {

    public static void main(String[] args) {
        Random r = new Random();
        int aux = 0, menor = 0, pos, i;
        int[] a = new int[20];
        //inicializo el arreglo
        System.out.println("Ingreso los numero aleatorios al arreglo");
        for (i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
            System.out.printf("%5d", a[i]);
        }
        System.out.println("");
        System.out.println("El metodo ordenado es: ");
        for (i = 0; i < a.length - 1; i++) {
            menor = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[menor]) {
                    menor = j;
                }
            }//FIN DEL PARA DE J
            aux = a[i];
            a[i] = a[menor];
            a[menor] = aux;
        }//FIN DEL IF DE COMPARACION

        for (i = 0; i < a.length; i++) {
            System.out.printf("%5d", a[i]);
        }//arreglo ordenado
        System.out.println("");
        //inicio el metodo de busqueda de un numero 
        System.out.println("ENCONTRAR UN NUMERO CON METODO BINARIO");
        System.out.println("Buscar en el arreglo el numero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inf = 0;
        int sup = a.length - 1;
        int sw = 0;
        do {
            pos = (inf + sup) / 2;
            //System.out.println("el numero a encontrar es " + n);
            if (a[pos] > n) {
                sup = pos - 1;
            } else {
                inf = pos + 1;
            }
            if (a[pos] == n) {
                sw = 1;
            }
        } while (inf <= sup);
        if (sw == 1) {
            System.out.println("El número " + n + " se encuentra en la posición " + pos);
        } else {
            System.out.println("El número no se encuentra en el arreglo");
        }//fin if else

    }
}
