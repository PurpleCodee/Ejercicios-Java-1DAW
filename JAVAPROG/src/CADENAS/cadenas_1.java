
package CADENAS;
import java.util.Scanner;

public class cadenas_1 {
    public static void main(String[] args) {
        /*Realiza un programa que, dada una cadena o texto,imprima cada caracter en una linea separada*/
        Scanner entrada = new Scanner(System.in);
        char letras = ' ';
        
        System.out.print("Introduce una cadena: ");
        String cadena = entrada.nextLine();
       
        for (int i = 0; i < cadena.length(); i++) {
          letras = cadena.charAt(i);  
            System.out.println(letras+" ");
        }    
    }
}
