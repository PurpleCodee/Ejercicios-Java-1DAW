
package ARRAYS_MATRICES;
public class E_58 {
      /*58.- Uno de los métodos más famosos para ordenar un array numérico es el algoritmo
                de ordenación por selección. Este algoritmo consiste en:
        
                • Se busca el elemento más pequeño del array se coloca en la primera posición.
                • Se hace lo mismo que en el punto anterior pero ahora se toma todo el array
                menos la primera posición (porque ya está ordenada).
        
                • Se repite el primer punto pero ahora solo se toma todo el array menos las dos
                primeras posiciones (porque ya están ordenadas).
        
                • Se repite el primer punto hasta que ordeno todos los elementos del array.
                Crea un programa en el que se defina un array de 10 números enteros aleatorios (entre 1
                y 100) y ordene ese array usando la ordenación por selección.*/
    
    public static void main(String[] args) {
        int[] matriz = new int[10];
        int minimo = 1; // Mínimo valor para los números aleatorios
        int maximo = 100; // Máximo valor para los números aleatorios

        // Rellenar el arreglo con números aleatorios entre minimo y maximo
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = (int)(Math.random() * ((maximo - minimo) + 1)) + minimo;
        }

        // Mostrar el arreglo antes de ordenarlo
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + " ");
        }
        System.out.println();

        // Ordenación por selección
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                if (matriz[j] < matriz[i]) {
                    // Intercambiar elementos
                    int temp = matriz[i];
                    matriz[i] = matriz[j];
                    matriz[j] = temp;
                }
            }
        }

        // Mostrar el arreglo después de ordenarlo
        System.out.println("Matriz ordenado:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + " ");
        }  
    }  
}
