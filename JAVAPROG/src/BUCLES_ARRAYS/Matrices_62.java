
package BUCLES_ARRAYS;

import java.util.Scanner;


public class Matrices_62 {
/*Crea un programa que cree una matriz de tamaño NxM (tamaños introducido por
teclado) e introduzca en ella los valores también a través del teclado teclado. A
continuación deberá mostrar por pantalla cuántos valores son mayores que cero, cuántos
son menores que cero y cuántos son igual a cero (es decir, se muestran 3 números)*/
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menor = 0;
        int mayor =0;
        int igual =0;
        System.out.print("Introduce el tamaño de N: ");//pido por teclado el tamaño de las filas
        int filas = teclado.nextInt();
        System.out.print("Introduce el tamaño de M: ");//pido por teclado el tamaño de las columnas
         int columnas = teclado.nextInt();
         
         int matriz[][]=new int[filas][columnas];//creo un array 
         for (int i = 0; i < matriz.length; i++) {
             
             for (int j = 0; j < matriz[i].length; j++) {
                 System.out.print("Introduce los valores: ");
                 matriz[i][j]=teclado.nextInt();//introduzco los valores que pido por teclado en el array
                 
                 if (matriz[i][j] < 0) {//comparo si los valores son menores que 0 
                     menor++;//y guardo la posicion en un contador
                     
                 }
                 else if(matriz[i][j] > 0){//comparo si los valores que hay en la matriz son mayores que 0
                 mayor++;//los guardo en un contador
             
             }
                 else{//si los valores del array son iguales 
                 
                 igual++;//guardo su posicion en un contador
                 }
    
             }
            
        }//fuera de los bucles muestro por pantalla la posicion que es el numero de veces que los valores han aparecido
         System.out.println("Los menores a 0 son:  " + menor + " En: la matriz ");
         System.out.println("Los mayores a 0 son:  " + mayor + " En: la matriz ");
         System.out.println("Los iguales a 0 son:  " + igual + " En: la matriz ");
      
    }
    
}
