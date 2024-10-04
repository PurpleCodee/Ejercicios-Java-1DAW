package FICHERO;
// 1. Importar las herramientas

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio_119 {

    public static void main(String[] args) {
        // 2. Creamos los flujos de lectura   
        String ruta = "src/FICHERO/datos/EJ119.txt";
        BufferedReader bufito = null;
        boolean salir = false;

        try {

            bufito = new BufferedReader(new FileReader(ruta));
            String texto = "";
            String listaTexto[] = new String[3];

            //3 realizo todo el funcionamiento
            while (!salir) {
                texto = bufito.readLine();

                if (texto != null) {
                    salir = true;

                } else {
                    
                    listaTexto = texto.split(":");

                    System.out.println("Item: " + "\t\t" + listaTexto[0]);
                    System.out.println("Precio: " + "\t" + listaTexto[1]);
                    System.out.println("Cantidad: " + "\t" + listaTexto[2] + "\n");

                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println("Error: No se han podido cerrar los "
                    + "flujos de datos o problema leyendo.");
            System.out.println(e.getMessage());

        } finally {

            try {
                if (bufito != null) {
                    bufito.close();
                }

            } catch (IOException e) {
                System.out.println("Error: Cerrando flujo de datos");
                System.out.println(e.getMessage());
            }
        }

    }

}
