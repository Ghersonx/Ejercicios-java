/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;


/**
 *
 * @author Dell G15 Ryzen
 */
public class Recursividad {

    public static void main(String[] args) {
        int [] libro = {50,100,150,70,250};
        System.out.println("La suma de paginas de libros es:"
                + sumaLibros(libro, libro.length-1));
        //se imprime en la funcion principal el valor retornado

    }
    // creo la funcion recursiva de tipo arreglo y recorro la posicion 
    static int sumaLibros(int[] arregloLibros, int posicion) {
        int i=posicion;
        int sumaTotal;
        if (i == 0 ) {
            return arregloLibros[i];
        }else {
            sumaTotal= (arregloLibros[i]+sumaLibros(arregloLibros, posicion-1));
        }
        return sumaTotal;
    }    

    
}

