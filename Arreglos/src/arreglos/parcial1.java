package arreglos;

public class parcial1 {

    public static void main(String[] args) {
        //variable con el primer numero par
        int numeroInicial = 2;
        //declaracion array
        int[] pares;
        pares = new int[100];
        //for para llenar el array
        for (int i = 0; i < 200; i++) {
            if (numeroInicial % 2 == 0) {
                pares[i] = numeroInicial;
                numeroInicial += 2;
            }
        }
        //mostrar en pantalla en una sola linea
        for (int i = 0; i < 200; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println("");
        //mostrar en pantalla de 10 en 10
        for (int i = 0; i < 200; i++) {
            System.out.print(pares[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

}