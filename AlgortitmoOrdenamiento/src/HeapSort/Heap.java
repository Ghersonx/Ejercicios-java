package HeapSort;

public class Heap {

        static void heap(int a[], int n, int i)
        {
            int mayor = i;
            int izquierda = 2 * i + 1; // hijo izquierdo
            int derecha = 2 * i + 2; // hijo derecho
            //si s mas grande derecho
            if (izquierda < n && a[izquierda] > a[mayor])
                mayor = izquierda;
            // si es mas grande izquiertro
            if (derecha < n && a[derecha] > a[mayor])
                mayor = derecha;
            // si no es mas grande
            if (mayor != i) {
                // intercambio hijo
                int temp = a[i];
                a[i] = a[mayor];
                a[mayor] = temp;

                heap(a, n, mayor);
            }
        }
        /*oredenamiento de arbol*/
        static void heapSort(int a[], int n)
        {
            for (int i = n / 2 - 1; i >= 0; i--)
                heap(a, n, i);

            // extraccion de elemento
            for (int i = n - 1; i >= 0; i--) {
                 // cambio a[0] con  a[i]
                int temp = a[0];
                a[0] = a[i];
                a[i] = temp;

                heap(a, i, 0);
            }
        }
        /*impresion de elementos */
        static void printArr(int a[], int n)
        {
            for (int i = 0; i < n; ++i)
                System.out.print(a[i] + " ");
        }
        public static void main(String args[])
        {
            int a[] = {45, 7, 20, 40, 25, 23, -2};
            int n = a.length;
            System.out.print("antes de impresion- \n");
            printArr(a, n);
            heapSort(a, n);
            System.out.print("\n ordenado  - \n");
            printArr(a, n);
        }
    }

