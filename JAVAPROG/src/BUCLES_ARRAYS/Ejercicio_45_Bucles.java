
package Ejercicios_Bucles;
import java.util.Scanner;

public class Ejercicio_45_Bucles {
/* Realiza un programa que pida al usuario un número entero mayor N mayor a 10.
A continuación, haz que muestre la lista de números del 1 al N sustituyendo los
múltiplos de 3 por la palabra FIZZ y los múltiplos de 5 por la palabra BUZZ. Además,
también deben sustituirse los múltiplos de 3 y 5 por la palabra FIZZBUZZ.
a) Muestra la lista de números en vertical.
b) Muestra la lista de números en horizontal separados por espacio.
c) Muestra la lista de números en horizontal separado por coma (,). Obviamente, el
último valor no debe llevar coma detrás*/
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int N;//DECLARO LA VARIABLE FUERA
        
        do {
            System.out.print("Ingrese un número entero mayor que 10: ");
            N = scanner.nextInt();//PIDO AL USUARIO DENTRO DEL DO
            if (N <= 10) {//SI N ES MENOS O IGUAL QUE 10 (SI N ES MENOR QUE 10 NO SE REALIZA EL BUCLE Y VUELVO A PREGUNTAR//
                System.out.println("El número ingresado debe ser mayor que 10.");//LE DIGO AL USUARIO QUE EL NUMERO DEBE SER MAYOR A 10
            }
        } while (N <= 10);//MIENTRAS QUE N SEA MENOR O IGUAL A 10 SE EJECUTA LO SIGUIENTE

        int i = 1;//DCLARO UNA VARIABLE CON VALOR DE 1 PARA COMPARAR SI ES DIVISIBLE
        do {//CON EL DO EJECUTO EL CONTENIDO
            if (i % 3 == 0 && i % 5 == 0) {//SI I CON VALOR DE 1 ES DIVISIBLE ENTRE 3 Y 5 APARECERA EL MENSAJE
                System.out.print("FIZZBUZZ");
            } else if (i % 3 == 0) {//LE DOY MAS OPCIONES SI I ES DIVISIBLE ENTRE 3 APARECE FIZZ
                System.out.print("FIZZ");
            } else if (i % 5 == 0) {//SI ES DIVISIBLE ENTRE 5 APARECE BUZZ
                System.out.print("BUZZ");
            } else {
                System.out.print(i);//SI NO LO ES APARECE QUE VALE 1
            }//LOS COMPARO TANTAS VECES PARA QUE ME APAREZCAN LOS DIFERENTES MENSAJES 
            
            if (i < N) {//CADA VEZ QUE i(1) sea menor que N se pondra una " , " para separar los numeros menores que N pero no aparecera al final
                System.out.print(", ");
            } else {
                System.out.println();//pongo SOU println para que de un salto de linea y no se ponga la " , " asi que no aparecera una coma
            }
            
            i++;// con el contador le sumaremos 1 a (i) hata que llegue al valor N
        } while (i <= N);
    }
}
    
    

