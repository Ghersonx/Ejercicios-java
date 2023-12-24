package arraylist;

import java.util.ArrayList;

public class ArrayVsArrayList {

    public static void main(String[] args) {
        //uso de un array
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
     
        //accediendo a un array 
        System.out.println("El primer elemento del array es: " + array[0]);
        
        ArrayList<Integer> arraylist = new ArrayList<>(5);
        
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        
        
        System.out.println("" + arraylist.get(0));
        System.out.println("" + arraylist.get(1));
        System.out.println("" + arraylist.get(2));
        System.out.println("" + arraylist.get(3));
        System.out.println("" + arraylist.get(4));
    }
    
}
