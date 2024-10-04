package FICHERO;

//1. Importamos las herramientas necesarias
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_113 {

    public static void main(String[] args) {
        //2.Creamos los flujos de lectura
        String ruta = "src/FICHERO/datos/EJ113.dat";
        FileWriter escritor = null;
        BufferedWriter bufito = null;

        try {
            //lo pongo en true para que a la hora de escribir no se machaque la informacion
            bufito = new BufferedWriter(new FileWriter(ruta, true));

            //3.Aqui ya escribo el funcionamiento
            Scanner teclado = new Scanner(System.in);
            String entrada = "";
            do {

                System.out.print("Introduce una cadena: ");
                entrada = teclado.nextLine();
                
                //isEmpty comprueba si la cadena esta vacia o no
                //devuelve true si esta vacia y false si esta llena
                
                if (!entrada.isEmpty()) {//si la entrada tiene algo "escribo"
                    bufito.write(entrada + "\n");
                }

            } while (!entrada.isEmpty());//puedo escribir mientra que la cadena este llena

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
