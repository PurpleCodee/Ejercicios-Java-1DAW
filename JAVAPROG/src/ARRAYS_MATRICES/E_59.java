package ARRAYS_MATRICES;

import java.util.Scanner;

public class E_59 {

    /*59.- Realizar un programa que pida al usuario un numero N entre 3 y 5 y, a
            continuación, cree una matriz NxN (N filas, N columnas) cuyos elementos se le van a ir
            pidiendo al usuario.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño = 0;

        do {
            System.out.print("Introduce un numero entre 3 y 5: ");
            tamaño = teclado.nextInt();
            if (tamaño < 3 || tamaño > 5) {//esta condicion en el while si quiero que se repitta
                System.out.println("Numero incorrecto");
            }

        } while (tamaño < 3 && tamaño > 5);//si quiero que se repita cambio por OR
        
        int matriz[][] = new int[tamaño][tamaño];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce valores de la matriz: ");
                matriz[i][j] = teclado.nextInt();
                  
                System.out.print("El valor de la posicion: " + " ["+ i +"] " + "["+ j +"]" + matriz[i][j] + " ");
                System.out.println(""); 
            }
        }
    }
}
