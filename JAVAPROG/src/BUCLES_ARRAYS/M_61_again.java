
package BUCLES_ARRAYS;
/*Crea un programa que cree una matriz de 10x10 e introduzca los resultados de las
tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego muestra la matriz por
pantalla (en forma de matriz).*/

public class M_61_again {

    
    public static void main(String[] args) {
        
        int matriz[][] = new int[10][10];//creo una matriz de 10 filas y 10 columnas
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                
                if ((i+1)*(j+1)<10) {//en la condicion digo que si el numero es menor que 10 le ponga un 0 delante
                    System.out.print("0");   
                }
                matriz[i][j]= (i+1) * (j+1);//le sumo uno a i y j para que en cada vuelta en la que incremente el valor de i y j se multipliquen 
                System.out.print(matriz[i][j]+"\t");  
            }
            System.out.println(" ");
        }
        
    }
    
}
