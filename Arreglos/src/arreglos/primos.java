/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author Dell G15 Ryzen
 */
public class primos {
    public static void main(String[] args) {
        int n = 7;
        int count=0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                count++;
            }
        }
        if(count == 2){
            System.out.println(n+"es primo");}
        else{
            System.out.println(n+"no es primo");
        }
                  
    }
}
