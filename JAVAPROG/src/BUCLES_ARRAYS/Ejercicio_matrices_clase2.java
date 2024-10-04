package BUCLES_ARRAYS;

import java.util.Scanner;


public class Ejercicio_matrices_clase2 {

    /*Le pido al usuario el tamaño de la matriz y relleno la diagonal con unos y los demás espacios con ceros.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la matriz");
        int tamaño = teclado.nextInt();
        int kairi[][] = new int[tamaño][tamaño];//el tamaño de las filas y de las columnas sera el valor que me de el usuario

        for (int i = 0; i < kairi.length; i++) {

            for (int j = 0; j < kairi[i].length; j++) {

                if (i == j) {// pregunto que si la posicion de las filas es igual que el de las columnas
                    kairi[i][j]=1;//los valores de dentro array seran 1
                   
                }
                else{//si la posicion de las filas y de las columnas no son iguales 
                    kairi[i][j]=0;//los valores del array se rellenaran con ceros
                
                }
                System.out.print(kairi[i][j] + "\t");//muestro por pantalla los valores del array
            }
            System.out.println();//doy un salto de linea para que me aparazca en forma de matriz
    
        }

    }

}
