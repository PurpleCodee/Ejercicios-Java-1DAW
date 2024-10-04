
package Ejercicios_Bucles;
import java.util.Scanner;

public class Ejercicio_41_Bucles {
    //Algoritmo que solicite al usuario un numero entero y a continuación muestre la tabla
    //de multiplicar de ese número hasta el 10
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);//declaro el tipo scanner para pedir por teclado
        
        System.out.print("Dime un numero entero:");
        int num = teclado.nextInt();//llamo a mi variable num y pido por teclado un numero entero
        
        if(num>0){//si num es mayor que 0 se ejecuta el bucle
        
            for (int i = 1; i <= 10; i++) {//utilizo mi bucle for porque se el principio y el fin del bucle 
                int res = num*i;//i vale 1, 1 es menor o igual 100 res que es resultado vale el numero del usuario x i que vale 1 se repite hasta 10
                System.out.println(num + "x" + i +"=" + res);//creo una cadena para que me aparezca por pantalla la tabla de multiplicar hasta el 10
                
            }
}
        
    
    }
    
}
