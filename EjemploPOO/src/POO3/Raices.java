/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO3;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private void obtenerRaices(){
        
    }
    
    private void obtenerRaiz(){
        
    }
    
    private double getDiscriminante(){
        return Math.pow(b, 2) - (4*a*c);
    }
    
    private boolean tieneRaices(){
        return getDiscriminante() > 0;
    }
    
    private boolean tieneRaiz(){
        return getDiscriminante() == 0;
    }
            
            
}
