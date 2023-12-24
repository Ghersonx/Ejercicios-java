
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Arraylist_Objetos {
    //importamos el archivo dentrode una constante

    private static final String NOMBREFICHERO = "partidos.txt";

    public static void main(String[] args) {
        // Nos creamos un ArrayList de objetos de la Clase "PartidoFutbol"

        System.out.println("**** Creamos un ArrayList de objetos de la Clase \"PartidoFutbol\" ***");
        ArrayList<PartidoFutbol> partidos = new ArrayList<>();

        // Instanciamos el fichero donde estan los datos
        File fichero = new File(NOMBREFICHERO);
        Scanner s = null;

        System.out.println("... Leemos el contenido del fichero ...");
        try {
            s = new Scanner(fichero);
            while (s.hasNext()) {
                String linea = s.nextLine();
                String[] cortarString = linea.split("::");
                PartidoFutbol partido = new PartidoFutbol();

                partido.setEquipoLocal(cortarString[0]);
                partido.setEquipoVisitante(cortarString[1]);
                partido.setGolesLocal(Integer.parseInt(cortarString[2]));
                partido.setGolesVisitante(Integer.parseInt(cortarString[3]));

                partidos.add(partido);

            }

        } catch (Exception ex) {

        }
        System.out.println("tamaño del arraylist   " +partidos.size());
        System.out.println("Los resultados de los partidos son: ");
        for (PartidoFutbol partido : partidos) {
            System.out.println(partido.getEquipoLocal()+" "+
                    partido.getGolesLocal()+" "+
                    partido.getEquipoVisitante()+" "+
                    partido.getGolesVisitante());
        }
    }

}
