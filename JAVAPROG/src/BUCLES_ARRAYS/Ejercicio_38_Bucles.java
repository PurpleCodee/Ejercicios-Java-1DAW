
package Ejercicios_Bucles;
import java.util.Scanner;


/*Queremos realizar un algoritmo que vaya pidiendo una sucesión de notas por
teclado hasta que se introduzca el valor -1. Tras eso se mostrará la media aritmética de
las notas introducidas. Importante: Hay que controlar que los valores de las notas
introducidas sea el correcto (entre 0 y 10)
b) Realiza una variante del ejercicio anterior donde el primer valor que se solicita indica
el número total de calificaciones que se deben introduci*/

public class Ejercicio_38_Bucles {

   
    public static void main(String[] args) {
        int contador = 0;//defino el contador para contar el numero de notas del usuario
        double notas_suma = 0;//defino notas_sumas para almacenar la suma de las notas que me da el usuario
        Scanner teclado = new Scanner (System.in);
        System.out.print("Dime una nota :");//pido nota al usuario
        double nota = teclado.nextDouble();
        if (nota >= 0 && nota <= 10){//solo cuento y acumulo las notas validas de 0 al 10
            contador++;//sumo cada numero que me da el usuario
            notas_suma = notas_suma + nota;//acumulo el valor de las notas que me da el usuario
        }
        
        while (nota!= -1) { //el usuario me da notas hasta que aparezca -1 que sera cuando acabe el bucle
            System.out.print("Dime una nota :");//repito lo mismo del primer if
            nota = teclado.nextDouble();//pido de nuevo la nota
            if(nota >= 0 && nota <= 10){//vuelvo a solo contar y acumular los numeros que esten entre el o y en 10
                contador++;//vuelvo a a sumar cada numero que me da el usuario
                notas_suma = notas_suma + nota;//acumulo el valor de las notas que me da el usuario
            }
        }
        double media = (notas_suma)/(contador);//creo una variable que sera el resultado de la media de las notas
        System.out.println("La media de las notas es: " + media);//muestro un mensaje con la media de las notas
    }
}

