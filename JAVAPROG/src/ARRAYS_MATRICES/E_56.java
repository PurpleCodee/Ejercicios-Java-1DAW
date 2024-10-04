package ARRAYS_MATRICES;

import java.util.Scanner;

public class E_56 {

    /*56.- Usando arrays: escribe un programa que pida 10 números naturales y a
            continuación, indique cuál es el valor máximo de esa sucesión de números, el número
            de veces que aparece y sus respectivas posiciones. Ejemplo:
            7 10 143 10 52 143 72 10 143 7
            El valor máximo es el 143
            Aparece 3 veces en las posiciones 2,5,8*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lista[] = new int[10];
        int conMayor = 0;
        int mayor = 0;

        // Leer y almacenar los números
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Introduce 10 valores: ");
            lista[i] = teclado.nextInt();

            if (lista[i] > mayor) {
                mayor = lista[i];
            }
        }

        // Contar apariciones y encontrar posiciones
        System.out.println("El valor máximo es el " + mayor);

        System.out.print("Aparece en las posiciones ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == mayor) {
                conMayor++;
                System.out.print(i + " ");

            }
        }
        System.out.println("\nAparece " + conMayor + " veces");
    }
}
