package BUCLES_ARRAYS;

import java.util.Scanner;

public class M_59_again {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero_lista = 0;

        do {
            System.out.print("Dime un numero entre el 3 y el 5 si el numero es incorrecto se vuelve a pedir el dato: ");
            numero_lista = teclado.nextInt();

        } while (numero_lista < 3 || numero_lista > 5);

        System.out.println("El numero introducido sera el tamaño de las filas y columnas de la matriz");
        int lista[][] = new int[numero_lista][numero_lista];

        for (int i = 0; i < numero_lista; i++) {
            for (int j = 0; j < numero_lista; j++) {

                System.out.print("Introduce los valores de la matriz: ");
                lista[i][j] = teclado.nextInt();

                System.out.print("El valor de la posicion:" + " [" + i + "] " + "[" + j + "]" + lista[i][j] + " ");
                System.out.println("");
            }

        }

    }

}
