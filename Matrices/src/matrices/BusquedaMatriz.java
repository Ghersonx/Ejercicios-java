package matrices;

public class BusquedaMatriz {
    public static void main(String[] args) {
        int A [][] = {{51,21,33,49,51},
                {12,22,34,84,95},
                {19,21,23,51,57}};
        int filas = A.length;
        int columas = A[0].length;

        int i,j, c = -1, f = -1;

        int dato = 57;

        for(i=0;i<filas;i++){
            for(j=0;j<columas;j++){
                if(dato == A[i][j]){
                    f = i+1;
                    c = j+1;
                    System.out.println("El dato se encuentra en la fila "+f+" y en la columna "+c);
                }
            }

        }

        if(c == -1 && f == -1){
            System.out.println("El dato no esta en la matriz");
        }
    }

}
