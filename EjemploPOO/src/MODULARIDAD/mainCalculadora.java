/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODULARIDAD;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell G15 Ryzen
 */
public class mainCalculadora {
    public static void main(String[]args){
  
    int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
    int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
    
    Operaciones operacion = new Operaciones();
    
    operacion.Sumar(n1,n2);
    operacion.Restar(n1,n2);
    operacion.MostrarResultadoSuma();
    operacion.MostrarResultadoResta();
                                                 
    }                                               
}
