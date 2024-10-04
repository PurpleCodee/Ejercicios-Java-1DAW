package EXCEPCIONES;

import java.util.Scanner;

public class Ejercicio_105 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //1ºleer por teclado 2 numeros numerador y denominador
        //2ºcomprobar que el numerador es menor de 100 y que el denominador es mayor que -5
        //3ºsi no es correcto se lanza la excepcion tipo excepcion
        //4ºCalcular cociente y mostrar por pantalla 
        //5ºcontrolar que no se puede dividir entre 0
        
        int deno = 0;
        int nume = 0;
        int cociente = 0;

        try {
            
            System.out.print("Introduce un nominador: ");
            nume = entrada.nextInt();
            
            System.out.print("Introduce un denominador: ");
            deno = entrada.nextInt();
            
            if (nume < 100 && deno > -5){//el numerador actua como divisor y el denominador como dividendo
                cociente = deno/nume;
                System.out.println("El cociente es: " + cociente);  
            }
                
        } catch (ArithmeticException e) {
            System.out.print("No es posible dividir entre 0");
            
        }catch (IllegalArgumentException e) {
            System.out.print("El número no está en los rangos indicados");
        }
    }
}
