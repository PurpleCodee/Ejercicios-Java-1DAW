
package BUCLES_ARRAYS;

import java.util.Scanner;

/*Crea un programa que cree una matriz de tamaño NxM (tamaños introducido por
teclado) e introduzca en ella los valores también a través del teclado teclado. A
continuación deberá mostrar por pantalla cuántos valores son mayores que cero, cuántos
son menores que cero y cuántos son igual a cero (es decir, se muestran 3 números)*/

public class M_62_again {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int n = teclado.nextInt();
        
        System.out.print("Dime otro numero: ");
        int m = teclado.nextInt();
        
        int mayor=0;
        int menor=0;
        int iguales=0;

        int matriz[][]=new int[n][m];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Dime los valores de la matriz: ");
                matriz[i][j]=teclado.nextInt();
                
                if (matriz[i][j] > 0) {
                    mayor++;
                }
                else if (matriz[i][j] < 0) {
                    menor++;
                }
                else{
                    iguales++;
                }
            }
        }
        System.out.println("Los valores mayores que 0: " + mayor);
        System.out.println("Los valores menores que 0: " + menor);
        System.out.println("Los valores iguales que 0: " + iguales); 
    }
}
