
import java.io.IOException;
import java.util.Scanner;


public class ejemplo_4_carcater {
    public static void main(String[] args) throws IOException //agrego el throws pq genera un error de ioexepcion
    {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese una cadena");
        cadena();
        System.out.println("esto es todo!");
    }
    static void cadena() throws IOException//agrego el throws pq genera un error de ioexepcion
    {
        char ch ; //variable char
        ch=(char)System.in.read();//buffer  memoria temporial del teclado, lee un byte
        if (ch!='.') {
            System.out.println(ch+" ");
            cadena();//se llama a si  misma
        }
    }
}
