
import java.util.Scanner;


public class ejemplo_3_recursividad {
    public static void main(String[] args) {
        int n;
        System.out.println("ingrese el limite de numeros naturales");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        acendente(n);
        System.out.println("");
        System.out.println("eso es todo");
               
    
    }
    static void acendente(int n){
        if (n>1)//hay que quitar los corchetes pq lo arranca en 1
        
            acendente(n-1);
            System.out.printf("%3d",n);
        
    }
    
}
