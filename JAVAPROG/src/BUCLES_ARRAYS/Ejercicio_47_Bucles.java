
package Ejercicios_Bucles;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio_47_Bucles {
/*El juego de las bolas:
Este es un juego donde el jugador compite contra la máquina. Para ello:
• El usuario comienza introduciendo un numero natural positivo que representará :3
la cantidad de bolas inicial que hay en una urna.
• A continuación, la maquina decide quien empieza de forma aleatoria.
• En cada turno, el usuario o la máquina podrán retirar 1,2 ó 3 bolas (es decir,
eligen restar 1, 2 o 3).
◦ Si es el jugador, se le preguntará cuantas bolas quiere sacar (hay que
controlar que sean 1, 2 o 3).
◦ Si es la máquina, decidirá de forma aleatoria si saca 1,2 o 3 bolas.
• Los turnos se repiten de forma alternativa hasta que uno de los dos retira la
última bola. Quien haga eso, pierde.
Mejora: haz que la máquina decida si quita 1, 2 o 3 bolas en su turno dependiendo de las
bolas que haya en la urna (y no de forma aleatoria*/
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Introduce un numero positivo: ");
        int bolas_urna = teclado.nextInt();
        
        while (bolas_urna<0) {
            System.out.print("No es un numero positivo introducelo de nuevo : ");  
            
             bolas_urna=teclado.nextInt();
        }
        
        System.out.println("El numero es correcto");
        System.out.print("Dime un numero: ");
         int jugador = teclado.nextInt();
        
        int maquina = (int) (Math.random()*5+1);
       
        if(jugador >= 5){
            
        System.out.println( "el numero aleatorio es: " + maquina + " Turno del jugador"); }
        
        else{
            System.out.println("el numero aleatorio es: " + maquina + " Turno de la maquina");}
         
        
        }
}
    
        
    

