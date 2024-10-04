package BUCLES_ARRAYS;

public class cambio_filas {

    /* a) crea una matriz mxm 
   b) cambia los valores de  la fila 0 por la fila 2 
   c) cambia las columnas 
     */

    public static void main(String[] args) {
        int matriz[][] = {{2, 4, 6}, {6, 20, 7}, {8, 7, 5}};//creo mi matriz 
        int auxiliar = 0;//creo una auxil para 

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 10) {
                    System.out.print("0");
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 10) {
                    System.out.print("0");
                }
                auxiliar = matriz[2][j];//guardo todos los valores de la fila dos en auxiliar j recorre las columnas
                matriz[2][j] = matriz[0][j];//
                matriz[0][j] = auxiliar;

                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
            //si quiero cambiar las columnas cambio j por i
        }
    }
}
