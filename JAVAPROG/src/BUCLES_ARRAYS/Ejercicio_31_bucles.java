
package Ejercicios_Bucles;
//Realizar un algoritmo que pida por teclado un numero entero y a continuación
//muestre todos los divisores de ese número
import java.util.Scanner;
public class Ejercicio_31_bucles {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Dime un numero entero :");
        int entero = teclado.nextInt();//variable que indica el numero entero introducido por el usuario
        
        teclado.close();
    
        for (int i = 1; i<=entero; i++) {//Para encontrar todos los divisores de (entero), necesitas dividir (entero) por todos los
            //números enteros desde 1 hasta (entero) y verificar si la división es exacta la division es exacta si el resto es 0
           
            if(entero%i==0){//en el if digo si el numero del usuario es divisible entre la variable i que vale 1
                            //si es divisible se le suma uno a la i hasta que se cumpla la condicion de que i sea menor o igual al numero del usuario
                System.out.println("Los divisores de " + entero + " son : " + i);//la cadena siempre dentro de los parentesis tonta
               
            }
 
        }
                    
    }
    
}
