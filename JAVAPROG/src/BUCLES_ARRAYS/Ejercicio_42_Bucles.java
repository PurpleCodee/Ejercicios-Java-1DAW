
package Ejercicios_Bucles;
import java.util.Scanner;

public class Ejercicio_42_Bucles {
//Escribe un algoritmo que lea por teclado un número N entero positivo y dibuje un
//cuadrado de asteriscos de lado N. Pej: Si el número es 4, se obtiene
    
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
        
        System.out.print("Dime un numero entero:");
        int N = teclado.nextInt();
        teclado.close();
        
        for (int i = 0; i < N; i++) {
            
            for (int j = 0; j < N; j++) {//ahora este for guarda el valor de N que si el usuario hubiese dicho 4 seria 4 4 veces 4 cada *
                
                System.out.print(" *");//este print muesta en una linea
                
            }
             System.out.println();//y esta para que los demas * den un salto de linea y se forma un cuadrado
            
        }
    }
}

