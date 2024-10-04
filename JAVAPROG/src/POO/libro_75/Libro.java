
package POO.libro_75;

/*75.- Crear una clase Libro que contenga los siguientes atributos: ISBN, Titulo, Autor,
Número de páginas (todos obligatorios y privados).
Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el
método toString() para mostrar la información relativa al libro con el siguiente
formato: “El libro TITULO con ISBN creado por AUTOR tiene NPAGINAS”
Para probar la clase, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por
pantalla. Por último, indicar cuál de los 2 tiene más páginas.*/

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int nPagina;
    
    //Metodo constructor

    public Libro(int ISBN, String titulo, String autor, int nPagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nPagina = nPagina;
    }

    public int getISBN() {//get para devolver un valor en este caso int 
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnPagina() {
        return this.nPagina;
    }

    public void setnPagina(int nPagina) {
        this.nPagina = nPagina;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String mostrarFrase(){
        String res = "";
        res = " El libro "+this.titulo+" con "+this.ISBN+" creado por "+this.autor+" tiene "+this.nPagina;
        return res;
    }

    @Override
    public String toString() {
        return mostrarFrase();
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
