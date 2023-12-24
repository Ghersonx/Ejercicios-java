
import java.io.IOException;

public class ejemplo_5_cadena {

    public static void main(String[] args) throws IOException {
        System.out.println("ingrese una cadena");
        cadena();
        System.out.println("eso es todo");
    }

    static void cadena() throws IOException {
        char ch; //variable char
        ch = (char) System.in.read();//buffer  memoria temporal del teclado, lee un byte
        // para cambiar se realiza el cambio de la sentencias primero el llamado de  la cadena y lugo la impresion
        if (ch != '.') {
            cadena();//se llama a si  misma
        }
        System.out.print(ch + " ");
    }
}
