package EXCEPCIONES;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.InputMismatchException;

public class Ejercicio_106 {

    public static void main(String[] args) {
        /*1º Generar un numero entre 1 y 100
           2º El usuario debe de intentar adivinar el numero
           3º Cada vez que el usuario introduce un valor debe de decirle si es mayor o menor
           4º Cuando consiga adivinarlo debe de indicarlo y imprimir en pantalla el numero de intentos
           5º Si el usuario introduce cositas raras que no son un numero debe indicarlo por pantalla*/
        Scanner entrada = new Scanner(System.in);
        int random = (int) (Math.random() * (100 - 1 + 1) + 1);
        int usuario = 0;
        int contador = 0;

        do {
            try {
                System.out.print("Introduce un numero: " + random);
                contador++;
                usuario = entrada.nextInt();
               
                
                if (usuario > random) {
                    System.out.println("El numero es mayor al introducido");
                    System.out.println("El usuario no ha adivinado el numero NUMERO DE LA MAQUINA " + random);

                } else if(usuario < random) {
                    System.out.println("El numero es menor al introducido");
                    System.out.println("El usuario no ha adivinado el numero NUMERO DE LA MAQUINA " + random);
                   
                }else{
                    System.out.println("El usuario ha adivinado el numero ");
                    System.out.println("Numero de intentos: " + contador);   
                }

            }catch (InputMismatchException e) {
                System.out.println("Has introducido un caracter " + e.getMessage());
                 entrada.nextLine(); //importante limpiar el buffer
            }
        } while (usuario != random);
        entrada.close();
    }
}
