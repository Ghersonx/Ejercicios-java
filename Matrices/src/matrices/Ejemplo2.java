/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        int i, j, k, s;
        int[][] m = new int[3][5]; //Declaracion de la matriz
        k = 1; //contador de multiplos de 3

        System.out.println("1. Inicializacion de la matriz  desde programa usando dos ciclos!");
        for (i = 0; i < 3; i++) //ciclo para recorrer las filas =>3  Movimiento Externo = Lento
        {
            for (j = 0; j < 5; j++) //ciclo para recorrer las columnas =>5  Movimiento interno = Rapido
            {
                m[i][j] = 3 * k++;
            }
        }

        System.out.println("\n2.Impresion de la matriz para mostrar su contenido por filas!");
        for (i = 0; i < m.length; i++) //indica el numero de filas => m.length
        {
            for (j = 0; j < m[0].length; j++) ////indica el numero de columnas => m[0].length
            {
                System.out.printf("%5d", m[i][j]);
            }
            System.out.println();
        }
        System.out.print("\n3.Sumatoria de todos los elementos de la matriz");
        for (i = 0, s = 0; i < m.length; i++) //indica el numero de filas => m.length
        {
            for (j = 0; j < m[0].length; j++) ////indica el numero de columnas => m[0].length
            {
                s = s + m[i][j];
            }

        }
        System.out.println("\nLa Sumatoria de todos los elementos :" + s);

        System.out.print("\n4.Sumatoria de la matriz  por filas!");
        for (i = 0; i < m.length; i++) //Observe que  el ciclo externo corresponde a las filas!!
        {						   //Siempre sera el movimiento mas lento.
            for (j = 0, s = 0; j < m[0].length; j++) //Observe que el ciclo interno corresponde a las columnas!!
            {
                s = s + m[i][j];					//Siempre sera el movimiento mas rapido.
            }
            System.out.printf("\nLa suma de la fila No %3d es : %5d", i, s);
        }

        //Ejercicio=>
        System.out.print("\n\n5.Sumatoria de la matriz  por Columnas");
        for (j = 0; j < m[0].length; j++) //Observe que ahora el ciclo externo es el de las columnas!!
        {			    //Es decir el movimiento lento es de las columnas
            for (i = 0, s = 0; i < m.length; i++) //Observe que ahora el ciclo interno es el de las filas!!
            {
                s = s + m[i][j];		 //es decir primero se mueve por las filas o primero cambia el indice de las filas
            }
            System.out.printf("\nLa suma de la columna No %3d es : %5d", j, s);
        }
        //Ejercicio=>Realizar la suma de los elementos pares e impares de la matriz

    }

}

