
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingerse el valor de la matriz (filas=columnas)");
        int x = sc.nextInt();
        int m[][] = new int[x][x];
      
        for (int fila = 0; fila < m.length; fila++) {
            for (int columna = 0; columna < m[0].length; columna++) {
                System.out.print("Ingrese el valor de la posicion con 0 y 1 [" + fila + "][" + columna + "] = ");
                    if (m[fila][columna]<2) {
                    m[fila][columna] = sc.nextInt();
                }else{
                        System.out.println("no es un valor ");
                    }
                  }
        }// fin llenado matriz
        for (int fila = 0; fila < m.length; fila++) {
            for (int columna  = 0; columna < m[0].length; columna++) {
                System.out.printf("%5d", m[fila][columna]);
            }
            System.out.println();
        }// fin de impresion de la matriz
    
        for (int fila = 0; fila < m.length; fila++) {
            
            for (int columna = 0; columna < m[0].length; columna++) {
                if (fila==columna&& m[fila][columna]==1) {
                                              
                    if (fila!=columna&&m[fila][columna]==0) {
                         
                    }
                    
                }System.out.println("si es identica");
           }
           
    }
    
    }
    
}
