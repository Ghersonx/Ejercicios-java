
import java.util.Scanner;

public class ejemplo_1_con_recursividad {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero de los limites de numeros naturales");
        n = sc.nextInt();
        decendente(n);//llamar a la recursividad
        System.out.println("Eso es todo");
    }

    static void decendente(int n) {
        if (n > 0)//condicion para que se salga 
        {
            System.out.println(n + "");
            System.out.println("**********************");
            decendente(n - 1);
        //termina y se sale al anterior!!
        }

    }

}
