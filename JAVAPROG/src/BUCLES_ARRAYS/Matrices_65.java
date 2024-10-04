
package BUCLES_ARRAYS;


public class Matrices_65 {
/*Se dice que una matriz M es simétrica perfecta si tiene el mismo número de filas y
de columnas (MxM) y si todos sus elementos cumplen que el elemento de la posición [i]
[j] es el mismo que el de la posición [j][i].
Implementa un programa que analice una matriz (creala y ponle valores tú) e indique si
es simétrica perfecta o no*/
    
    public static void main(String[] args) {
        int matriz[][]={{3, 1, 1},{1, 4, 6},{1, 6, 5}};
        boolean perfecta= true;//Inicializa en true, ya que asumimos que la matriz es simétrica perfecta.

        if(matriz.length == matriz[0].length){//con estos bucles compruebo si en las posiciones del array los valores son iguales
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j]!=matriz[j][i]) {//si el valorque hay en las filas y en las columnas es diferente a los valores de las columnas y las filas
                        perfecta=false;

                    }
                    System.out.print(matriz[i][j] + "\t"); //muestro en forma de matriz

                }
                System.out.println();

            }
            if (perfecta) {//si el booleano que hay en prefecta es verdadero la matriz sera simetrica perfecta
                System.out.print("La matriz es simetrica perfecta");

            }
            else{
                System.out.print("La matriz no es simetrica perfecta");//si no es verdad sera falsa
            }
        }
      
        
  
    }
    
}
