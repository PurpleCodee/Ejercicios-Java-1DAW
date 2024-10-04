
package ARRAYS_MATRICES;

public class E_60 {
    /*60.- Crea un programa que cree una matriz de tamaño 5x5 que almacene los números
            del 1 al 25 y luego muestre la matriz por pantalla (en forma de matriz).*/
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int contValores = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = contValores + 1;    
                contValores++;    
            } 
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                 if (matriz[i][j] >= 10) {
                      System.out.print(matriz[i][j] + " ");  
                }else{
                      System.out.print("0"+ matriz[i][j] + " ");   
                 }     
            }
             System.out.println(" ");
        } 
    }  
}
