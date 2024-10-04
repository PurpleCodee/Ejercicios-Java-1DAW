
package CADENAS;

import java.util.Scanner;

public class cadenas_4 {
    public static void main(String[] args) {
        /*4. Realiza un programa que , dada una cadena, cuente la cantidad de veces que aparece la letra 'a' (mayúscula o minúscula).*/
        Scanner entrada = new Scanner(System.in);
        char letras = ' ';
        int cont_a = 0;
        
        System.out.print("Introduce una cadena: ");
        String cadena = entrada.nextLine();
        
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A'){
                cont_a++;
            }
        }
        
        System.out.println("Numero de veces que aparece la 'a': " + cont_a);

    }
    
}
