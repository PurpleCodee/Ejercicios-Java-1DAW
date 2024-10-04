package FICHERO;
// 1. Importar las herramientas

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class lectura2 {

    public static void main(String[] args) {
        //2º Creamos la ruta de lectura
        String rutita = "src\\FICHERO\\datos\\ejercicio_clase2.dat";
        BufferedReader bufito = null;//se pone a null para crearlo con algo dentro

        try {
            //mi bufer se instandia y lo meto en un try por si mi ruta da fallo
            bufito = new BufferedReader(new FileReader(rutita));
            //3. momento de hacer cositas con el fichero

            int vueltitas = Integer.parseInt(bufito.readLine());//lee solo un caracter

            for (int i = 0; i < vueltitas; i++) {//dar 4 vueltas que son mis 4 frases
                int numero = Integer.parseInt(bufito.readLine());
                String frases = bufito.readLine();//leeo una linea entera
                
                //creo los trocitos
                String trocitoFinal = frases.substring(frases.length()-numero);
                String trocitoPrincipio = frases.substring(0,frases.length()-numero);
                
                //mostrar el textito
                System.out.println(trocitoFinal+trocitoPrincipio);  
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ruta incorrecta peinate dice Emi");

        } catch (IOException e) {
            System.out.println("Problema leyendo...");

        } finally {
            //si llega aqui es que el buffer estaba abierto 
            try {
                if (bufito != null) {
                    bufito.close();
                }

            } catch (IOException e) {
                System.out.println("Error: Cerrando flujo de datos");
            }
        }
    }
}
