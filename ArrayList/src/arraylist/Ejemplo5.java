/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Ejemplo5 {
    //se crea un arreglo de  n datos con la clase persona
    //CREAR UN ARRAYLIS DE OBJETOS “COMPUESTOS” SE DEBE CREAR LA CLASE PERSONA(nombre,edad,telefono)
    //1.ADICIONANDO OBJETOS DIRECTAMENTE AL ARRAYLIST
    //2.ADICIONANDO OBJETOS QUE SE LEEN DESDE EL TECLADO


    public static void main(String[] args) {
        ArrayList<persona> p = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        persona auxp;
        int i;//se declara una variable indice del arreglo
        //ERROR TIPICO QUE SE PUEDE COMETER ==> p.add("juan",10,11111),TRATAR DE ADICIONAR DIRECTAMENTE 
        //LOS DATOS AL ARRAYLIST, PRIMERO SE DEBE CREAR UNA INSTANCIA DE LA CLASE PERSONA!!!
        //ESTO SE PUEDE HACER DE DOS FORMAS
        //PRIMERO:CREANDO UNA VARIABLE DE TIPO OBJETO=> AUXP QUE TENGA LOS VALORES DE LA PERSONA
        auxp = new persona("juan", 10, 31785383232L);

        p.add(auxp);
        //Observe como se hace referencia a los elementos de persona

        System.out.printf("\nPrimera Impresion del ArrayList ");
        System.out.printf("\nPrimera Persona : %-6s Edad :%d telefono :%- 5d",
                p.get(0).nombre, p.get(0).edad, p.get(0).telefono);
        //SEGUNDO:CREANDO DENTRO DEL METODO ADD EL OBJETO Y ADICIONANDOLO DIRECTAMENTE
        p.add(new persona("Pedro", 20, 31785383232L));
        p.add(new persona("Luis", 30, 31785383232L));
        p.add(new persona("Carlos", 40, 31785383232L));
        
        
        System.out.printf("\n\nSegunda Impresion del ArrayList con otros valores adicionados");
        for (i = 0;i < p.size();i++) {
            System.out.printf("\nNombre :%s %6s Edad :%d telefono :%5d",
                    i, p.get(i).nombre, p.get(i).edad, p.get(i).telefono);
        }
        
 

//SOLICITAR LOS DATOS DE 3 PERSONAS DESDE EL TECLADO Y ADICIONAR LA INFORMACION AL ARRAYLIST 
       /* for (i = 0; i < 3; i++) {//Debemos leer cada dato, guardarlo en una variable de tipo persona y luego almacenar esta informacion en el arreglo
            auxp = new persona(); //Se puede crear la variable persona sin datos es decir (constructor vacio)
//ojo NO SE PUEDE USAR SOLO LA VARIABLE AUXP SIN CREAR UNA INSTANCIA DE ELLA!!
            System.out.print("\nNombre de la persona");
            auxp.nombre = leer.next();//Lee el nombre  como cadena
            System.out.print("edad de la persona");
            auxp.edad = leer.nextInt();//lee la edad como entero
            System.out.print("telefono de la persona");
            auxp.telefono = leer.nextLong(); //lee el telefono como entero
            p.add(auxp); //ADICIONA LA VARIABLE auxp (con todos sus datos) AL FINAL DEL ARREGLO
        }

        System.out.printf("\nTercera Impresion del ArrayList con nuevos valores leidos desde el teclado");
        for (i = 0;i < p.size();i++) {
            System.out.printf("\nNombre %d: %10s Edad :%d telefono:%5d",
                    i, p.get(i).nombre, p.get(i).edad, p.get(i).telefono);
        }*/
    }
}


