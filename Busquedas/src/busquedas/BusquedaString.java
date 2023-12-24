/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedas;

/**
 *
 * @author Dell G15 Ryzen
 */
public class BusquedaString {

    public static int busquedaSecuencial(String[] elements, String color) {
        for (int j = 0; j < elements.length; j++) {
            if (elements[j].equals(color)) {
                return j;            
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr1 = {"azul", "rojo", "morado", "verde"};

        
        int index = busquedaSecuencial(arr1, "morado");
        System.out.println("la palabra se encuentra "+index);

       
        index = busquedaSecuencial(arr1, "amarillo");
        System.out.println("la palabra se encuentra "+index);
    }
}
