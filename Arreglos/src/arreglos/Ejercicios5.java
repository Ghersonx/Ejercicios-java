/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;


/**
 *
 * @author Dell G15 Ryzen
 */
public class Ejercicios5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Relleno de un array
        int[] data = new int[11];
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
            System.out.print(" " + i);
        }
        System.out.println("");

        //Suma y promedio
        double total = 0, promedio = 0;
        for (double elemento : data) {
            total = total + elemento;
        }
        System.out.println(total);
        if (data.length > 0) {
            promedio = total / data.length;
        }
        System.out.println(promedio);

        //Máximo y mínimo
        double maximo = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > maximo) {
                maximo = data[i];
            }
        }
        //System.out.println(maximo);
        //Uso de for each
        for (double element : data) {
            if (element
                    > maximo) {
                maximo = element;
            }
        }
        System.out.println(maximo);
        double minimo = data[0];
        for (double element : data) {
            if (element
                    < minimo) {
                minimo = element;
            }
        }
        System.out.println(minimo);

        for (int i = 0; i < data.length; i++) {
            if (i > 0) {
                System.out.print(" | ");
            }
            System.out.print(data[i]);           
        }
        

        
     
        
        
        
        
        
        
        
        

    }

}
