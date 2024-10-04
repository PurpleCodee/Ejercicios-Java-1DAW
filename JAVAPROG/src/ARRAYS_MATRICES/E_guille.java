package ARRAYS_MATRICES;

import java.util.Scanner;

public class E_guille {

    /*Crea una matriz tamaño m*n pidiendolo por el usuario
        Los elementos de la mtriz tendran valores aleatorios entre el 1 y 10
        Muestra los elementos de la matriz por pantalla
        cuanta los valores que sean pares
        cuenta los valores que sean divisible entre 5
        si la cantidas de elementos que son pares mas los que son divisibles entre 5 son mayores a 5 muestra por pantalla locura y el numero mayor del array
        si la cantidad de elementos que son pares mas los que son divisible entre 5 son iguales a 5 muestra por pantalla locurilla y el mayor elemento de la diagonal
        si la cantidad de elementos que son pares mas los que son divisibles entre 5 son menores que 5 muestra por pantalla pues no y el numero menor del array
        si la suma de todos los elementos de la matriz es igual o msuperior a 10 muestra por pantalla Guille es un poco cabron
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);//Pido por teclado de que tamño seran las filas y las columnas

        int mayor = 0;
        int menor = 0;
        int pares = 0;
        int divisibles_5 = 0;
        int suma = 0;
        int mayor_diagonal = 0;

        System.out.print("Dime un numero de filas: ");
        int m = teclado.nextInt();

        System.out.print("Dime un numero de columnas: ");
        int n = teclado.nextInt();

        int matriz[][] = new int[m][n];//creo la matriz con el tamaño que eligio el usuario

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);//introduzco en la matriz valores aleatorios entre 1 y 10
                System.out.print(matriz[i][j] + "\t");

                suma += matriz[i][j];

                if (matriz[i][j] % 2 == 0) {
                    pares++;

                }
                if (matriz[i][j] % 5 == 0) {
                    divisibles_5++;

                }

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];

                }
                if (i == j && matriz[i][j] > mayor_diagonal) {
                    mayor_diagonal = matriz[i][j];

                }
                if (i == 0 && j == 0) {
                    menor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            System.out.println(" ");
        }
        int suma_total = pares + divisibles_5;

        if (suma_total > 5) {
            System.out.println("locura");
            System.out.println("Número mayor de la matriz: " + mayor);
        } else if (suma_total == 5) {
            System.out.println("locurilla");
            System.out.println("Mayor elemento de la diagonal: " + mayor_diagonal);
        } else {
            System.out.println("pues no");
            System.out.println("Número menor de la matriz: " + menor);
        }

        if (suma >= 10) {
            System.out.println("Guille es un poco cabron");
        }

        System.out.println("La suma de todos los elementos de la matriz: " + suma);

    }

}
