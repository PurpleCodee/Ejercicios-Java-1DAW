
package POO.libro_75;

import POO.libro_75.Libro;


public class libroObjeto {

    
    public static void main(String[] args) {
        int masPaginas = 0;
        Libro miau = new Libro(23000, "miau aventuras", "Namicita", 200);
        Libro guau = new Libro(45000, "super aventuras de Luna", "Lunita", 123);
       
        String Nami = miau.getAutor();
        String Luna = guau.getAutor();
        
        int paginasMiau = miau.getnPagina();
        int paginasGuau = guau.getnPagina();
       
        
        if (paginasMiau > paginasGuau) {
            System.out.println("El libro de " + Nami + " tiene mas paginas " + " que el libro de " + Luna);
            
        }
        else if (paginasGuau > paginasMiau) {
            System.out.println("El libro de " + Luna + " tiene mas paginas " + " que el libro de " + Nami);
       
        }
        else{
            System.out.println("Los dos tienen las mismas paginas");
        }
        
     
    }
    
}
