package BUCLES_ARRAYS;

/*Crea un programa que cree una matriz de tamaño 5x5 que almacene los números
del 1 al 25 y luego muestre la matriz por pantalla (en forma de matriz).*/
public class M_60_again {

    public static void main(String[] args) {

        int matriz[][] = new int[5][5];
        int cont = 0;

        for (int i = 0; i < 5; i++) {//con este for llenamos la matriz del 1 al 25 mientras que las filas y las columnas sean menores que 5

            for (int j = 0; j < 5; j++) {
                cont++;
                matriz[i][j] = cont;
            }
        }//el segundo for se hace fuera del primero
        for (int i = 0; i < 5; i++) {//y con este for mostramos los valores en forma de matriz hacemos este for para que el mensje no se repita

            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
