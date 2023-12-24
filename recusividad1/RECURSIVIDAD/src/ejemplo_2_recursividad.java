
import java.util.Scanner;


public class ejemplo_2_recursividad {
    public static void main(String[] args) {
        int n,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese el limite de los numeros naturales");
        n= sc.nextInt();
        acendente(n,1);
        System.out.println("");
        System.out.println("Eso es todo");
    }
    //se resuelve con 2 variables n -i
    static void acendente(int n, int i){
        if (i<=n) {
            System.out.printf("%3d",i);
            acendente(n,i+1);
        }
        
    }
}
