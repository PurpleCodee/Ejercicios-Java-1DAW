
package CADENAS;

import java.util.Scanner;

public class cadenas_3 {
    public static void main(String[] args) {
        /*3. Realiza un programa que, dada una cadena, imprima dicha cadena al revés (en orden inverso)*/
        Scanner entrada = new Scanner(System.in);
        char letras = ' ';
        
        System.out.print("Introduce una cadena: ");
        String cadena = entrada.nextLine();
        
        for (int i = cadena.length()-1; i >= 0; i--) {
            letras = cadena.charAt(i);
            System.out.println(letras + " "); 
        }   
    } 
}
