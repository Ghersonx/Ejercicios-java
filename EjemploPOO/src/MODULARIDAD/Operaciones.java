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
public class Operaciones {
    
    int suma;
    int resta;
  
    public void Sumar(int numerol,int numero2){

            suma = numerol + numero2;
    }
    
    public void Restar(int numerol,int numero2){
            resta = numerol - numero2;
        }
    
    public void MostrarResultadoSuma(){
        JOptionPane.showMessageDialog (null,"la suma es: "+" "+suma);
        
    }
    public void MostrarResultadoResta(){
        
        JOptionPane.showMessageDialog (null,"La resta es: "+" "+resta);
    }      
                                         
}
