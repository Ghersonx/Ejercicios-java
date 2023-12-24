/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MASCOTAS;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Mascota {
       int edad;
       String raza;
       double peso;
       double tamaño;

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Mascota(int edad, String raza, double peso, double tamaño) {
        this.edad = edad;
        this.raza = raza;
        this.peso = peso;
        this.tamaño = tamaño;
    }
    
   
}


