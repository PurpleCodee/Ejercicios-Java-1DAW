
package ARRAYS_MATRICES;

import java.util.Scanner;

public class E_64 {
    /*64.- Dada una matriz MxM, crear un programa que muestre:
            a) El mayor elemento de la diagonal principal.
            b) La media de los valores de la diagonal principal.*/
    public static void main(String[] args) {
        int matriz[][] = {{1, 6, 7},{6, 8, 2},{7, 11, 67}};
        int mayor = 0;
        int suma = 0;
        int media = 0;
        Scanner teclado = new Scanner(System.in);
        
        
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i] > mayor) {
                mayor = matriz[i][i];   
            }
            suma+= matriz[i][i];    
        }
        media = suma/matriz.length;
        System.out.println("El mayor elemento de la diagonal es: " + mayor + " la suma de la diagonal principal es: " + suma + " y la media de los valores de la diagonal es : " + media);

    }
    
}
