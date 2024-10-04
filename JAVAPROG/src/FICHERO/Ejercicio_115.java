package FICHERO;
// 1. Importar las herramientas

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio_115 {

    public static void main(String[] args) {
        // 2. Creamos los flujos de lectura   
        String ruta = "src/FICHERO/datos/numeros.txt";
        BufferedReader bufito = null;
        int suma = 0;
        int mayor = Integer.MIN_VALUE;//para asegurar que se actualizan correctamente
        int menor = Integer.MAX_VALUE;
        int contMayor = 0;
        int contMenor = 0;

        try {
            bufito = new BufferedReader(new FileReader(ruta));
            //3 realizo todo el funcionamiento
            String linea = "";
            
            //con el bucle leo linea a linea del archivo
            //ejecuto el bucle mientras que hay lineas por leer

            while ((linea = bufito.readLine()) != null) {

                int numero = Integer.parseInt(linea);

                if (numero > mayor) {
                    mayor = numero;//actualizo el mayor
                    contMayor++;

                } else if (numero < menor) {
                    menor = numero;//actualizo el menor
                    contMenor++;
                    
                }
            }
            
            //fuera del bucle calculo
            suma = mayor + menor;
            
         
                  
            System.out.println("La suma del mayor y el menor es: " + suma);
            System.out.println("El mayor a aparecido: " + contMayor + " veces");
            System.out.println("El menor a aparecido: " + contMenor + " veces");
            

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
