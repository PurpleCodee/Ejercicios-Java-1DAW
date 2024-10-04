
package EXCEPCIONES;

import java.util.Scanner;

public class Excepciones_3_ejemplo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int suma = 0;
        
        System.out.print("Introduce tamaño de la lista: ");
        int tam = entrada.nextInt();
        int lista[] = new int[tam];

        for (int i = 0; i < tam; i++) {
            lista[i] = (int)(Math.random() * 3);
            System.out.println("He metido un " + lista[i]);
        }
        System.out.println(" ");

        for (int i = 1; i < lista.length; i++) {
            try {
                suma += (lista[i] / lista[i - 1]);
            } catch (ArithmeticException e) {
                System.out.println(e);
                suma += 0;
            }
        }
        System.out.println("Suma es: " + suma);  
    }
}
