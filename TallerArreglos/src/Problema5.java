
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Dell G15 Ryzen
 */
public class Problema5 {

    /*
    6.	Leer n valores enteros, almacénelos en un arreglo e inviértalo. 
    Imprima el arreglo antes y después de invertirlo. Es decir, si se 
    leen por ejemplo los valores: 1    4     7    20,
    el vector resultante debe ser 20   7     4     1. 
     */
    public static void main(String[] args) {
        System.out.println("hola");
        int n = 0;
        Scanner leerDato = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo:");
        n = leerDato.nextInt();
        int enteros[] = new int[n];
        System.out.println("el arreglo es tiene un tamaño de: " + n);

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Ingresar los valores del arreglo");
            enteros[i] = leerDato.nextInt();
        }
        for (int i = 0; i < enteros.length; i++) {
            System.out.print(" " + enteros[i]);
        }
        System.out.println(" ");
        System.out.println("Numeros invertidos:");
        int invertir[] = new int[n];
        
        for (int i = 0; i < invertir.length; i++) {
            invertir[i]= enteros[enteros.length-1-i];            
        }
        enteros = invertir;
        
        for (int i = 0; i < enteros.length; i++) {
            System.out.print(" "+enteros[i]);
        }
       /* System.out.println(""+enteros.length);
        System.out.println(enteros.length-1);
        System.out.println(enteros.length-2);*/
        

    }
}
