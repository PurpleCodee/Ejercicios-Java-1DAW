
package BUCLES_ARRAYS;
/*Crea un programa que cree una matriz de 10x10 e introduzca los resultados de las
tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego muestra la matriz por
pantalla (en forma de matriz)*/

public class Matrices_61 {

    
    public static void main(String[] args) {
       int luna [][] =new int[10][10];
       int tabla = 0;
        for (int i = 0; i < luna.length; i++) {//fila
            for (int j = 0; j < luna.length; j++) {//columnas
                if (luna[i][j]<10) {
                    System.out.print("0");
                    
                }
                luna[i][j]=(i + 1)*(j+1);
                System.out.print(luna[i][j] + "\t");
       
            }
            System.out.println("");
        
        }
       
    }
    
}
