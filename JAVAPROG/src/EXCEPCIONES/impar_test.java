
package EXCEPCIONES;

public class impar_test {
    public static void main(String[] args) {
        
        try {
             Impar numerito = new Impar(24);
             System.out.println(numerito.toString());
             
        } catch (ImparException e) {
            System.out.println("El numero es par");
        }     
    } 
}