
package programacion1ºTrimestre.javaapplication1;
//1º EJERCICIO debo pedir dos numeros al usuario y (a y b) y muestro por pantalla la division//
import java.util.Scanner;
public class ejercicio_DIVISOR_DIVIDENDO {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //pido dos numeros al usuario y lo muestro por pantalla//
        System.out.print("Dime el dividendo: ");
        double a = teclado.nextDouble();
        
        System.out.print("Dime el divisor: ");
        double b = teclado.nextDouble();
        teclado.close();
        
        if (b == 0){// if significa si b es igual a 0 es cierto escribe un numero que no sea 0//
            System.out.println("Escribe un divisor que no sea 0");
        }else{ //else significa sino si no lo es divide y muestra el resultado//
            double resultado = a/b;//Creo una variable que sea resultado y que divida a entre b//
            System.out.print("Este seria el resultado si dividimos :" + resultado);
        }
    }
}   
