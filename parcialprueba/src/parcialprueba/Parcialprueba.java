/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialprueba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;
import parcialprueba.EquipoFutbol;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Parcialprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        punto1();
        punto2();
        punto3();
        punto4();
        punto5();
    }
    
    private static void punto1() {
        int[] arreglo = new int[10];
        int temp;
        llenarMatriz(arreglo);
        for (int i = 0; i < 10; i++) {
            for (int j = (i+1); j < 10; j++) {
                if (arreglo[i] > arreglo[j]) {
                    temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        mostrarArreglo(arreglo, 2, false);
    }
    ////////////
    private static void punto2() {
        int cantida;
        EquipoFutbol temp;
        EquipoFutbol[] listaEquiposFutbol;
        System.out.println("Ingresar cantidad de equipos");
        Scanner sc = new Scanner(System.in);
        cantida = sc.nextInt();
        listaEquiposFutbol = new EquipoFutbol[cantida];
        for (int i = 0; i > listaEquiposFutbol.length; i++) {
            System.out.println("Ingredar datos de equipo " + (i+1));
            System.out.print("Nombre: ");
            listaEquiposFutbol[i] = new EquipoFutbol();
            listaEquiposFutbol[i].setNombre(sc.next());
            System.out.print("Puntaje: ");
            listaEquiposFutbol[i].setPuntaje(sc.nextInt());
        }
        for (int i = 0; i < listaEquiposFutbol.length; i++) {
            for (int j = (i+1); j < listaEquiposFutbol.length; j++) {
                if (listaEquiposFutbol[i].getPuntaje() > listaEquiposFutbol[j].getPuntaje()) {
                    temp = listaEquiposFutbol[i];
                    listaEquiposFutbol[i] = listaEquiposFutbol[j];
                    listaEquiposFutbol[j] = temp;
                }
            }
        }
        System.out.println("Equipos ordenados por puntaje");
        for (int i = 0; i < listaEquiposFutbol.length; i++) {
            System.out.println("Nombre " + listaEquiposFutbol[i].getNombre() + " Puntaje " + listaEquiposFutbol[i].getPuntaje());
        }
    }
    /////////
    private static void punto3() {
        int[] arreglo = {6, 0, 3, 2, 5, 7, 4, 1};
        quicksort(arreglo, 0, 7);
        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(arreglo));
    }
    private static int particion(int arreglo[], int izquierda, int derecha) {
        int mitad = izquierda + (derecha - izquierda) / 2;
        int pivote = arreglo[mitad];
        while (true) {
            while (arreglo[izquierda] < pivote) {
                izquierda++;
            }
            while (arreglo[derecha] > pivote) {
                derecha--;
            }
            if (izquierda >= derecha) {
                return derecha;
            } else {
                int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
        }
    }
    private static void quicksort(int arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, indiceParticion);
            quicksort(arreglo, indiceParticion + 1, derecha);
        }
    }
    /////////
    private static void punto4() {
        int temp = 0, menor = 0, pos;
        int[] arreglo = {6, 0, 3, 2, 5, 7, 4, 1};
        //inicializo el arreglo
        System.out.println("");
        System.out.println("el metodo por seleccion ordenado es: ");

        //metodo seleccion del arreglo
        for (int i = 0; i < arreglo.length - 1; i++) {
            menor = i;// declaro el primer elemento como un menor en posicion 0
            for (int j = i + 1; j < arreglo.length; j++) {
                //hago la misma comparacion pero sobre la posicion no sobre el otro vector
                if (arreglo[j] < arreglo[menor]) {// REALIZO LA COMPARACION DEL NUEVO 
                    menor = j;//encuentro el nuevo menor
                }
            }//FIN DEL FOR DE J
            temp = arreglo[i];//ASIGNO EL NUEVO MENOR  
            arreglo[i] = arreglo[menor];//LA POSICION MENOR 
            arreglo[menor] = temp;// EL NUEVO MENOR COMO POSICION
        }//FIN DEL IF DE COMPARACION

        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%2d", arreglo[i]);
        }
        
        int[] arreglo2 = {6, 0, 3, 2, 5, 7, 4, 1};
        int j = 0;
        //inicializo el arreglo
        System.out.println("");
        System.out.println("el metodo por insercion ordenado es: ");
        //ordenamiento por inserccion 
        for (int i = 0; i < arreglo2.length ; i++) {
            //temp es el numero de elemento que se va a ir comparando
            temp = arreglo2[i];
            for (j = i-1; j >= 0 && arreglo2[j] > temp; j--) {
                arreglo2[j+1]=arreglo2[j];
            }
            arreglo2[j+1]=temp;
        }
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.printf("%2d", arreglo2[i]);
        }
        System.out.println("");
    }
    /////////
    private static void punto5() {
        String temp;
        
        String[] arreglo = {"Camilo", "Zoe", "Andrea", "Ana", "Maria", "Felipe", "Tatiana", "Miguel", "Joan", "Tomas"};
        System.out.println("Lista desordenada " + Arrays.toString(arreglo));
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = (i+1); j < arreglo.length; j++) {
                if (arreglo[i].compareToIgnoreCase(arreglo[j]) > 0) {
                    temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        System.out.println("Lista ordenada " + Arrays.toString(arreglo));
    }
    private static void llenarMatriz(int[] arreglo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numeros");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = sc.nextInt();
        }
    }
    private static void mostrarArreglo(int[] arreglo, int numero, boolean condicion) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]%numero == 0 && condicion) {
                System.out.print(arreglo[i] + "  ");
            } else if (arreglo[i]%numero != 0 && !condicion) {
                System.out.print(arreglo[i] + "  ");
            }
        }
    }
    }
