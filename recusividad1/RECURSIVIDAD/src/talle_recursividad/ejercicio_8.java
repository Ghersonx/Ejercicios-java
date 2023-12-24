package talle_recursividad;

public class ejercicio_8 {

    public static void main(String[] args) {
        //8. Realizar un programa que permita copiar una cadena en otra.
        String cad1 = "hola";
        String cad2;
        //el truco es poner la cadena a arreglo de tipo char
        char[] c1 = new char[80];
        char[] c2 = new char[80];
        System.out.println("la cadena 1 es igual a " + cad1);
        //pára convertir una cadena a arreglo
        c1 = cad1.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            System.out.print(c1[i] + " ");
        }
        System.out.println("");

        //le envio las 2 arreglos y el limite menos 1
        copiar(c1, c2, c1.length - 1);
        //imprimo el char 2 para saber si esa imprimiendo lo mismo
        for (int i = 0; i < c2.length; i++) {
            System.out.print(c2[i] + " ");;

        }
        //conveierto el arreglo a cadena
        System.out.println("la cadena 2 esta en c2 = "+String.valueOf(c2));
        // convierto para leer el arreglo a cadena
        cad2=String.valueOf(c2);
        //imprimo las dos cadenas para verificar si son iguales
        System.out.println("Cadena 1 = "+cad1+"\nCadena 2 = "+cad2);

    }

    static void copiar(char[] c1, char[] c2, int i) {
        if (i >= 0) {
            c2[i] = c1[i];
            //para dsiminuir una posicion en el arreglo
            copiar(c1, c2, i - 1);
        }

    }
}
