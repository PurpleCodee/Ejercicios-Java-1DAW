
package ARRAYS_MATRICES;

import java.util.Scanner;


public class E_isma {
    /*Pide al usuario ingresar la longitud de un array.
        Crea un array de números enteros con la longitud especificada.
        Rellena el array con números ingresados por el usuario.
        Calcula y muestra la suma de los números pares en el array.
        Calcula y muestra la suma de los números impares en el array.*/

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int longitud = 0;
        int sumaPar = 0;
        int sumaImpar = 0;

        //pido al usuario la longitud del array
        System.out.print("Introduce la longitud del array: ");
        longitud = teclado.nextInt();

        //creo el array con la longitud que me dice el usuario
        int array[] = new int[longitud];

        //relleno el array con numeros introducidos por el usuario
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce los valores del array: ");
            array[i] = teclado.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                sumaPar += array[i]; 
            }else{
                sumaImpar += array[i];
            }
        }
        
        System.out.println("La suma de los numeros pares es: " + sumaPar);
        System.out.println("La suma de los numeros impares es: " + sumaImpar);
        
    }
    
}
