
import java.util.Scanner;


public class ejemplo_1 {
    public static void main(String[] args) {
        System.out.println("ingrese un valor hasta llegar");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = n; i >0; i--) {
            System.out.printf("%3d",i);
            
        }//uso no mas 2 variables n - i
        System.out.println("");
        System.out.println("******************************");
        for (int i = 1; i <=10; i++) {
            System.out.printf("%3d",i);
        }
    }
    
}
