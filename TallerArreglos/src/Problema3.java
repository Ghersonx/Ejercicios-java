
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Dell G15 Ryzen
 */
public class Problema3 {

    /* 4.	Leer la edad de 10 estudiantes y calcule
        a)	El promedio de edades.
        b)	La mediana 
     */
    public static void main(String[] args) {
        int[] edades;
        edades = new int[6];

        Scanner leerEdad = new Scanner(System.in);
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Ingrese la edad: ");
            edades[i] = leerEdad.nextInt();
        }
        for (int i = 0; i < edades.length; i++) {
            System.out.print(" " + edades[i]);
        }
        System.out.println("");
        int suma = 0;
        int promedio = 0;

        for (int elemento : edades) {
            suma = suma + elemento;
        }
        //System.out.println(""+ suma);
        promedio = suma / edades.length;
        System.out.println("El promedio de edades es: " + promedio);
        int maximo = 0;
        for (int elemento : edades) {
            if (elemento > maximo) {
                maximo = elemento;

            }
        }
        System.out.println("" + maximo);

        
        Arrays.sort(edades);   
        System.out.print(Arrays.toString(edades));
        System.out.println("");
        double mediana = 0 ;
        if (edades.length % 2 != 0 ) {
            mediana = edades[edades.length/2];
            System.out.println("Mediana impar"+ mediana);
        }else{
            int superior = edades[(edades.length/2)-1];
            int inferior = edades[(edades.length/2)];
            mediana = (superior+inferior);
            System.out.println(inferior);
            System.out.println(superior);
            System.out.println("Mediana par"+ mediana/2);
        }
        
    }

}
