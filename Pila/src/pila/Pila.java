/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MétodoPila pila = new MétodoPila();
        pila.apilar(4);
        pila.apilar(16);
        pila.apilar(12);
        pila.apilar(8);
        pila.apilar(16);
        pila.apilar(5);
        pila.apilar(6);
        pila.mostrarPila();
        //el simbolo ? funciona como un if  de una sola linea
        System.out.println("Buscar el elemento 12...");
        System.out.println(pila.buscar(12)?"Dato encontrado":"Dato NO econtrado");
        System.out.println("Elemento: "+pila.desapilar()+" sale");
        System.out.println("Elemento: "+pila.desapilar() + " sale");
        pila.mostrarPila();
        
        //Automatizar pidiendo datos desde teclado
        //Realizar conteo de datos de pila
        //Eliminar un nodo de la pila ubicando su valor
        //Actualizar el valor de un nodo de la pila        
        //Realizar borrado de toda pila
    }
    
}
