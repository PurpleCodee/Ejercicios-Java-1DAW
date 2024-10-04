
package CADENAS;

import java.util.Scanner;

public class cadenas_9 {
    public static void main(String[] args) {
        /*9. Dado un array de "palabrotas" y un texto, crea un programa que reemplace todas las
            palabrotas del texto por asteriscos * (tantos como letras tenga la palabrota)*/
        String palabrotas[] = {"puta","tonto","zorra","idiota","mierda"};
        int cont = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Dame una cadena o un texto: ");
        String cadena = entrada.nextLine();
        
        entrada.close();
        
        String trozitos [] = cadena.split(" ");
        
        for (int i = 0; i < trozitos.length; i++) {
            for (int j = 0; j < palabrotas.length; j++) {
                if (trozitos[i].equalsIgnoreCase(palabrotas[j])) {
                    String asteriscos = "*".repeat(trozitos[i].length());
                    trozitos[i] = asteriscos;
                }
            }
            System.out.print(trozitos[i]+" ");
        }
    }
}
