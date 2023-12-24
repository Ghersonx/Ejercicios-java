
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 0;
        while (n != 0) {
            x = 0;
            y = n % 10;
            n = n / 10;
        System.out.println("el numero " + n + " invertido el primero y ultimo es " + x);
        }
        
    }
}
