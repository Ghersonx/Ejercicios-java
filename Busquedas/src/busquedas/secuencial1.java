/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busquedas;

/**
 *
 * @author Dell G15 Ryzen
 */
public class secuencial1 {
    public static void main(String args[])
    {
        // arreglo de numeros
        int arreglo[] = { 2, 3, 4, 10, 40 }; 
        // elemento a buscar
        int numero = 10; 
        // llamado a la funcion 
        int encontrado = busqueda(arreglo, numero);
        
        if (encontrado == -1)
            System.out.print("El numero no se ha encontrado");
        else
            System.out.print("El numero: "+ numero+" ha sido encontrado en la posicion " + encontrado);
    }

    public static int busqueda(int arreglo[], int buscado)
    {        
        // recorrdio del arreglo
        for (int i = 0; i < arreglo.length; i++) { 
            // si el elemento es encontrado 
            // retorna la posicion 
            if (arreglo[i] == buscado)
                return i;
        }
        return -1;
    } 
  
    

}
