/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlenton;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Singlenton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SoyUnico ana = SoyUnico.getSingletonInstance("Ana Caviedes");
        SoyUnico maria = SoyUnico.getSingletonInstance("Maria Castillo");
        
        // ricardo y ramon son referencias a un único objeto de la clase SoyUnico
        System.out.println(ana.getNombre());
        System.out.println(maria.getNombre());   
    }
    
}
