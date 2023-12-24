/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_recuperacion_invertir_numero;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Estudiante-pc
 */
public class Punto_recuperacion_invertir_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec= new Scanner(System.in);
        int num;
        int inv;
        String preg;
        System.out.println("****************************************************");
        System.out.println("PROGRAMA QUE INVIERTE UN NUMERO USANDO RECURSIVIDAD");
        System.out.println("****************************************************");
        
        
        
        do {            
            System.out.println("Escriba el numero original");
            num=tec.nextInt();
            
            inv=invertir(num);
            System.out.println("Original: " + num);
            System.out.println("Invertido: " + inv);
            
            
            System.out.println("");
            System.out.println("Desea continuar? Escriba SI para continuar, cualquiero otra cadena para salir");
            preg=tec.next();
            
            
        } while (preg.equalsIgnoreCase("si"));
        
        System.out.println("PROGRAMA QUE INVIERTE NÚMERO USANDO RECURSIVIDAD");
                
        
        
        
    }

    private static int invertir(int num) {
    if(num<9)
        return num;
    else{
        int dig=cuenta_digitos(num);
        //System.out.println("Digitis de " + num + " = "  + dig);
        return (int) (invertir (num/10) + (num%10)*Math.pow(10, dig-1));
        }
    
    
    }

    private static int cuenta_digitos(int num) {
      if(num<9)
        return 1;
      else{
        return 1 + cuenta_digitos(num/10);
    
    }
    
    }
    
}
