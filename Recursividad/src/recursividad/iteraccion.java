/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author Dell G15 Ryzen
 */
public class iteraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalPaginas = 0;
        int [] libros = {50,100,150,70,250};
        for (int i = 0; i < libros.length; i++) {
            System.out.println("paginas libro "+ libros[i]);
            totalPaginas = totalPaginas + libros[i];
        }
        System.out.println(""+totalPaginas);
        
        /*for (int libro : libros) {
            totalPaginas += libro;
            System.out.println("suma iterativa de paginas de libros "+totalPaginas);
        }
        System.out.println("total páginas"+totalPaginas);*/
        
    }
    
    
}
