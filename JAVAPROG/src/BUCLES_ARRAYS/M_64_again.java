
package BUCLES_ARRAYS;
/*Dada una matriz MxM, crear un programa que muestre:
a) El mayor elemento de la diagonal principal.
b) La media de los valores de la diagonal principal.*/

public class M_64_again {

    
    public static void main(String[] args) {
        int[][]matriz = {{1, 6, 7},{6, 8, 2},{7, 11, 67}};//Creo mi matriz y le introduzco los valores
        int mayor=0;//esta variable guardara el valor del mayor numero de la matriz
        double suma=0;
        double media=0;
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                
                if (i == j && matriz[i][j] > mayor) {//mientras que la posicion de las filas y las columnas sean la mismas
                     mayor=matriz[i][j];
                }
                suma+= matriz[i][j];
                media = suma/(matriz.length*matriz.length);  
            }
            
        }

        System.out.println("El valor mayor de la diagonal de la matriz es: " + mayor);
        System.out.println("La media de los valores es: " + media);
    } 
}
