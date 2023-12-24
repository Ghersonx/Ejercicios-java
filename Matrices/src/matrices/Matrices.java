/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;


/**
 *
 * @author Dell G15 Ryzen
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String names[][][] = {{
            {"Mike", "Joe", "John"},
            {"Seth", "Bryn", "Paul"},
            {"Clarke", "Denly", "Ambrose"}
        }
        };

        for (int x = 0; x <1; x++) {
            for (int y = 0; y <= 2; y++) {
                for (int z = 0; z <= 2; z++) {
                    System.out.print(names[x][y][z] + " ");
                }
                System.out.println();
            }
        }
        
        

    }
    
}
