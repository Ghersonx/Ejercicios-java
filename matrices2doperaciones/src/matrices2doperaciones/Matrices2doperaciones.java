/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices2doperaciones;

import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Matrices2doperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //obtener datos desde el teclado 
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la fila");
        int fila = sc.nextInt();
        System.out.println("Ingrese el tamaño de la columnas");
        int columna = sc.nextInt();
        System.out.println("La matriz tiene un tamaño de:" +fila+"x"+ columna);
        
        //creo las variables e instancio
        int[][] primeraMatriz =new int[fila][columna];
        int[][] segundaMatriz = new int [fila][columna];
        int[][] sumaMatriz = new int [fila][columna];
        
        //lleno las matrices de la primera matriz
        System.out.println("ingrese los elementos de la primera matriz");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                primeraMatriz[i][j]= sc.nextInt();
            }
        }
        
        //lleno las matrices de la segunda matriz
        System.out.println("ingrese los elementos de la segunda matriz");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                segundaMatriz[i][j]= sc.nextInt();
            }
        }
        
        //realizo la suma de las dos matrices
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                sumaMatriz[i][j]= primeraMatriz[i][j]+segundaMatriz[i][j];
            }
        }
        //imprimir la suma de las matrices
        System.out.println("la sumatoria de las  matrices es:");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(sumaMatriz[i][j]+ "\t");
            }
            System.out.println("");
        }
        
    }
        
    
}
