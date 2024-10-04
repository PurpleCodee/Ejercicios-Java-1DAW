package FICHERO;
// 1. Importar las herramientas

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Ejercicio_116 {

    public static void main(String[] args) {

        String lineaLarga = " ";
        int longitudMax = 0;

        String ruta = "src/FICHERO/datos/EJ116.txt";
        BufferedReader bufito = null;
        

        try {

            bufito = new BufferedReader(new FileReader(ruta));
            //3 realizo todo el funcionamiento
            String lineaActual = "";
            String lineasMasLargas = "";
            


            while ((lineaActual = bufito.readLine()) != null) {

                String lineaActual_replace = lineaActual.replace(" ", "");//remplazo los espacios por nada 

                //a) Digo que la linea actual es mayor solo me muestra la primera lo comparo con mayor que
                if (lineaActual_replace.length() > longitudMax) {
                    longitudMax = lineaActual_replace.length();
                    //limpia la lista
                    lineaLarga = lineaActual;

                    //esta linea que es la que quiero mostrar es la que tiene espacios 
                    //b) Si hay mas de una mayor solo muestro la ultima lo comparo con mayor igual
                    //c)
                }
            }
            //isEmpty comprueba si la cadena esta vacia o no
            //devuelve true si esta vacia y false si esta llena
            if (!lineaLarga.isEmpty()) {
                System.out.println("La linea mas larga es: " + lineaLarga);

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
