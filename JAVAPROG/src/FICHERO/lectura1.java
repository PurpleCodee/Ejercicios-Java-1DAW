package FICHERO;
// 1. Importar las herramientas

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class lectura1 {

    public static void main(String[] args) {
        // 2. Creamos los flujos de lectura   
        String ruta = "src/FICHERO/datos1/ejercicio_clase1.dat";
        BufferedReader bufito = null;
        try {
            bufito = new BufferedReader(new FileReader(ruta));
            //3-lectura caracter a caracter
            String linea = " ";
            int nVueltas = Integer.parseInt(bufito.readLine());
            System.out.println("Voy a dar: " + nVueltas + " vueltas");

            for (int i = 1; i <= nVueltas; i++) {
                //capturo el numero de caracteres a mover
                linea = bufito.readLine();
                
                int numero = Integer.parseInt(linea);
                //a continuacion, capturo la frase a tratar
                
                String frase = bufito.readLine();
                //Obtengo cada trozo
                
                String trozoFinal = frase.substring(frase.length() - nVueltas);
                String trozoPrincipio = frase.substring(0, frase.length() - nVueltas);
                
                //muestro el resultado
                System.out.println(trozoFinal + trozoPrincipio);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: No se han podido cerrar los "
                    + "flujos de datos o problema leyendo.");
            System.out.println(e.getMessage());
        } finally {
            // 4. Cierro todos los flujos
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
