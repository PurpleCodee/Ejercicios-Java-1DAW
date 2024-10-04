package ARRAYS_MATRICES;

import java.util.Scanner;

public class E_52 {

    /*52.- Crea un array de tamaño 10 que sirva para almacenar colores y pide al usuario que
            rellene cada posición del array con un color. A continuación indica cuantas veces
            aparece el color “rojo” y el color “azul” usando la siguiente salida:
            El color 'rojo' aparece X veces en el array.
            El color 'azul' aparece Y veces en el array.
            Siendo X el número de veces que aparece el rojo en el array e Y el número de veces que aparece el
            azul en el array).*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String lista[] = new String[10];//STRING ALAMCENA COLORES 
        String rojo = "rojo";
        String azul = "azul";
        int j = 0;
        int contAzul = 0;
        int contRojo = 0;
        int posAzul = 0;
        int posRoja = 0;

        do {
            System.out.print("Introduce 10 colores en la posicion " + "[" + (j + 1 )+"]" + ": ");
            lista[j] = teclado.nextLine();//guardo en la posicion de la lista el color que introduce el usuario
            j++;//incremento del do while

        } while (j < lista.length);

        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equalsIgnoreCase("rojo")) {
                posRoja = i;
                contRojo++;
            }
            else if (lista[i].equalsIgnoreCase("azul")) {
                posAzul = i;
                 contAzul++;
                
            }

        }
        System.out.println("El color rojo aparece " + contRojo + " veces en el array." + "aparicion: " + "[" + (posRoja + 1) +"]");
        System.out.println("El color azul aparece " + contAzul + " veces en el array." + "aparicion: " + "[" + (posAzul + 1) +"]");

    }
}
