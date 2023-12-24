/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arraylist1;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Auto {
    private String matricula;
    private String color;

    public Auto(String matricula, String color) {
        this.matricula = matricula;
        this.color = color;
    }    

    @Override
    public String toString() {
        return "Auto{" + "matricula=" + matricula + ", color=" + color + '}';
    }
}
