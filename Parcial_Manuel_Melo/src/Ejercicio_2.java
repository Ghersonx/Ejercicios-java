
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        ArrayList<libro> n = new ArrayList<libro>();
        Scanner leer = new Scanner(System.in);
        libro x;
        //IMPRIMIR LOS DATOS DE CADA LIBRO
        n.add(new libro("NOMBRE1", "EDITORIAL1", "AUTOR1", 100));
        n.add(new libro("NOMBRE2", "EDITORIAL2", "AUTOR2", 200));
        n.add(new libro("NOMBRE3", "EDITORIAL3", "AUTOR3", 300));
        System.out.println("Imprimir libros");
        
        for (int i = 0; i < n.size(); i++) {
                System.out.println("libro "+n.get(i).nombre_libro+" "+n.get(i).editorial+" "+n.get(i).autor+" "+n.get(i).pag);
        }
        //SOLICITO DESDE TECLADO OTRO LIBRO
        
        System.out.println("ingrese la posicion hasta el valor de " + n.size());
        int pos = leer.nextInt();
        if (pos<n.size()) {
            x=new libro();
        System.out.println("Ingrese nombre de libro");
        x.nombre_libro = leer.next();
        System.out.println("Ingrese editorial");
        x.editorial = leer.next();
        System.out.println("Ingrese autor");
        x.autor = leer.next();
        System.out.println("Ingrese paginas");
        x.pag = leer.nextInt();
        
        n.set(pos, x);
        System.out.println("El nuevo array es ");
        for (int i = 0; i < n.size(); i++) {
            System.out.println("libro "+n.get(i).nombre_libro+" "+n.get(i).editorial+" "+n.get(i).autor+" "+n.get(i).pag);
        }
        //SOLICITE LIBRO DESDE EL TECLADO
        System.out.println("Ingrese nombre del libro a corregir");
        String busca = leer.next();
        for (int i = 0; i < n.size(); i++) {
            if (n.get(i).nombre_libro.equals(busca)) {
                System.out.println("ingrese el numero de paginas correcto del libro");
                x.pag = leer.nextInt();
                n.set(i, x);
            }
        }
        for (int i = 0; i < n.size(); i++) {
                System.out.println("libro "+n.get(i).nombre_libro+" "+n.get(i).editorial+" "+n.get(i).autor+" "+n.get(i).pag);
        }
        }
        else{
            System.out.println("la posicion no existe");
        }
        
    }
}
