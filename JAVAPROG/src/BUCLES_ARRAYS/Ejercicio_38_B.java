
package Ejercicios_Bucles;

import java.util.Scanner;
 /*Queremos realizar un algoritmo que vaya pidiendo una sucesión de notas por
    teclado hasta que se introduzca el valor -1. Tras eso se mostrará la media aritmética de
    las notas introducidas. Importante: Hay que controlar que los valores de las notas
    introducidas sea el correcto (entre 0 y 10)
    
    b) Realiza una variante del ejercicio anterior donde el primer valor que se solicita indica
    el número total de calificaciones que se deben introduci*/
public class Ejercicio_38_B {

    
    public static void main(String[] args) {
          int contador = 0;//defino el contador para contar el numero de notas del usuario
        double notas_suma = 0;//defino notas_sumas para almacenar la suma de las notas que me da el usuario
        Scanner teclado = new Scanner (System.in);
        System.out.print("Dime una nota: ");
        double nota = teclado.nextDouble();
        
        for (int i = 0; i < nota; i++) {
            System.out.print("Dime otra nota: ");
            nota = teclado.nextDouble();
            if(nota >= 0 && nota <= 10){
                contador++;
                notas_suma = notas_suma + nota;    
            } 
        }
        double media = (notas_suma)/contador;
        System.out.println("la media de las notas es: " + media);
    }
    
}
