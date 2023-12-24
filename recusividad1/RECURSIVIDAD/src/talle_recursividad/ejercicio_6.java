
package talle_recursividad;

import java.util.Scanner;

public class ejercicio_6 {

    public static void main(String[] args) {
        //6. Leer  un numero llamado base y otro exponente y calcular la potencia elevando la base al exponente.
        int x,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese la base de la potencia ");
        x=sc.nextInt();
        System.out.println("ingrese el exponente de la potencia ");
        n=sc.nextInt();
        System.out.println(x+" elevado a la "+n+" es igual a "+potencia(x,n));
    }
    static int potencia(int x, int n){
        
        if (n==0) {
            return 1;
        } else {
            return x*potencia(x,n-1);
        }
    }
}
