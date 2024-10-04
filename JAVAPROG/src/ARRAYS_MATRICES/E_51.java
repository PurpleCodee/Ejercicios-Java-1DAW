package ARRAYS_MATRICES;

public class E_51 {

    /*51.- Crea un array de 100 elementos dónde cada elemento sea un número aleatorio entre
            1 y 100. Realiza los siguientes apartados:
    
            a) Haz un programa que muestre los valores múltiplos de 5.
    
            b) Otro que sólo muestre los números pares.
    
            c) Otro que muestre el mayor de todos los elementos del array y su posición (si hay
            varios iguales, muestra el primero)*/
    public static void main(String[] args) {

        
        int numAleatorio = 0;
        int posicionMayor = 0;
        int mayor = 0;

        int lista[] = new int[100];
        for (int i = 0; i < lista.length; i++) {
            
            numAleatorio = 1 + (int) (Math.random() * 100);
            lista[i] = numAleatorio;
  
            if (lista[i] % 5 == 0) {
                System.out.println("Numeros multiplos de 5: " + lista[i]);

            }
            if (lista[i] % 2 == 0) {
                System.out.println("Numeros pares: " + lista[i]);

            }
            if (lista[i] > mayor) {
                mayor = lista[i];
                posicionMayor = i;
            }
        }

        System.out.println("El numero mayor de la lista es: " + "(" + mayor + ")" + " posicion " + "[" + posicionMayor + "]");
    }
}
