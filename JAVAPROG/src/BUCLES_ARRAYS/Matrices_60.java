
package BUCLES_ARRAYS;


public class Matrices_60 {
/*Crea un programa que cree una matriz de tamaño 5x5 que almacene los números
del 1 al 25 y luego muestre la matriz por pantalla (en forma de matriz)*/
    
    public static void main(String[] args) {
        int matriz [][] = new int[5][5];
        int cont = 0;
        
        for (int i = 0; i < 5; i++) {//llenamos la matriz con valores del 1 al 25
            for (int j = 0; j < 5; j++) {
                cont++;
                matriz[i][j]=cont;//utilizando el contador
            }
        }
        System.out.println("Los valores de la matriz son: ");//con este for mostramos los valores que hay dentro
         for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
          
            }
             System.out.println();//salto de linea
        }
    
    }
    
}
