package COLECCIONES;
// 1. Importar las herramientas de lectura

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio2_COLECCIONES {

    /*2.- Dado un archivo de texto que contiene palabras separadas por espacios, 
    escribe un programa en Java que lea el archivo, identifique y almacene todas
    las palabras únicas y las vuelque en un fichero de texto (pej: salida.txt). */

    public static void main(String[] args) {
        /*---------Creo el flujo de lectura----------------*/
        String rutaTexto = "src/COLECCIONES/datos/textoSeparado.txt";
        BufferedReader bufito = null;

        try {
            bufito = new BufferedReader(new FileReader(rutaTexto));
            //3 realizo todo el funcionamiento

        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println("Error: No se han podido cerrar los " + "flujos de datos o problema leyendo.");
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
