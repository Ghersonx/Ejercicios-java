
package talle_recursividad;

import java.util.Scanner;


public class ejercicio_4 {

    public static void main(String[] args) {
      //4. Leer un numero y  sumar los dígitos de un número. Ejemplo: Entrada: 123 Resultado:6
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese un numero ");
        n= sc.nextInt();
        System.out.println("la suma de la cifras del numero es "+cifras(n));
    }
    static int cifras(int n){
        
        if (n<10) {
            return n;
        }else{
           return ((n%10) + cifras(n/10));
        }
        
    }
}
