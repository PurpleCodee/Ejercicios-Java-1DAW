package COLECCIONES;
//1 IMportar herramientas

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
//1 herrmientas import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//importo colecciones de mapas 
import java.util.HashMap;

public class Ejercicio_130 {

    public static void main(String[] args) {
        //2 Rutas de escritura y variables
        String ruta = "src/COLECCIONES/EJ130.txt";
        FileWriter escritor = null;
        BufferedWriter bufitoEscritura = null;
        BufferedReader bufitoLectura = null;
        String cadenaTexto = "";

       
        Integer conApariciones = 0;

        //coleccion mapa
        HashMap<String, Integer> estructuraPalabras = new HashMap<>();

        //4 estructura try
        try {
            //lo pongo en true para que a la hora de escribir no se machaque la informacion
            bufitoEscritura = new BufferedWriter(new FileWriter(ruta));
            /*para crear el fichero lo unico que debo de hacer es iniciar el buffer de escritura*/

            //para escribir dentro del fichero
            bufitoEscritura.write("Hola soy enya y estoy cansada pero no pasa nada lo voy a seguir intentando \n");
            bufitoEscritura.write("Hola soy Juanjo\n");
            bufitoEscritura.close();

            /*------------------LECTURA----------------------------------------*/
            //De eta manera leeo todo el texto del fichero
            String linea = "";

            bufitoLectura = new BufferedReader(new FileReader(ruta));
            linea = bufitoLectura.readLine();

            while (linea != null) {
                cadenaTexto += linea;
                linea = bufitoLectura.readLine();
               
            }
            String palabras [] = cadenaTexto.split(" ");
            
            /*---------Trabajo con la coleccion MAP------------------*/
            for (int i = 0; i < palabras.length; i++) {
                if (estructuraPalabras.containsKey(palabras[i].toLowerCase())){
                    Integer value_key = estructuraPalabras.get(palabras[i].toLowerCase());
                    value_key++;
                    estructuraPalabras.put(palabras[i].toLowerCase(), value_key);
                    
                }else{
                    estructuraPalabras.put(palabras[i].toLowerCase(), 1);
                }
                    
            }
            
            for(HashMap.Entry<String,Integer> palabra : estructuraPalabras.entrySet()){
                System.out.println("Palabra: "+palabra.getKey() + ", contador: " + palabra.getValue());
            }

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

        } finally {

            try {

                if (bufitoEscritura != null) {
                    bufitoEscritura.close();
                }
                if (bufitoLectura != null) {
                    bufitoLectura.close();

                }

            } catch (IOException e) {
                System.out.println("Poblema cerrando");
            }
        }
    }
}
