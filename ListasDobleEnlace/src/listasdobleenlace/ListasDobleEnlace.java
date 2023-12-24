/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasdobleenlace;

/**
 *
 * @author Dell G15 Ryzen
 */
public class ListasDobleEnlace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MetodoDoble lista =new MetodoDoble();
        System.out.println("<<Ejemplo de lista doblemente enlazado>>");
        lista.insertarPrincipio(10);
        lista.insertarPrincipio(7);
        lista.insertarPrincipio(71);
        lista.insertarFinal(12);
        lista.insertarFinal(14);
        lista.insertarFinal(8);
        lista.mostarDesdePrimero();
        System.out.println("\n Actualizar el valor 14 del tercer nodo por 90");
        lista.modificar(14, 90);
        System.out.println("***************");
        lista.mostarDesdePrimero();
        System.out.println("\n Eliminar el 8 de la lista");
        lista.eliminarValor(8);
        System.out.println("***************");
        lista.mostrarDesdeUltimo();
        System.out.println("\n ELimina el 12 de la lista");
        lista.eliminarValor(12);
        System.out.println("Desde el primero ----------");
        lista.mostarDesdePrimero();
        System.out.println("Desde el ultimo---------");
        lista.mostrarDesdeUltimo();
        System.out.println("Fin del ejemplo de listas doblemente enlazadas");
        
    }
    
}
