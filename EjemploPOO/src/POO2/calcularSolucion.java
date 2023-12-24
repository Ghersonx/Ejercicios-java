/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO2;

/**
 *
 * @author Dell G15 Ryzen
 */
public class calcularSolucion {
    public static void main(String[] args) {
       Raices ecuacion=new Raices(1,8,4); //creamos el objeto
       Raices igual = new Raices(1, 4, 4); // ejemplo igual raiz
       Raices negativo = new Raices(1, 2, 9); //ejemplo negativo 
      
       ecuacion.calcular(); //Calculamos
       igual.calcular();
       negativo.calcular();
       
    }
    
}
