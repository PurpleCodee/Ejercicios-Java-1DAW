
package CADENAS;

import java.util.Scanner;

public class cadenas_7 {
    public static void main(String[] args) {
        /*7. Realiza un programa que, dada una cadena o texto, cuente la cantidad de veces que
            aparece cada vocal.*/
        int cont = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce una cadena: ");
        String cadena = entrada.nextLine();
        
        entrada.close();
        cadena = cadena.toLowerCase();   
        
        String trozos [] = cadena.split("");
        String vocales[] = {"a", "e", "i", "o", "u"};
        
        for (int i = 0; i < trozos.length; i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (trozos[i].equals(vocales[j])) {
                    cont++; 
                } 
            }   
        }
        System.out.println("Las vocales aparecen : " + cont + " veces en la cadena de texto");
    }  
}
