package EXCEPCIONES;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Excepciones_1_ejemplo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double res = 23;
        int nume = 0;
        int deno = 0;
        boolean salir = false;

        do {
            try {
                System.out.print("Introduce numerador: ");
                nume = entrada.nextInt();
                System.out.print("Introduce denominador: ");
                deno = entrada.nextInt();
                salir = true;

            } catch (InputMismatchException e) {
                System.out.println("Introduce numeros de nuevo no fue correcto");
                //importante
                entrada.next();//limpiar buffer
            }
        } while (!salir);

        do {
            try {
                res = nume / deno;
                salir = true;

            } catch (ArithmeticException e) {
                System.out.println("Fallo al dividir: " + e);

            }

        } while (!salir);

        System.out.println("Voy a dividir: ");

        System.out.println("Resultado miau miau: " + res);

    }
}
