/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Listas {

    public static void main(String[] args) {
        Nodo primer = new Nodo("primero");
        Nodo segundo = new Nodo(2323);
        Nodo tercer = new Nodo("Tercero");
        
        primer.enlazarSiguiente(segundo);
        
        primer.obtenerSiguiente().enlazarSiguiente(tercer);
        
        System.out.println(primer.obtenerSiguiente().obtenerValor().toString());

    }

}
