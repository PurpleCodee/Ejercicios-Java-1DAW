package BUCLES_ARRAYS;

public class Matrices_64 {

    /*Dada una matriz MxM, crear un programa que muestre:
a) El mayor elemento de la diagonal principal.
b) La media de los valores de la diagonal principal.*/

    public static void main(String[] args) {

        int matriz[][] = {{2, 7, 9, 8}, {14, 1, 5, 7}, {9, 14, 7, 5}, {6, 8, 4, 9}};//declaro una matriz y le introduzco los valores
        int mayor = 0;//creo una variable para guardar el mayor valor de la diagonal principal
        double suma = 0;//decldo mis varibles mara calcular la media utilizando double para que me de los decimales
        double media = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //dentro de los bucles for le doy la condicion de que si los valores son mayores que mayor
                //y la posicion de las filas son iguales que las de las columnas
                if (matriz[i][j] > mayor && i == j) {
                    mayor = matriz[i][j];//mayor tendra el valor mayor de la diagonal
                }
                suma+=matriz[i][j];//aqui hago la suma y calculo la media
                media=suma/(matriz.length*matriz.length);
            }
        }
        System.out.println("El mayor valor de la diagonal principal es: " + mayor);//muestro por pantalla fuera de los bucles
        System.out.println("La media de la los valores de la matriz es: " + media);
    }
}
