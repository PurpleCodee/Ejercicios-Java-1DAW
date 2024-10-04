
package VARIABLES_CONDICIONALES;
import java.util.Scanner;
import java.lang.Math;

public class actividad24_DADOS {
//Pregunta el nombre de dos jugadores. A continuación, simula una partida de tirada//
//de dados: el primer jugador tira un dado de 6 caras y saca una puntuación. Luego hace
//lo mismo el segundo jugador. Al final se indica que jugador ha ganado.//
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
         
        System.out.println("¿Cual es tu nombre primer jugador?");//Pregunto los nombres a los jugadores//
        String nombre_1 = teclado.nextLine();
         
        System.out.println("¿Cual es tu nombre segundo jugador?");
        String nombre_2 = teclado.nextLine();
         
        teclado.close();//cierro no voy a preguntarles nada mas//
        
        int dado1 = (int) (Math.random()*6 +1);//creo las variables de los dados//
        int dado2 = (int) (Math.random()*6 +1);//casteo con un int y utilizo math.random para que me de un numero aleatorio//
                                                //math.random abarca de 0.1 a 1 a sique lo multiplico por 6 y sumo mas 1//
        
        System.out.println("Dado del jugador 1: " + dado1);//los jugadores empiezan a jugar//
        System.out.println("Dado del jugador 2: " + dado2);
        
        if(dado1 == dado2){//si dado 1 es igual que dado 2 habra empate//
            System.out.println("Hay empate");
        }else if(dado1 > dado2){//si dado 1 es mayor que dado 2 gara el jugador 1//
            System.out.println("Ha ganado: " + nombre_1);
        }else{
            System.out.println("Ha ganado: " + nombre_2);//si no fuese mayo directamente gana el jugador 2//
        }        
    }
       
         
        
}
    

