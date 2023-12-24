/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

/**
 *
 * @author Dell G15 Ryzen
 */
public class Cola {

    private Nodo inicio, fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public void enColar(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSig(nuevo);
            fin = nuevo;
        }
    }

    public int desenColar() {
        if (!esVacia()) {
            int dato = inicio.getValor();
            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                inicio = inicio.getSig();
            }
            return dato;
        }else{
            return Integer.MIN_VALUE;
        }
    }
    
    public void mostrarCola(){
        Nodo aux=inicio;
        while(aux != null){
            System.out.println("|\t|"+aux.getValor()+"|\t|");
            aux=aux.getSig();
        }
    }
    public boolean buscar(int valor){
        Nodo aux = inicio;
        boolean existe =false;
        while(existe!= true && aux != null){
            if(valor == aux.getValor()){
                existe=true;
            }else{
                aux=aux.getSig();
            }
        }return existe;
    }

}
