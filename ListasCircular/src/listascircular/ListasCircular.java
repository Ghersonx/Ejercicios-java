/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listascircular;

/**
 *
 * @author Dell G15 Ryzen
 */
public class ListasCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MetodoLista listaCir = new MetodoLista();
        
        listaCir.insertarInicio(20);
        listaCir.insertarInicio(15);
        listaCir.insertarInicio(8);
        listaCir.insertarInicio(3);
     
        
        listaCir.mostrarLista();
        
        listaCir.insertarFinal(19);
        listaCir.insertarFinal(10);
        listaCir.insertarFinal(30);
        
        System.out.println("=====================");
        listaCir.mostrarLista();
        
        System.out.println(listaCir.buscar(9)? "El elemento esta dentro de la lista"
                : "EL elemento no se encuentra en la lista");
        System.out.println(listaCir.buscar(98)? "El elemento esta dentro de la lista"
                : "EL elemento no se encuentra en la lista");
        
        listaCir.modificar(20, 120);
        listaCir.modificar(19, 150);
        
        listaCir.mostrarLista();
        
        listaCir.eliminar(3);
        
        System.out.println("********************");
        listaCir.mostrarLista();
        
        
        
        
    }
    
}
