/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloNumerico; //declaracion arreglo de tipo numerico

        arregloNumerico = new int[3]; //tamaño del arreglo es 3 elementos      
        String[] nombre = {"maria", "ana"};
        System.out.println(nombre[0]);
        System.out.println(nombre[1]);
        //asignacion de valores a elementos del arreglo;
        arregloNumerico[0] = 2;

        arregloNumerico[1] = 10;

        arregloNumerico[2] = 7;

        System.out.println("El valor de la posicion 1 en el arreglo es " + arregloNumerico[0]);
        System.out.println("El valor de la posicion 1 en el arreglo es " + arregloNumerico[1]);
        System.out.println("El valor de la posicion 1 en el arreglo es " + arregloNumerico[2]);
        
        System.out.println("imprimir todo el arreglo");
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + arregloNumerico[i]);
            
        }
        System.out.println("");
    }

}
