
package Ejercicios_Bucles;
import java.util.Scanner;

public class Ejercicio_52_ARRAYS {
/*- Crea un array de tamaño 10 que sirva para almacenar colores y pide al usuario que
rellene cada posición del array con un color. A continuación indica cuantas veces
aparece el color “rojo” y el color “azul” usando la siguiente salida:
El color 'rojo' aparece X veces en el array.
El color 'azul' aparece Y veces en el array*/
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
         
        String[] colores = new String[10];
        
        for (int i = 0; i < colores.length; i++) {
            System.out.print("Introduce un color en la posición " + (i + 1) + ": ");//EMPIEZO DESDE EL 1 Y NO DESDE EL 0
            colores[i] = teclado.nextLine(); // Pedir al usuario que rellene cada posición del array con un color
        }
        
        int contadorRojo = 0;// Contar cuántas veces aparece "rojo" y "azul" en el array
        int contadorAzul = 0;

        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equals("rojo")) {
                contadorRojo++;
            } else if (colores[i].equals("azul")) {
                contadorAzul++;
            }
        }

        System.out.println("El color 'rojo' aparece " + contadorRojo + " veces en el array.");// Mostrar el resultado
        System.out.println("El color 'azul' aparece " + contadorAzul + " veces en el array.");
    }
}
  
    

