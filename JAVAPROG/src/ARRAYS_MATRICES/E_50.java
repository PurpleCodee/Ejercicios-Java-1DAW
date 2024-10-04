package ARRAYS_MATRICES;

public class E_50 {

    /*50.- Crea un array de 100 Crea un array de 100 elementos dónde cada elemento sea un
           número aleatorio entre 1 y 100. A continuación muestra por pantalla el mayor y el
           menor elemento de ese array.*/

    public static void main(String[] args) {
        int numAleatorio = 0;
        int lista[] = new int[100];
        int mayor = 0;//el mayor con el valor mas bajo
        int menor = 100;//y el menorcon el valor mas alto que me piden

        for (int i = 0; i < lista.length; i++) {
            numAleatorio = 1 + (int) (Math.random() * 100);
            lista[i] = numAleatorio;
            if (lista[i] > mayor) {
                mayor = lista[i];
            }
            if (lista[i] < menor) {
                menor = lista[i];

            }
            System.out.println(" " + lista[i]);
        }
        System.out.println("El numero mayor de la lista es: " + mayor);
        System.out.println("El numero menor de la lista es: " + menor);
    }
}
