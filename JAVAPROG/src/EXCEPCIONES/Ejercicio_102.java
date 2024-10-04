package EXCEPCIONES;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio_102 {

    public static void main(String[] args) {
        //pido una cadena y un numero
        Scanner entrada = new Scanner(System.in);
        char caracter = 'o';
         String cadena = "";
         int N = 0;
         

        try {
            System.out.print("Dame una cadena: ");
            cadena = entrada.nextLine();

            System.out.print("Dime un numero: ");
            N = entrada.nextInt();
            
            if (N >= 1 && N <= cadena.length() && cadena.charAt(N-1) != ' ') {
                caracter = cadena.charAt(N - 1);
                //se utiliza para acceder a caracteres de una cadena N-1 para acceder a la primera posicion
                System.out.println("El carácter en la posición N es: '" + caracter + "'");
            }else{
                throw new IllegalArgumentException("No existe caracter en esa posicion");
            }
        } catch (InputMismatchException e) {
             System.out.println("No existe la posición "+ N +" en la cadena " + e.getMessage());
             
        }catch (Exception e) {
            System.out.println("Error desconocido: " + e.getMessage());
        }
        entrada.close();
    }
}
