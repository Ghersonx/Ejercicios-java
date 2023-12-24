/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listascircular;

/**
 *
 * @author Dell G15 Ryzen
 */
public class MetodoLista {

    private Nodo cabecera;

    public MetodoLista() {
        this.cabecera = null;
    }

    public boolean esVacia() {
        return this.cabecera == null;
    }

    public void insertarInicio(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            this.cabecera = nuevo;
            nuevo.setSig(cabecera);
        } else {
            Nodo aux = this.cabecera;
            do {
                aux = aux.getSig();
            } while (aux.getSig() != this.cabecera);
            aux.setSig(nuevo);
            nuevo.setSig(this.cabecera);
            this.cabecera=nuevo;
        }
        System.out.println("Nodo insertado al inicio con exito");
    }

    public void insertarFinal(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            this.cabecera = nuevo;
            nuevo.setSig(this.cabecera);
        } else {
            Nodo aux = this.cabecera;
            do {
                aux = aux.getSig();

            } while (aux.getSig() != this.cabecera);
            aux.setSig(nuevo);
            nuevo.setSig(this.cabecera);
        }
        System.out.println("Nodo insertado al final con exito");
    }

    public void mostrarLista() {
        if (this.cabecera == null) {
            return;
        }
        Nodo aux = this.cabecera;
        do {
            System.out.println(aux.getValor());
            aux = aux.getSig();
        } while (aux != this.cabecera);
    }

    public boolean buscar(int Abuscar) {
        if (esVacia()) {
            return false;
        }
        Nodo aux = this.cabecera;
        do {
            if (aux.getValor() == Abuscar) {
                return true;
            } else {
                aux = aux.getSig();
            }
        } while (aux != this.cabecera);

        return false;
    }

    public void modificar(int Abuscar, int cambio) {
        if (esVacia()) {
            System.out.println("Lista Vacía");
            return;
        }
        Nodo aux = this.cabecera;
        do{
            if (aux.getValor() == Abuscar){
                aux.setValor(cambio);
                System.out.println("Valor Modificado");
                return;
            }else{
                aux =aux.getSig();
            }
        }while(aux != cabecera);
        System.out.println("Valor no existe en la lista");
    }
    
    public void eliminar (int Abuscar){
        if (esVacia()) {
            return;
        }
        Nodo aux, ant =cabecera;
        do{
            if(ant.getSig().getValor() == Abuscar){
                aux =ant.getSig();
                ant.setSig(aux.getSig());
                if(aux == cabecera){
                    cabecera =aux.getSig();
                }
                if (aux == cabecera){
                   cabecera =null;
                }
                System.out.println("Elemento Eliminado");
                return;
            }else{
                ant= ant.getSig();
            }
        }while(ant != cabecera);
        System.out.println("No existe el dato a eliminar");
    }

}
