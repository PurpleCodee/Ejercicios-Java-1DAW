
package EXCEPCIONES;
public class Ejercicio_103 {
    public static void main(String[] args) {
         //estructura try catch
         try {
              //1º Mostrar texto 
             System.out.println("Programa automatico");
             
             //3º Lanzar la excepcion indicada
             //lanzar la mia propia mas adelante
             throw new RuntimeException("lanzando la excepcion");   
            
        } catch (RuntimeException e) {
            //2ºCrear la excepcion que me indica el ejercicio
             System.out.println("Soy una excepcion: " + e.getMessage());
        }   
    }
}
