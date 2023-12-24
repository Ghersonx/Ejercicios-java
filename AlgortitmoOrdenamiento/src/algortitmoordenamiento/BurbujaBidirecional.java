/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algortitmoordenamiento;

import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class BurbujaBidirecional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BurbujaBidirecional ord = new BurbujaBidirecional();
        System.out.print("Cuantos numeros desea registrar ? ");
        int n = sc.nextInt();
        int[] datos = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese numero de la posicion " + (i + 1) + " : ");
            datos[i] = sc.nextInt();
        }
        ord.Ordenacion(datos);
    }

    public void Ordenacion(int[] datos){
         
         int derecha = 0;
         int izquierda =0;
         
         while(derecha<=izquierda)
         {
             for (int i = izquierda; i < derecha; i--) {
                 if(datos[i] < datos[i-1]){
                     int temp = datos[i];
                     datos[i]= datos[i-1];
                     datos [i-1] = temp;
                 }
             }
             derecha++;
             
             for (int i = derecha; i < izquierda; i++) {
                 if(datos[i] > datos[i-1]){
                     int temp = datos[i];
                     datos[i]= datos[i+1];
                     datos [i+1] = temp;
                 }
             }
             izquierda--;
         }
         Mostrar(datos);
    }
    public void Mostrar(int[] datos){
        System.out.println("Datos ordenados");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(" "+datos[i]);
        }
        System.out.println("");
    }
}