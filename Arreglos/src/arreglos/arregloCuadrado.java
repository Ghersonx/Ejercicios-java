package arreglos;

import java.util.Scanner;

/**
 * arregloCuadrado
 */
public class arregloCuadrado {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
            int [] miPrimerArreglo = new int [5]; //Crear un arreglo de tipo entero de 5 elementos

            for(int i=0; i<miPrimerArreglo.length; i++){ // Creamos una instruccion For para solicitar que ingrese los elementos del arreglo
                System.out.println("Ingresa un valor en el indice [ " +i+" ]: ");//solicitamos el elemento por pantalla
                int datos = leerDatos.nextInt();// lee los datos ingresados por el usuario
                miPrimerArreglo[i]= datos;// Introduce los datos al arreglo
            }

            for(int i=0; i<miPrimerArreglo.length; i++){ //miPrimerArreglo.length obtiene la longitud del arreglo
                System.out.println(" y su cuadrado es:" + 
                        "El elemento en la posición [ " +i+ " ] es: "+miPrimerArreglo[i] +miPrimerArreglo[i]*miPrimerArreglo[i]);//imprime los cuadrados del arreglo
            
        }
    }
}