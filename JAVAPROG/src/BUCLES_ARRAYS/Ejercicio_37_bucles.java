
package Ejercicios_Bucles;
import java.util.Scanner;
/*Escribe un algoritmo que pida una lista de números enteros uno a uno hasta que se
introduzca el valor 0. A continuación debe escribir por pantalla la posición de la primera
y de la última aparición del número 12 dentro de la lista*/

public class Ejercicio_37_bucles {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int primera_aparicion = -1; //Inicializo la variable de la primera aparicion del 12 
        int ultima_aparicion = -1;//Inicializo la variable de la ultima aparicion del 12 
        int contador_numeros = 0;//Inicializ un contador para llevar un seguimiento de los números ingresados
        System.out.print("Dime un numero: ");//le pido un numero al usuario
        int numero = teclado.nextInt();
        contador_numeros++;//Incrementa el contador
        if (numero == 12){ // verifico si el numero del usuario es 12
            primera_aparicion = contador_numeros;//Si es 12, actualiza la posición de la primera aparición
            ultima_aparicion = contador_numeros;//También actualiza la posición de la última aparición
        }

        while (numero != 0){ //Inicio un bucle while que se ejecutará mientras el número ingresado sea diferente de 0
            System.out.print("Dime otro numero: ");//pido otro numero al usuario
            numero = teclado.nextInt();
            contador_numeros++; // Incrementa el contador de números
            if (numero == 12 && ultima_aparicion != -1){// Si el número ingresado es igual a 12 y ya se encontró una aparición previa
                ultima_aparicion = contador_numeros;// Actualiza la posición de la última aparición
            }else if(numero == 12 && ultima_aparicion == -1){//Si el número es igual a 12 y es la primera aparición
                primera_aparicion = contador_numeros;//Actualiza la posicion de la primera aparicion
                ultima_aparicion = contador_numeros;//Actualiza la posicion de la segunda aparicion
            }
        } 
        
        if (ultima_aparicion == -1 && primera_aparicion == -1){// Si no se encontró ninguna aparición del 12
            System.out.println("El numero 12 no aparece en la lista");
        }else{//Si se encontró al menos una aparición del 12 
            System.out.println("Primera aparicion: " + primera_aparicion);//muestra la primera posicion
            System.out.println("Ultima aparcicion: " + ultima_aparicion);//muesra la segunda posicion
        }
    }
}
