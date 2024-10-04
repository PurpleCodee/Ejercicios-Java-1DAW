
package ARRAYS_MATRICES;

import java.util.Scanner;

public class E_1_Matrices_POO {
    /*Crea un programa y realiza las siguientes acciones:
        a) (0,5 puntos) Pide al usuario un numero N mayor a 1 (si el usuario no mete un
        numero correcto, vuelve a pedirlo). Crea un array bidimensional llamada ma-
        triz de tamaño NxN
    
        b) (0,25 puntos) Rellena la matriz con valores aleatorios entre 3 y 15
    
        c) (0,75 puntos) Muestra por pantalla el contenido de matriz respetando el número
        de filas y columnas. Es decir, todos los valores de una fila deben salir en hori-
        zontal separados por espacios y debajo, la siguiente fila. Además, todos los
        valores deben ocupar 2 espacios. Si un valor ocupa solo un espacio, ponle un
        0 delante.
    
        d) (0,5 puntos) Calcula la media de la diagonal principal y muestra ese valor por
        pantalla
    
        APARTADO A
        Introduce un valor mayor a 1: -7
        ERROR!! El número debe ser mayor a 1
        Introduce un valor mayor a 1: 3
    
        APARTADO C
        10 08 11
        12 15 12
        02 09 08*/
    public static void main(String[] args) {
        //Pido por teclado un numero mayor que 1 y compruebo que el usuario no me da un numero incorrecto
        int N = 0;
        int max = 15;
        int min = 3;
        int sumaDiagonal = 0;
        double mediaDiagonal = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Dime un numero mayor que 1: ");
            N = teclado.nextInt();

            if (N <= 0) {
                System.out.println("ERROR no es un numero valido");
            }
        } while (N < 0);
        
        //creo una matriz con el tamaño e filas y columnas que me a dado el usuario por teclado
        int matriz [][] = new int [N][N];
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                    
                    matriz[i][j] = (int) (Math.random()*(max-min+1)+min); 
                     if (matriz[i][j] < 10) {
                         System.out.print("0");
                     }
                  System.out.print(matriz[i][j] + " ");
            }
              System.out.println(""); 
              //calculo la media de la diagonal principal de la matriz
          
        }
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal+= matriz[i][i];//ELEMENTOS DE LA DIAGONAL
        }
        mediaDiagonal = sumaDiagonal/matriz.length;
        System.out.println("La suma de los elementos de la diagonal es " + sumaDiagonal + " y " + " la media de la diagonal pricipal es: " + mediaDiagonal);

    }
    
}
