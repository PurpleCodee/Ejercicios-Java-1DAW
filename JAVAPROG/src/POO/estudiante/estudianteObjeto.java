
package POO.estudiante;


public class estudianteObjeto {

   
    public static void main(String[] args) {
        
        double cantidadCalificaciones [] = {-1,-1,-1,-1,-1,-1,-1,-1};
        
        Estudiante nami = new Estudiante("Nami","Gatin", cantidadCalificaciones);
        
        System.out.println(nami.toString());
        nami.insertarNota(6);
        nami.insertarNota(9);
        nami.insertarNota(3);
        nami.insertarNota(7);
        nami.insertarNota(3);
        nami.insertarNota(10);
        nami.insertarNota(5);
        nami.insertarNota(7);
        nami.insertarNota(4);       
        System.out.println(nami.toString());
   
    }
    
}
