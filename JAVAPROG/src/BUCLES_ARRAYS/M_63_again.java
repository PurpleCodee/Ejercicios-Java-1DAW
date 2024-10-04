
package BUCLES_ARRAYS;
/* Crea un programa que encuentre el elemento de mayor valor de una matriz y...
a) ... muestre la posición de su primera aparición.
b) ... muestre una lista con las posiciones de todas sus apariciones*/

public class M_63_again {

    
    public static void main(String[] args) {
        int[][]matriz = {{1, 5, 12}, {12, 3, 7},{7, 8, 0}};
        int mayor = 0;
        String primera = "";
        String posiciones = "";
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    primera = i +"-"+ j;
                    posiciones = primera;
                }
                else if (mayor==matriz[i][j]) {
                    posiciones+=" "+ i + "-" + j;
                    
                }   
            }
        }
        System.out.println("La primera posicion es: " + primera);//lo muestro por pantalla
        System.out.println("A aparecido: " + posiciones);
    }
}
