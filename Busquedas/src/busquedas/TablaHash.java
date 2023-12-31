/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedas;

import java.util.Arrays;

/**
 *
 * @author Dell G15 Ryzen
 */
public class TablaHash {

    String[] arreglo;
    int longitud;

    public TablaHash(int longi) {
        longitud = longi;
        arreglo = new String[longi];
        // -1 todavia no tiene nada
        Arrays.fill(arreglo, "-1");
    }

    public void funcionHash(String[] cadenaArreglo, String[] arreglo) {
        int i;
        for (i = 0; i < cadenaArreglo.length; i++) {
            String elemento = cadenaArreglo[i];
            int indiceArreglo = Integer.parseInt(elemento) % 7;
            System.out.println("El indice es " + indiceArreglo
                    + " para el elemento " + elemento);
            //tratando las coliciones 
            while (arreglo[indiceArreglo] != "-1") {
                indiceArreglo++;
                System.out.println("Ocurrio una colision en el indice "
                        + (indiceArreglo - 1) + " Cambiar indice "
                        + indiceArreglo);
                indiceArreglo %= longitud;
            }
            arreglo[indiceArreglo] = elemento;
        }
    }
    //metodo de mostar la tabala hash

    public void mostrar() {
        int incremento = 0, i, j;
        for (i = 0; i < 1; i++) {
            incremento += 8;
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            System.out.println();
            for (j = incremento - 8; j < incremento; j++) {
                System.out.format("| %3s" + " ", j);
            }
            System.out.println("|");
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            System.out.println();

            for (j = incremento - 8; j < incremento; j++) {
                if (arreglo[j].equals("-1")) {
                    System.out.print("|    ");
                } else {
                    System.out.print(String.format("| %3s" + " ", arreglo[j]));
                }
            }
            System.out.println("|");
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
    //Método buscar en tabla
    public String buscaClave(String elemento) {
        int indiceArreglo = Integer.parseInt(elemento) % 7;
        int contador = 0;
        while (arreglo[indiceArreglo] != "-1") {
            if (arreglo[indiceArreglo] == elemento) {
                System.out.println("El elemento " + elemento
                        + "fue encontrado en la posicion " + indiceArreglo);
                return arreglo[indiceArreglo];
            }
            indiceArreglo++;
            indiceArreglo %= longitud;
            contador++;
            if (contador > 7) {
                break;
            }
        }
        return null;
    }
// Método Main
    public static void main(String[] args) {
        TablaHash hash = new TablaHash(8);
        String[] elementos = {"20", "33", "21", "10", "12", "14", "56", "100"};
        hash.funcionHash(elementos, hash.arreglo);
        hash.mostrar();
        String buscado = hash.buscaClave("20");
        if (buscado == null) {
            System.out.println("El elemento no se encuentra en la tabla");
        }

    }

}
