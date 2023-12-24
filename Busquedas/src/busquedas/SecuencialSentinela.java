/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedas;

/**
 *
 * @author Dell G15 Ryzen
 */
public class SecuencialSentinela {
    public static void main(String[] args) {
        int arreglo[] = {10, 20, 180, 30, 60, 50, 110, 100, 70};
        int tamArr = arreglo.length;
        int numeroBuscar = 180;
        BusquedaSentinela(arreglo, tamArr, numeroBuscar);
    }

    static void BusquedaSentinela(int arreglo[], int tamaArr, int centinela) {
        // Ultimo elemento del arreglo
        int ultimo = arreglo[tamaArr - 1];
        // elemento a buscar
        // se ubica al final del arreglo
        arreglo[tamaArr - 1] = centinela;
        int i = 0;
        while (arreglo[i] != centinela) {
            i++;
        }
        // poner el ultimo elemento 
        arreglo[tamaArr - 1] = ultimo;
        if ((i < tamaArr - 1) || (arreglo[tamaArr - 1] == centinela)) {
            System.out.println("El numero: "+ centinela+" ha sido encontrado en la posicion: "+i);
        } else {
            System.out.println("El numero no se ha encontrado");
        }
    }  

}
