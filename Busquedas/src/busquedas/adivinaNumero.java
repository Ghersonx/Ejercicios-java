/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedas;

import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class adivinaNumero {

    public static void main(String[] args) {
        System.out.println("ADIVINAR UN NÚMERO");
        System.out.println("Ingrese el número hasta donde se quiera adivinar");
        Scanner sc = new Scanner(System.in);
        int sup = sc.nextInt();
        int rta = 0;

        int intentos = (int) (Math.log10(sup) / Math.log10(2)) + 1;
        System.out.println("El número de intentos para adivinar son " + intentos);

        int oportunidad = 0;
        int pos, inf = 1;
        do {
            pos = (inf + sup) / 2;
            oportunidad++;
            System.out.println("el numero que usted penso es= " + pos);
            System.out.println("dijite el valor si el numero es : 1. alto  2.bajo  3.correcto");
            rta = sc.nextInt();
            if (rta == 1) {
                sup = pos - 1;

            }
            if (rta == 2) {
                inf = pos + 1;

            }

        } while (oportunidad < intentos && rta != 3);
        if (rta == 3) {
            System.out.println("Adivinaste el numero");
            System.out.println("numero de intentos " + oportunidad);
        } else {
            System.out.println("algo raro paso");
        }

    }
}
