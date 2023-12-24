
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Dell G15 Ryzen
 */
public class MatrizRecursiva {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner leer = new Scanner(System.in);
        int f, c;
        System.out.println("ingrese filas");
        f = leer.nextInt();
        System.out.println("ingrese columnas");
        c = leer.nextInt();
        int[][] numeros = new int[f][c];
        for (int i = 0; i < f; i++) {
            System.out.println("");
            for (int j = 0; j < c; j++) {

                numeros[i][j] = (int) (Math.random() * (50 + 1));

                System.out.println("matriz [" + i + "] " + "[" + j + "]" + "= " + numeros[i][j]);

            }
        }

        int mayor = numeros[0][0], menor = numeros[0][0]; // suponemos que ambos están en la primer posición

        // Recorremos la matriz
        for (int x = 0; x < numeros.length; x++) {
            for (int y = 0; y < numeros[x].length; y++) {
                int numeroActual = numeros[x][y];
                if (numeroActual > mayor) {
                    mayor = numeroActual;
                }
                if (numeroActual < menor) {
                    menor = numeroActual;
                }
            }
        }
        System.out.printf("Sin recursividad el mayor es %d y el menor es %d", mayor, menor);
        System.out.println("");

        System.out.println("Con recursividad maximo "+ maximoRec(numeros, c, c, mayor));
        System.out.println("Con recursividad minimo "+ minimoRec(numeros, c, c, menor));
    }
    static int maximoRec(int[][]numeros,int indiceX, int indiceY, int max){
        if (indiceX != numeros.length && indiceY != numeros.length) {
            if (numeros[indiceX][indiceY] > max) {
                max = maximoRec(numeros, indiceX+1, indiceY+1, numeros[indiceX][indiceY]);
            }else{
                max = maximoRec(numeros, indiceX+1, indiceY+1 , max);
            }
        }
     return max;
    }
    static int minimoRec(int[][]numeros,int indiceX, int indiceY, int min){
        if (indiceX != numeros.length && indiceY != numeros.length) {
            if (numeros[indiceX][indiceY] < min) {
                min = maximoRec(numeros, indiceX+1, indiceY+1, numeros[indiceX][indiceY]);
            }else{
                min = maximoRec(numeros, indiceX+1, indiceY+1 , min);
            }
        }
     return min;
    }
    
    

}
