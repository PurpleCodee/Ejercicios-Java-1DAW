
package programacion1ºTrimestre.javaapplication1;
//EJERCICIO 2º PEDIR UN NUMERO Y DECIR SI ES PAR O IMPAR//
import java.util.Scanner;
public class ejercicio_PAR_IMPAR {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Dime un numero:");
    int numero = teclado.nextInt();
    //verifico si el numero es par o impar//
    if (numero %2 == 0)//Con el porcentaje saco el resto de un numero si es 0 sera par y siempre lo divido entre 2
        System.out.print(numero + " " + "es un numero par");
    else{
        System.out.print(numero + " " + "es un numero impar");
    }
   
    }
}    

