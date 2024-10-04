
package Ejercicios_Bucles;
import java.util.Scanner;

public class Ejercicio_43_Bucles {
//Escribe un algoritmo que lea por teclado un número N entero positivo y dibuje un
//triangulo de asteriscos con base y altura N. Pej, Si el número es 5 se obtiene:
    
    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
        
        System.out.print("Dime un numero entero:");
        int N = teclado.nextInt();
        
        teclado.close();
        
        for (int i = 1; i <= N; i++) {// significa que iterar Se realiza la accion repetitiva desde la primera fila hasta la fila N.
            
            for (int j = 1; j <= N - i; j++) {//para imprimir espacios en blanco al principio de cada fila, lo que alinea el triángulo a la derech//
                                              //El número de espacios en blanco a imprimir se calcula como N - i.
                System.out.print(" ");//el espacio    
            }
            for (int j = 1; j <= i * 2 - 1; j++) {// El número de asteriscos en cada fila se calcula como i * 2 - 1. 
                                                //Esto crea el patrón de asteriscos en forma de triángulo equilátero.
                System.out.print("*");
            }
            System.out.println();//hace un salto de linea
        }
        
      
       
    }
    
}
