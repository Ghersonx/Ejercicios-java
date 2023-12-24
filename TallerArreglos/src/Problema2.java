
import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Problema2 {

    /*3.	Inicializar un arreglo con 5 números reales que se leen desde teclado y:
        a)	Imprima el arreglo con los valores leídos.
        b)	Calcule el promedio.
        c)	Calcule la sumatoria de los elementos del arreglo
     */
    public static void main(String[] args) {
        int reales[] = new int[5];
        Scanner leerNumero = new Scanner(System.in);

        for (int i = 0; i < reales.length; i++) {
            System.out.println("Ingrese numeros reales:");
            reales[i] = leerNumero.nextInt();
        }
        System.out.println("Arreglo construido con 5 numeros reales");
        int suma = 0;

        for (int i = 0; i < reales.length; i++) {
            System.out.println("Numeros ingresados " + reales[i]);
            suma = suma + reales[i];
        }
        System.out.println("");

        System.out.println(suma);
        double promedio = suma / reales.length;
        System.out.println("Promedio: " + promedio);

    }

}
