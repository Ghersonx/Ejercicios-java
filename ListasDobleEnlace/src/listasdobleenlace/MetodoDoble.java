/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdobleenlace;

/**
 *
 * @author Dell G15 Ryzen
 */
public class MetodoDoble {

    private Nodo cabecera;

    public MetodoDoble() {
        this.cabecera = null;
    }

    public boolean esVacia() {
        return this.cabecera == null;
    }

    public void retroceder() {
        if (!esVacia()) {
            while (this.cabecera.getAnt() != null) {
                this.cabecera = this.cabecera.getAnt();
            }
        }
    }

    public void avanzar() {
        if (!esVacia()) {
            while (this.cabecera.getSig() != null) {
                this.cabecera = this.cabecera.getSig();
            }
        }
    }

    public void mostarDesdePrimero() {
        if (esVacia()) {
            System.out.println("Lista Vacia ");
            return;
        }
        retroceder();
        Nodo aux = this.cabecera;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getSig();
        }

    }

    public void mostrarDesdeUltimo() {
        if (esVacia()) {
            System.out.println("Lista Vacia ");
            return;
        }
        avanzar();
        Nodo aux = this.cabecera;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getAnt();
        }
    }

    public void insertarPrincipio(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            this.cabecera = nuevo;
        } else {
            retroceder();
            nuevo.setSig(this.cabecera);
            this.cabecera.setAnt(nuevo);
            this.cabecera = nuevo;
        }
    }

    public void insertarFinal(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            this.cabecera = nuevo;
        } else {
            avanzar();
            nuevo.setAnt(this.cabecera);
            this.cabecera.setSig(nuevo);
        }
    }

    public boolean buscar(int valor) {
        if (esVacia()) {
            System.out.println("Lista Vacia ");
            return false;
        }
        retroceder();
        Nodo aux = cabecera;
        while (aux != null) {
            if (aux.getValor() == valor) {
                return true;
            } else {
                aux = aux.getSig();
            }
        }
        return false;
    }

    public void modificar(int abuscar, int cambio) {
        if (esVacia()) {
            return;
        }
        retroceder();
        Nodo aux = this.cabecera;
        while (aux != null) {
            if (aux.getValor() == abuscar) {
                aux.setValor(cambio);
                return;
            } else {
                aux = aux.getSig();
            }
        }
    }

    public void eliminarValor(Integer valor) {
        retroceder();
        boolean encontrado = false;
        Nodo aux = this.cabecera;
        Nodo atras = null;
        while (aux != null && !encontrado) {
            if (aux.getValor() == valor) {
                encontrado = true;
                if (aux == this.cabecera) {
                    if (aux.getSig() == null && aux.getAnt() == null) {
                        this.cabecera = null;
                    } else {
                        this.cabecera = this.cabecera.getSig();
                        this.cabecera.setAnt(null);
                    }
                } else {
                    if (aux.getSig() != null) {
                        atras.setSig(aux.getSig());
                        aux.getSig().setAnt(aux.getAnt());
                        aux.setSig(null);
                        aux.setAnt(null);
                    } else {
                        atras.setSig(aux.getSig());
                        aux.setAnt(null);
                    }

                }

            }
            atras = aux;
            aux = aux.getSig();

        }
        if (encontrado) {
            System.out.println("Nodo eliminado con exito");
        } else {
            System.out.println("Nodo no fue encontrado");
        }

    }

}
