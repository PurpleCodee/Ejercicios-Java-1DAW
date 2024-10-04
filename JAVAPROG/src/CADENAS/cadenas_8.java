
package CADENAS;

import java.util.Scanner;

public class cadenas_8 {
    public static void main(String[] args) {
        /*8. Realiza un programa que, dada una cadena o texto, reemplace todas las ocurrencias
            de 'Java' por 'Python'.*/
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Dame una cadena o un texto: ");
        String cadena = entrada.nextLine();
        
        entrada.close();
        
        String trozito[]=cadena.split(" ");
        
        for (int i = 0; i < trozito.length; i++) {
            if (trozito[i].equals("Java")) {
                trozito[i]="Python";    
            } 
        }
        for (int i = 0; i < trozito.length; i++) {
            System.out.print(trozito[i]+" ");
            
        }
    }  
}
