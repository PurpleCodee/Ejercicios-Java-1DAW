
package BUCLES_ARRAYS;
import java.util.Scanner;

public class Ejemplos_ejercicios_arrays {

       public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        int max = 15;
        int min = 3;

        int random = (int) (Math.random() * (max - min + 1) + min);

        System.out.println(random);

        int matriz[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Intercambiar filas 1 y 2
        int[] temp = matriz[0];
        matriz[0] = matriz[1];
        matriz[1] = temp;

        // Imprimir la matriz después de intercambiar filas 1 y 2
        System.out.println("\nMatriz después de intercambiar filas 1 y 2: ");

        // Intercambiar columnas 0 y 2
        for (int i = 0; i < matriz.length; i++) {
            int tempValue = matriz[i][0];
            matriz[i][0] = matriz[i][2];
            matriz[i][2] = tempValue;
        }

        // Imprimir la matriz después de intercambiar columnas 0 y 2
        System.out.println("\nMatriz después de intercambiar columnas 0 y 2:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        //Metodo para ordenar una matriz de mayor a menor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length - 1; j++) {
                for (int k = 0; k < matriz[0].length - 1 - j; k++) {
                    if (matriz[i][k] < matriz[i][k + 1]) {
                        int temp2 = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = temp2;
                    }
                }
            }
        }
        //Metodo para ordenadr una matriz de menor a mayor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length - 1; j++) {
                for (int k = 0; k < matriz[0].length - 1 - j; k++) {
                    if (matriz[i][k] > matriz[i][k + 1]) {
                        int temp3 = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = temp3;
                    }
                }
            }
        }

        //ordenar numeros de una matriz con comas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[0].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }

        // Convertir el número a cadena sin usar operaciones aritméticas ni caracteres
        String numeroStr = "";

        // Mostrar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                // Si el número es menor que 10, agregar un cero delante
                if (matriz[i][j] < 10) {
                    numeroStr = "0" + matriz[i][j];
                } else {
                    numeroStr = "" + matriz[i][j];
                }

                System.out.print(numeroStr + " ");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }

        //Metodo para obtener la media de la diagonal principal
        int sumaDiagonal = 0;

        // Determinar el tamaño de la diagonal principal
        int elementosDiagonal;
        if (matriz.length < matriz[0].length) {
            elementosDiagonal = matriz.length;
        } else {
            elementosDiagonal = matriz[0].length;
        }

        for (int i = 0; i < elementosDiagonal; i++) {
            sumaDiagonal += matriz[i][i];
        }

        double mediaDiagonal = (double) sumaDiagonal / elementosDiagonal;
        System.out.println("Media de la diagonal principal: " + mediaDiagonal);
        
        
        
        // Método para buscar un número en una matriz
        int numero = 0;
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("El número " + numero + " está en la "
                            + "posición [" + i + "][" + j + "].");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("El número " + numero + " no está en la matriz.");
        }

        //Metodo para sumar las diagonales principales de las matrices.
        elementosDiagonal = 0;
        if (matriz.length < matriz[0].length) {
            elementosDiagonal = matriz.length;
        } else {
            elementosDiagonal = matriz[0].length;
        }

        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;

        for (int i = 0; i < elementosDiagonal; i++) {
            sumaDiagonal1 += matriz[i][i];
            sumaDiagonal2 += matriz[i][i];
        }

        System.out.println("La suma de las diagonales principales de ambas matrices "
                + "es: " + (sumaDiagonal1 + sumaDiagonal2));

        // Método para multiplicar dos matrices
        int filasMatriz1 = matriz.length;
        int columnasMatriz1 = matriz[0].length;
        int columnasMatriz2 = matriz[0].length;
        int suma = 0;
        int[][] producto = new int[filasMatriz1][columnasMatriz2];

        for (int i = 0; i < filasMatriz1; i++) {
            for (int j = 0; j < columnasMatriz2; j++) {
                for (int k = 0; k < columnasMatriz1; k++) {
                    suma += matriz[i][k] * matriz[k][j];
                }
                producto[i][j] = suma;
            }
        }

        System.out.println("El producto de las dos matrices es:" + producto);
        
        
        //METODO PARA ENCONTRAR LOS NUMEROS PARES DE UN NUMERO Y LOS DIVISORES
        

        // Encontrar y mostrar los números pares
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();  // Nueva línea

        // Encontrar y mostrar los divisores del número ingresado
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 5 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();  // Nueva línea
        
        
    }

}
    
