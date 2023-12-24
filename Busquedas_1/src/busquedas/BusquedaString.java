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

    public static int sequentialSearch(String[] elements, String target) {
        for (int j = 0; j < elements.length; j++) {
            if (elements[j].equals(target)) {
                return j;            
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr1 = {"blue", "red", "purple", "green"};

        // test when the target is in the array
        int index = sequentialSearch(arr1, "red");
        System.out.println("la palabra se encuentra "+index);

        // test when the target is not in the array
        index = sequentialSearch(arr1, "pink");
        System.out.println("la palabra se encuentra "+index);
    }
}
