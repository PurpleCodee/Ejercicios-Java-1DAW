
package programacion1ºTrimestre.javaapplication1;
import java.util.Scanner;

public class actividad_DNI {
    public static void main(String[] args) {
        //Crear un algoritmo que pida al usuario su nombre,su dni y fecha de nacimiento despues mostrarlo por pantalla//FIN
        Scanner teclado = new Scanner (System.in);
        System.out.println("Completa los datos:");
        
        System.out.print("Nombre........: ");
        String nombre = teclado.nextLine(); //Solicito el nombre al usuario
        System.out.print("Dni........: ");  
        String dni = teclado.nextLine();//Solicito el dni al usuario
        System.out.print("Fecha de nacimiento...: ");
        String fecha = teclado.nextLine();//Solicito la fecha al usuario
        
        System.out.println("Nombre........: " + nombre);
        System.out.println("Dni........: " + dni);
        System.out.println("Fecha de nacimiento...: " + fecha);
        
       
        
        
        
        
    }
    
}
