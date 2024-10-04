
package BUCLES_ARRAYS;
import java.util.Scanner;
/*Realizar un programa que pida al usuario un numero N entre 3 y 5 y, a
continuación, cree una matriz NxN (N filas, N columnas) cuyos elementos se le van a ir
pidiendo al usuario*/

public class Matrices_59 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n=0;
        do {            
            System.out.print("Dime un numero: ");
            n = teclado.nextInt();//le pido al usuario un numero
        } while (n <3 || n >5);
            int matriz [][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                
                for (int j = 0; j < n; j++) {
                    System.out.print("Introduce un numero: ");
                    matriz[i][j] = teclado.nextInt();//la condicion la pido en el segundo for porque quiero guardar valor x valor
                    System.out.print("El valor de la posicion:" + " ["+ i +"] " + "["+ j +"]" + matriz[i][j] + " " ); //muestro la posicion de las filas y las columnas
                    System.out.println("");
             
                }
                
            }

    }
    
}
