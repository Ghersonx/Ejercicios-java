/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vector;

/**
 *
 * @author Dell G15 Ryzen
 */
public class OperacionesStrings {

    public static void main(String[] args) {
        String cadena1;
        String cadena2;
        cadena1 = "esta es la cadena No1";
        cadena2 = new String("ESTA ES LA CADENA No2");
        //USO DE ALGUNOS METODOS DE LA CLASE STRING
        System.out.println("Primera Impresion de las cadenas con la implementacion de algunos metodos ");
        System.out.println("cad1 = " + cadena1 + "   cad2 = " + cadena2);
        System.out.println("Segunda Impresion de las cadenas (uso de charAt)");
        System.out.println("caracter en posicion 6 de cad1 =>" + cadena1.charAt(6));
        System.out.println("Longitud de cad1 (uso de length()) =>" + cadena1.length());
        System.out.println("Primera ocurrencia (uso de indexOf())'e' de cad1 en posicion=>" + cadena1.indexOf('e'));
        System.out.println("Ultima ocurrencia (uso de lastIndexOf())'e' de cad1 en posicion=>" + cadena1.lastIndexOf('e'));

        System.out.println("Convierte a Mayusculas la cadena 1 (uso de toUpperCase()=>" + cadena1.toUpperCase());

        System.out.println("Convierte a Minusculas la cadena 2 (uso de toLowerCase()=>" + cadena2.toLowerCase());
        System.out.println("Compara los contenido de cadena 1 y cadena 2 (uso de equals(cadena)=>" + cadena1.equals(cadena2));
        System.out.println("Compara los contenido de cadena 1 y cadena 2 (uso de equals(cadena)=>" + cadena1.equalsIgnoreCase(cadena2));
        System.out.println("Compara los contenido de cadena 1 y otra cadena (uso de equals(cadena)=>" + cadena1.equals("esta es la cadena No1"));

        System.out.println("Concatena la cadena 1 y cadena 2 (uso de concat(cadena)=>" + cadena1.concat(cadena2));
        System.out.println("Pregunta si una cadena contiene una subcadena (uso de contais(subcadena)=>" + cadena1.contains("esta"));
        System.out.println("Muestra la subcadena contenida en cadena 1, desde i hasta f (uso de substring(i,f)=>" + cadena1.substring(0, 6));
        System.out.println("Reemplaza el primer caracter por el segundo en toda la cadena 1 =>" + cadena1.replace('a', 'i'));
        //Que imprime el siguiente trozo de programa?
        System.out.println("\n\nCOMPARACION DE OBJETOS CON IGUAL CONTENIDO");
        
        System.out.println("\nprimera Impresion de comparacion de objetos si str1=str2");
        String str1 = "El lenguaje Java";
        String str2 = new String("El lenguaje Java");
        System.out.println("\nImpresion del Objeto str1 =>" + str1 + " \nImpresion del Objeto str2 =>" + str2);
        if (str1 == str2) {
            System.out.println("Los mismos objetos");
        } else {
            System.out.println("Distintos objetos");
        }

        if (str1.equals(str2)) {
            System.out.println("El mismo contenido");
        } else {
            System.out.println("Distinto contenido");
        }
        //Ahora que imprimira si se igualan las referencias??
        str1 = str2; //Hacemos la cadena 1 igual a la cadena2?
        System.out.println("\nSegunda Impresion de comparacion de objetos si str1=str2 cambia el resultado anterior? Porque?");
        System.out.println("\nImpresion Objeto str1 =>" + str1 + "    Impresion del Objeto str2 =>" + str2);
        if (str1 == str2) {
            System.out.println("Los mismos objetos");
        } else {
            System.out.println("Distintos objetos");
        }

        if (str1.equals(str2)) {
            System.out.println("El mismo contenido");
        } else {
            System.out.println("Distinto contenido");
        }

        //Ahora le vamos asignar una nueva cadena a str1
        str1 = "esta es la nueva cadena";
        System.out.println("\nTercera Impresion de comparacion de objetos si str1=str2 cambia el resultado anterior? Porque?");
        System.out.println("\nImpresion Objeto str1 =>" + str1 + "    Impresion del Objeto str2 =>" + str2);
        if (str1 == str2) {
            System.out.println("Los mismos objetos");
        } else {
            System.out.println("Distintos objetos");
        }

        if (str1.equals(str2)) {
            System.out.println("El mismo contenido");
        } else {
            System.out.println("Distinto contenido");
        }
        System.out.println("\nImpresion Objeto str1 =>" + str1 + "    Impresion del Objeto str2 =>" + str2);
        System.out.println("\nPorque dice que los objetos son distintos si estaban apuntando a la misma direccion???");

    }
}
