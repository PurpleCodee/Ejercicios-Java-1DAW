
package ARRAYS_MATRICES;

public class E_48 {
    /*48.- Sea el array relleno con las notas: 6,3,9,7,5,8,10,2,4 y 5
           Crea un programa que, a partir de ese array, muestre por pantalla la media aritmética de
           las notas.*/

    public static void main(String[] args) {
        double notas[]={6,3,9,7,5,8,10,2,4,5};
        double suma = 0;
        double media = 0;
        
        //la media se calcula sumando todas las notas y el resultado dividirlo entre el numero de notas que sera el tamaño
        for (int i = 0; i < notas.length; i++) {

            suma+= notas[i];
            media = suma/notas.length;
            System.out.println("La posicion : " + i + " valor : " + notas[i]);
            
        }
        System.out.println("La suma de todas las notas es: " + suma);
        System.out.println("La media de las notas es: " + media);
    }  
}
