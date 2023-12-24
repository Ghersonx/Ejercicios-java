/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DivideYVenceras;

/**
 *
 * @author Dell G15 Ryzen
 */
public class SubarregloMaxDyV {
    public static void main(String[] args)
    {
        int arr[] = { -3,1,-2,2,-1,2};
        
        int max_sum = maxSumaArreglo(arr, 0, arr.length - 1);
 
        System.out.println("subarreglo maximo es:  " + max_sum);
    }
    static int maxSumaArreglo(int arr[], int bajo, int alto)
    {
        // caso base solo un elemento
        if (bajo == alto)
            return arr[bajo];
 
        // Find middle point
        int mitad = (bajo + alto) / 2;
 
        /* Devuelve el máximo de los siguientes tres
        casos posibles:
        a) Suma máxima de subarreglo en la mitad izquierda
        b) Suma máxima de subarreglo en la mitad derecha
        c) Suma máxima de subarreglo tal que el
        el subarreglo cruza el punto medio*/
        return Math.max(Math.max(maxSumaArreglo(arr, bajo, mitad),
                     maxSumaArreglo(arr, mitad + 1, alto)),
            MaxCruceMedio(arr, bajo, mitad, alto));
    }
    static int MaxCruceMedio(int arr[], int l, int m, int h)
    {
        // incluye los elementos del medio
        int sum = 0;
        int izqSuma=0;
        for (int i = m; i >= l; i--) {
            sum = sum + arr[i];
            if (sum > izqSuma)
                izqSuma = sum;
        }
 
        // Include elements on right of mid
        sum = 0;
        int derSuma = 0;
        for (int i = m + 1; i <= h; i++) {
            sum = sum + arr[i];
            if (sum > derSuma)
                derSuma = sum;
        }
 
        return Math.max(izqSuma + derSuma,Math.max(izqSuma, derSuma));
    }
    
    
    
}
