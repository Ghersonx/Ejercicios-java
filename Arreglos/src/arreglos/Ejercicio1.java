/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author Dell G15 Ryzen
 * cinco números ingresan a un arreglo
 * imprimir arreglo recorro con un FOR
 * concardeno el valor de i al imprimir
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int [] enteros = {2,3,5,7,11,13,17,19,23,29};
        System.out.println("Valores del arreglo iniciado directamente");
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Valor [" + i + "]"+ " " + enteros[i]);
            
        }
    }
    
}
