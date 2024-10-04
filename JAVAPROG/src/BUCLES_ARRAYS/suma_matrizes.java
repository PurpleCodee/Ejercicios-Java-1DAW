
package BUCLES_ARRAYS;
/*Voy a realizar suma de matrices para repasar para la practica*/

public class suma_matrizes {

    
    public static void main(String[] args) {
        
        int [][]matriz_1 = {{2,5,8},{8,9,5},{11,8,3}};//mi primera matriz
        int [][]matriz_2 = {{1,5,9},{8,5,5},{19,8,3}};//mi segunda matriz
        int resultado[][] = new int [3][3];//en esta matriz guardare el valor sumado 
        
        int filas = matriz_1.length;//para que me sea mas claro a la hora de aprender nombro la variable como filas y le doy el valor de tamaño de matriz_1
        int columnas = matriz_2.length;//lo mismo pero en columnas
        
        for (int i = 0; i < filas; i++) {//con este forde recorro las dos matrizes y a resultado le doy los valores sumados las otras dos matrices
            for (int j = 0; j < columnas; j++) {
                
                resultado[i][j] = matriz_1[i][j] + matriz_2[i][j];//si quisiese multiplicar aqui cambio el signo y si quiero dividir pongo el tipo a double
                
            }
        }
        for (int i = 0; i < filas; i++) {//utilizo este for simplemente para mostrar en forma de matriz
            for (int j = 0; j < columnas; j++) {
                System.out.print(resultado[i][j]+"\t");
                
            }
            System.out.println(" ");
            
        }
 
    }
    
}
