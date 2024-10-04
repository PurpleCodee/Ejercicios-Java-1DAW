
package PLANTILLAS;

// 1. Importar las herramientas

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Plantilla_lectura {

    public static void main(String[] args) {
        // 2. Creamos los flujos de lectura   
        String ruta = "src/FICHERO/datos/numeros.txt";
        BufferedReader bufito = null;
        
        try {
            bufito = new BufferedReader(new FileReader(ruta));
            //3 realizo todo el funcionamiento
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println("Error: No se han podido cerrar los "
                    + "flujos de datos o problema leyendo.");
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error formato de numero no valido.");
            System.out.println(e.getMessage());
        
        }
        finally {

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

