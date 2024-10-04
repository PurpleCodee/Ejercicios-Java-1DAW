
package CADENAS;

import java.util.Scanner;

public class cadenas_2 {
    public static void main(String[] args) {
        /*2.Realiza un programa que, dada una cadena, imprima cada palabra en una línea separada.*/
        Scanner entrada = new Scanner(System.in);
     
        
        System.out.print("Introduce una cadena: ");
        String cadena = entrada.nextLine();
        
        String palabritas[] = cadena.split(" ");
       
        for (int i = 0; i < palabritas.length; i++) {
          
            System.out.println(palabritas[i]);
        }    
      
    }
    
}
