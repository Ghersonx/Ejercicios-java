/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración variables
        String ordinal = "";

        //Arreglo llenado con los 10 primeros primos
        int[] DiezPrimerosPrimos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        JOptionPane.showMessageDialog(null, "A CONTINUACION LOS PRIMEROS 10 NUMEROS PRIMOS");

        //Condiciones respecto a la variable "ordinal" que hacen que cambie según la posicion en el arreglo
        for (int i = 1; i < DiezPrimerosPrimos.length; i++) {
            if (i == 1) {
                ordinal = "er";
            }

            if (i == 2) {
                ordinal = "do";
            }

            if (i == 3) {
                ordinal = "ro";
            }

            if (i == 4) {
                ordinal = "to";
            }

            if (i == 5) {
                ordinal = "to";
            }

            if (i == 6) {
                ordinal = "to";
            }

            if (i == 7) {
                ordinal = "to";
            }

            if (i == 8) {
                ordinal = "vo";
            }

            if (i == 9) {
                ordinal = "no";
            }

            if (i == 10) {
                ordinal = "mo";
            }

            //Impresion del arreglo y variable ordinal
            JOptionPane.showMessageDialog(null, "El " + i + ordinal + " numero primo es: " + DiezPrimerosPrimos[i]);
        }
    
}

}
