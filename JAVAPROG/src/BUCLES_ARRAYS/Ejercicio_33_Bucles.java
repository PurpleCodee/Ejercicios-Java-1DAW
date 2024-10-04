
package Ejercicios_Bucles;
import java.util.Scanner;
/*Realizar un programa que calcule el resultado de elevar un número a otro. Para ello,
leerá dos números enteros, la base y el exponente, y calculará el resultado, mostrándolo
en pantalla. No se pueden utilizar las funciones que te calculen automáticamente el
resultado como, por ejemplo, la función Math.pow*/

public class Ejercicio_33_Bucles {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
       System.out.print("Dime la base : ");
        double base = teclado.nextDouble();
        
        System.out.print("Dime el exponente : ");
        double exponente = teclado.nextDouble();
        
        teclado.close();
        
        double res = 1;//creo una variable a parte que sera resultado es 1 porque una base elevado a 0 siempre es 1
        
        for (int i = 0; i < exponente; i++) {//i vale 0 al principio i es menor que el exponente entondes ejecuta la condicion de abajo
            
            res = res*base; //res que es el valor de la base se multiplic por si mismo y ahora el valor de res sera el resultado de la multiplicacion
                            //
            System.out.println("Resultado: " + res);
        }
        
        
    }
}
