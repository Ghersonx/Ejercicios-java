/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.util.Arrays;

/**
 *
 * @author Dell G15 Ryzen
 */
public class ordenamiento {
   public static void main(String[] args) {
        String[] nombres = {"Luis", "Chris", "Jill", "Wilsom", "Aida","Juan","Pedro","Alexis","Camilo","Yerson"};
        System.out.println("Antes de QS: " + Arrays.toString(nombres));
        quicksort(nombres, 0, nombres.length - 1);
        System.out.println("Después de QS: " + Arrays.toString(nombres));
    }
    private static int particion(String arreglo[], int izquierda, int derecha) {
        // Elegimos el pivote, es el primero
        String pivote = arreglo[izquierda];
        // Ciclo infinito
        while (true) {
            // Mientras cada elemento desde la izquierda esté en orden (sea menor que el
            // pivote) continúa avanzando
            while (arreglo[izquierda].compareTo(pivote) < 0) {
                izquierda++;
            }
            // Mientras cada elemento desde la derecha esté en orden (sea mayor que el
            // pivote) continúa disminuyendo
            while (arreglo[derecha].compareTo(pivote) > 0) {
                derecha--;
            }
    /*
    Si la izquierda es mayor o igual que la derecha significa que no
    necesitamos hacer ningún intercambio*/
            if (izquierda >= derecha) {
            return derecha;
            } else {
      /*
      Si las variables quedaron "lejos" (es decir, la izquierda no superó ni
      alcanzó a la derecha)
      significa que se detuvieron porque encontraron un valor que no estaba
      en orden, así que lo intercambiamos
      */
                String temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
            // El while se repite hasta que izquierda >= derecha
        }
    }
    private static void quicksort(String arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, indiceParticion);
            quicksort(arreglo, indiceParticion + 1, derecha);
        }
    }
}
