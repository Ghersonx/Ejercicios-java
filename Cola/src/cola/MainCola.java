/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cola;

/**
 *
 * @author Dell G15 Ryzen
 */
public class MainCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cola cola =new Cola();
        cola.enColar(4);
        cola.enColar(16);
        cola.enColar(15);
        cola.enColar(30);
        cola.enColar(23);
        cola.enColar(9);
        cola.mostrarCola();
        
        System.out.println(cola.buscar(9)?"Dato encontrado ":"Dato No encontrado");
        System.out.println(cola.buscar(-8)?"Dato encontrado ":"Dato No encontrado");
        
        System.out.println("Elemento: "+ cola.desenColar()+" Sale");
        System.out.println("Elemento: "+ cola.desenColar()+" Sale");
        cola.mostrarCola();
        
    }
    
}
