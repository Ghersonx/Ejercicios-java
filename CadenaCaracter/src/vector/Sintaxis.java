
package vector;

public class Sintaxis {

    public static void main(String[] args) {
       
        char[] cadenaChar = {'N', 'E', 'T', 'B', 'A', 'N', 'S'};
        String s = new String(cadenaChar);//cadena de caracter s
        System.out.println(s);

        String s1 = "NETBEANS";
        System.out.println(s1);

        String s2 = "welcome";
        String s3 = "Welcome";

        String c1 = "Netbeans";//creando cadena por cadena literal de Java       
        char ch1[] = {'N', 'E', 'T', 'B', 'E', 'A', 'N', 'S'};
        String c2 = new String(ch1);////convirtiendo una matriz de caracteres en una cadena        
        String c3 = new String("Netbeans");//creando String Java por nueva palabra clave      
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        

    }

}
