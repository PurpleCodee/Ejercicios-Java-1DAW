
package programacion1ºTrimestre.javaapplication1;
import java.util.Scanner;

public class actividad_OPERACIONES {
    public static void main(String[] args) {
        // 1 Solicita dos numeros por teclado y muestra la suma
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dame dos numeros");
        
        System.out.print("primer numero: ");
        double a = teclado.nextDouble();
        
        System.out.print("segundo numero: ");
        double b = teclado.nextDouble();
        
        double elevado = Math.pow(a, b);//Con Math.pow elevamos a y b//
        
        System.out.println("Si sumamos el numero: " + a + " y el numero: " + b + " El resultado es: " + (a+b));
       //muestra la resta con dos numeros que haya solicitado el usuario
        System.out.println("Si restamos el numero: " + a + " y el numero: " + b + " El resultado es: " + (a-b));
        //muestra la multiclicacion con dos numero que haya solicitado el usuario
        System.out.println("Si multiplicamos el numero: " + a + " y el numero: " + b + " El resultado es: " + (a*b));
        //muestra el cociente con dos numeros que haya solicitado el usuario
        System.out.println("El cociente de: " + a + " entre: " + b + " es: " + (a/b));
        //eleva el cociente de a ente b
        System.out.println(a + " elevado a " + b + " da: " + (elevado));
        //FIN.
        
        
      
        
        
    
        
    }
    
}
