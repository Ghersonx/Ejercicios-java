/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JERARQUIA;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Herencia {

    public static void main(String[] args) {

        Camion tractomula = new Camion(3.5, 1001, "Ford", "2019");
        System.out.println(tractomula.getId());
        System.out.println(tractomula.getMarca());
        System.out.println(tractomula.getModelo());
        System.out.println(tractomula.getCapacidad());
    }
}

class Vehiculo {

    private int id;
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

  /*  public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }*/

    public Vehiculo(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

class Camion extends Vehiculo {

    private double capacidad;

    public Camion() {
    }

    public Camion(double capacidad, int id, String marca, String modelo) {
        super(id, marca, modelo);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
}
