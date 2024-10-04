package EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_104 {

    public static void main(String[] args) {
        //1ºImplementar array de numeros decimales
        //2ºIndicar el tamaño por teclado
        //3ºUtilizar un bucle para pedir tantos valores como se pidan por tecladocomo tamaño del array
        //4ºY guardarlo en la celda del array
        //5ºManejar las excepciones y segir pidiendo valores hasta rellenar el 

        Scanner entrada = new Scanner(System.in);
        int tamanio = 0;
        double valores = 0;
        int i = 0;

        do {
            try {
                System.out.print("Introduce el tamaño de la lista: ");
                tamanio = entrada.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("El numero introducido no es correcto");
                entrada.next();
            }

        } while (tamanio <= 0);

        double lista[] = new double[tamanio];

        //relleno la lista
        while (i < lista.length) {
            try {
                System.out.print("Introduce un número decimal: ");
                lista[i] = entrada.nextDouble();
                i++;

            } catch (InputMismatchException e) {//adecuada para el flujo
                System.out.println("El numero introducido no es correcto: ");
                entrada.next();
                
                //inecesarias respecto al funcionamiento del codigo pero las dejo
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("La posicion a la que intentas acceder no existe:\n" + e.getMessage());

            } catch (NegativeArraySizeException e) {

                System.out.println("El numero introducido es un valor negativo \n" + e.getMessage());
            } catch (IllegalStateException e) {

                System.out.println("El teclado se ha cerrado anter de tiempo \n" + e.getMessage());
            }
        }
        //mostrar la lista en horizontal
        for (int j = 0; j < lista.length; j++) {
            System.out.print(lista[j] + " ");

        }
        entrada.close();
    }
}
