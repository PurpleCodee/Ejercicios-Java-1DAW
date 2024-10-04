
package ARRAYS_MATRICES;
import java.util.Scanner;
public class E_57 {
    /*57.- Crea dos arrays de enteros tamaño 5. A continuación:
            • Rellena el primero con números aleatorios entre el 2 y el 50.
    
            • Rellena el segundo con valores que introduzca el usuario por teclado.
    
            • Crea un tercer array cuyos valores en cada celda van a ser la suma de las celdas
            correspondientes de los otros dos arrays. Es decir, para la celda 1: la suma de las
            celdas 1 del 1er y del 2º array. Para la celda 2: la suma de las celdas 2 del 1er y del 2º
            array y así sucesivamente.
    
            • Muestra el tercer array por pantalla.
    
            • Muestra la suma de todos los elementos del tercer array.*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 2;
        int max = 50;
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] sumaArray = new int[5];
        int sumaTotal = 0;

        // Rellenar el primer array con números aleatorios entre 2 y 50
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random()*(max-min+1)+min);
        }

        // Rellenar el segundo array con entradas del usuario
        System.out.println("Introduce 5 números para el segundo array:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Crear el tercer array y calcular la suma total
        System.out.println("El tercer array (suma de los dos primeros) es:");
        for (int i = 0; i < sumaArray.length; i++) {
            sumaArray[i] = array1[i] + array2[i];
            sumaTotal += sumaArray[i];
            System.out.print(sumaArray[i] + " ");
        }
        System.out.println();

        // Mostrar la suma total de los elementos del tercer array
        System.out.println("La suma total de los elementos del tercer array es: " + sumaTotal);
    }
    
}
