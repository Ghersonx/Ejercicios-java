package POO1;

public class Libro {
    
    /*Atributos*/
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    /*Constructores*/
    
    public Libro(int pISBN, String pTitulo, String pAutor, int pNumPaginas){
    
        ISBN=pISBN;
        titulo=pTitulo;
        autor=pAutor;
        numeroPaginas=pNumPaginas;
    
    }
    
    /*Metodos*/

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numeroPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numeroPaginas = numPaginas;
    }
    
    @Override
    public String toString(){
        return "El libro "+titulo+" con ISBN "+ISBN+""
                + " creado por el autor "+autor
                + " tiene "+numeroPaginas+" páginas";
    } 
    
    
    
}
