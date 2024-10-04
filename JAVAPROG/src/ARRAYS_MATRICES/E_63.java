
package ARRAYS_MATRICES;

public class E_63 {

    /*Crea un programa que encuentre el elemento de mayor valor de una matriz y...
a) ... muestre la posición de su primera aparición.
b) ... muestre una lista con las posiciones de todas sus apariciones*/

    public static void main(String[] args) {
        int matriz[][] = {{2, 7, 9}, {14, 1, 5}, {9, 14, 7}};
        int mayor = 0;//guardare el valor del  array que la condicion a encontrado que es mayor 
        String primera = "";
        String posiciones = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] > mayor) {//si el valor de la matriz es el  mayor de todos los valores guardo ese valor 
                    mayor = matriz[i][j]; //en mayor guardo el valor mas grande de la matriz
                    primera = i + "-" + j;//guardo  en la primera posicion i  j   que sera la posicion donde aparece el numero en este caso [1][2]
                    posiciones = primera;//en posiciones guardo la primera que es [1][2]

                } else if (matriz[i][j] == mayor) {//si los valores de la matriz son iguales que el numero mayor 
                    posiciones += " " + i + "-" + j;//guardo la posicion en la que encuentro el numero mayor de nuevo
                }

            }

        }
        System.out.println("La primera posicion es: " + primera);//lo muestro por pantalla
        System.out.println("A aparecido: " + posiciones);

    }

}
