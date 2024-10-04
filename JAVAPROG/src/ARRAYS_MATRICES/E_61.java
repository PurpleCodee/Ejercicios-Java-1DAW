
package ARRAYS_MATRICES;
/*61.- Crea un programa que cree una matriz de 10x10 e introduzca los resultados de las
tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego muestra la matriz por
pantalla (en forma de matriz).*/
public class E_61 {
    
    public static void main(String[] args) {
        int matriz[][] = new int [10][10];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i+1)*(j+1) < 10) {
                    System.out.print("0");
                }
                matriz[i][j] = (i+1)*(j+1);//i*j mientras se incrementa se multiplica
                System.out.print(matriz[i][j]+" ");    
            }
            System.out.println("");     
        }    
    }  
}
