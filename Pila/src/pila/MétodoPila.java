/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author Dell G15 Ryzen
 */
public class MétodoPila {
    // Puntero que indica el inicio de la pila o tambein conocida como el
    // tope de la pila.
    private Nodo inicio;
    
    //constructor
    public MétodoPila() {
        this.inicio =null;
    }
    
    /**
     * Consulta si la pila esta vacia.
     * retorna true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia(){
        return inicio==null;
    }
    
    //Método de apilar o push para agregar un nuevo nodo a la pila
    public void apilar(int valor){
        //Define un nuevo nodo
        Nodo nuevo = new Nodo();
        //Agregar el valor al nodo
        nuevo.setValor(valor);
        if(esVacia()){
            //inicializa la pila con el nuevo valor
            inicio=nuevo;
        }else{
            //Agrega el nuevo nodo al inicio de la pila
            nuevo.setSig(inicio);
            inicio=nuevo;
        }
    }
    //metodo de pop o desapilar elimina el elemento del tope de la pila
    public int desapilar(){
        if(!esVacia()){
            int dato=inicio.getValor();
            //asigna el primer nodo al siguiente de la pila
            inicio=inicio.getSig();
            return dato;
        }else{
            //devolver  valor para indicar que la pila esta vácia
            return Integer.MAX_VALUE;
        }
    }
    public boolean buscar(int valor){
        //creo una copia de la pila
        Nodo aux=inicio;
        //bandera para verificar si existe el elemento a buscar
        boolean existe= false;
        //Recorro la pila hasta llegar encontrar el nodo o llegar al final 
        while(existe!= true && aux!=null){
            //compara si el nodo es igual al de la referencia
            if(valor == aux.getValor()){
                existe = true;                
            }else{
                //Avanza al siguiente nodo
                aux =aux.getSig();
            }
        }
        return existe;
    }
    
    public void mostrarPila(){
        Nodo aux =inicio;
        while(aux!=null){
            System.out.println("|\t"+aux.getValor()+"\t|");
            System.out.println("----------------");
            aux=aux.getSig();
        }
    }
}
