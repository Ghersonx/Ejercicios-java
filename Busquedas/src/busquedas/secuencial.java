/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedas;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell G15 Ryzen
 */
public class secuencial {

    public static void main(String[] args) {
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean bandera = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("digite el numero a buscar: "));
        
        //Busqueda Secuencial
        int i = 0;
        while (i < arreglo.length && bandera==false) {
            if (arreglo[i] == dato) {
                bandera = true;
            }
            i++;
        }

        if (bandera == false) {
            JOptionPane.showMessageDialog(null, "El numero no se ha encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la posicion " + (i - 1));
        }

    }
}
