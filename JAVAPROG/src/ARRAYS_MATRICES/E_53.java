package ARRAYS_MATRICES;

import java.util.Scanner;

public class E_53 {

    /*55.- Haz un programa que dado un array valores que posea una serie de números pej
            2,4,6,8,1,3,5,7, y un numero que se pida por teclado, indique si ese número está
            en el array o no lo está.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valores[] = {2, 4, 6, 8, 1, 3, 5, 7};
        System.out.print("Introduce numero: ");
        int numero = teclado.nextInt();

        boolean encontrado = false;

        int i = 0;
        while (!encontrado && i < valores.length) {
            if (valores[i] == numero) {
                encontrado = true;
            }
            i++;
        }
        if (encontrado) {
            System.out.println("El numero esta en el array");
        }else{
            System.out.println("No esta");}
    }
}
