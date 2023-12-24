
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell G15 Ryzen
 */
public class Problema6 {
    /*7. Leer n números enteros, almacenarlos en un arreglo y calcular la factorial 
    de cada número leído, el cual se debe guardar en otro arreglo. 
    Imprima el arreglo de los números iniciales y el de las factoriales.*/
    public static void main(String[] args) {
        int n = 0;
        Scanner leerDato = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo");
        n = leerDato.nextInt();
        
        int enteros [];
        enteros = new int[n];
        
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("ingrese el valor: ");
            enteros[i] = leerDato.nextInt();
        }
        
        
        
        
               
    }
}
