package prueba;
import java.util.*;
public class parcialPrueba {

        public static void main (String[]args) {

            Integer[] numeros = {1, 3, 5, 7, 8, 9, 0, 1, 5, 11, 3, 1, 12, 15, -1};
            ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(numeros));
            HashSet<Integer> numSet = new HashSet<Integer>(numList);
            numList.clear();
            numList.addAll(numSet);
            Collections.sort(numList, Collections.reverseOrder());

            System.out.println("ArrayList original: " + Arrays.toString(numeros));
            System.out.println("ArrayList resultante: " + numList);
            System.out.println("Número mayor: " + numList.get(0));
            System.out.println("Número menor: " + numList.get(numList.size() - 1));
            System.out.println("Número en la mitad: " + numList.get(numList.size() / 2));
        }
}
