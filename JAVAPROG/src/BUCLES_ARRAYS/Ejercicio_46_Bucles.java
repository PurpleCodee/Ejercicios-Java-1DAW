
package Ejercicios_Bucles;
import java.util.Scanner;

public class Ejercicio_46_Bucles {
/*Adivina el número:
Crea un programa que simule el juego de adivinar un número. El funcionamiento del
juego es el siguiente:
• El programa “piensa” un número entero aleatorio entre 1 y 100.
• A continuación pide un número entero al usuario.
• Mientras el número del usuario no sea el número “pensado”, el juego no acaba.
• Si el número del usuario es mayor que el “pensado”, se debe mostrar el mensaje:
“Te has pasado!!”
• Si el número del usuario es menor que el “pensado”, se debe mostrar el mensaje:
“Te has quedado corto!!”
• Cuando el usuario meta el mismo número que el “pensado”, se muestra el
mensaje: “Lo logrates!” y el juego acaba*/
    
    public static void main(String[] args) {
        
        int aleatorio = (int) (Math.random()*100 +1);//genero un numero aleatorio del 1 al 100
        System.out.println("El programa piensa en: ?");
        
          Scanner teclado = new Scanner (System.in);
          int jugador = 0;//inicializo una variable jugador con valor 0 para utilizarla para que no me salgan numeros negativos
           
         do { //utilizo un do while para decirle al usuario que no puede meter un numero negativo           
             System.out.print(" ¿Que numero crees que es ?: ");
             
              jugador = teclado.nextInt();//le pregunto al jugador
             
        } while (jugador <1 || jugador >100);//mientras que numero de jugador sea menor que 1 o mayor que 100 que es IMPOSIBLE
         
          while (jugador!=aleatorio) {//mientras el numero del jugador sea diferente al numero aleatorio se ejecuta el bucle
             
              if(jugador > aleatorio){ //si el numero del jugador es mayor al de la maquina te has pasado el usuario dice otro numero
                System.out.println("Te has pasado!!!"); 
                System.out.print("Di otro numero: ");
                jugador = teclado.nextInt();}//pido otro numero
              
              else if(jugador < aleatorio){//le doy otra opcion si el numero del jugador es menor al numero aleatorio se queda corto
                  System.out.println("Te ha quedado corto!!!");
                  System.out.print("Di otro numero: ");
                  jugador = teclado.nextInt();}//pido de nuevo un numero al usuario
              
              else if(jugador == aleatorio){//(esta opcion la pongo para estar mas segura) si los numeros coinciden  sale del bucle no hace falta esta opcion
                  
              }    
                                      
        }
         System.out.println("El juego ha acabado");  //salgo del bucle y el juego a acabado
          
    }
    
}
