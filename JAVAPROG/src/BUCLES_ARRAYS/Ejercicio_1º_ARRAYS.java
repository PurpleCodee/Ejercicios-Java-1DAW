
package Ejercicios_Bucles;
import java.util.Scanner;

public class Ejercicio_1º_ARRAYS {
//LAS NOTAS DEBEN DAR DECIMALES A LA HORA DE MOSTRARSE 
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        double lista[]=new double[3];//la variable lista dara decimales el array va a tener 3 celdas que cada cela contendra una nota
        for (int i = 0; i < lista.length; i++) {//con este ford ejecutare 3 veces hasta que i tenga el valor de lista
            do {  //utilizo un do while para almacenar las notas              
                System.out.print("Dame la nota"+(i+1)+": ");//dame la nota la suma de que sera la celda i +1 dos puntos digo la nota
                lista[i]=teclado.nextDouble();//Almacenar la nota ingresada en el array 'lista'
            } while ((lista[i]<0)||(lista[i]>10));// Repetir si la nota está fuera del rango [0, 10] para que no ,me de un numero negativo
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println("La nota"+(i+1)+" es: "+lista[i]); // Mostrar cada nota con su posición en el array
        }
        
    }
    
}
