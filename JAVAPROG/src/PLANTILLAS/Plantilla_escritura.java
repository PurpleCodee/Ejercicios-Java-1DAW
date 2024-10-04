
package PLANTILLAS;

//1. Importamos las herramientas necesarias
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Plantilla_escritura {

    public static void main(String[] args) {
            
        //2.Creamos los flujos de lectura
        String ruta = "src/FICHERO/datos/EJ113.dat";
        FileWriter escritor = null;
        BufferedWriter bufito = null;
        
        
        try {
            //lo pongo en true para que a la hora de escribir no se machaque la informacion
            bufito = new BufferedWriter(new FileWriter(ruta, true));

            //3.Aqui ya escribo el funcionamiento
        } catch (IOException e) {
            System.out.println("Problema escribiendo");
            System.out.println(e.getMessage());

        } finally {

            try {
                if (bufito != null) {
                    bufito.close();
                }
            } catch (IOException e) {
                System.out.println("Poblema cerrando");
            }
        }
    } 
}
