package ARRAYS_MATRICES;

public class E_filas_columnas {

    /*
    a)Calcula la suma de todos los elementos de la matriz

    b) Calcula la media de todos los elementos de la matriz (NO SE PUEDE UTILIZAR CONTADOR)*/
    //Intercambia los valores de la primera fila con los de la última
    //Igual que C pero con columnas

    public static void main(String[] args) {
        int estrella[][] = {{2, 7, 9}, {33, 2, 5}, {9, 14, 7}};
        double suma = 0; // Declara una variable para calcular la suma
        double media = 0;
        int temp = 0;

        // Calcula la suma y la media
        for (int i = 0; i < estrella.length; i++) {
            for (int j = 0; j < estrella[i].length; j++) {
                suma += estrella[i][j];
            }
        }
        System.out.println("Suma: " + suma);
        media = suma / (estrella.length * estrella[0].length);
        System.out.println("Media: " + media);

        // Intercambia los valores de la primera fila con los de la última fila
        /*for (int j = 0; j < estrella[0].length; j++) {
            temp = estrella[0][j];
            estrella[0][j] = estrella[estrella.length - 1][j];
            estrella[estrella.length - 1][j] = temp;
        }*/
        
        int aux [] = estrella[0];
        estrella[0] = estrella[estrella.length - 1];
        estrella[estrella.length - 1] = aux;

        // Imprime la matriz después del intercambio de filas
        System.out.println("Matriz después del intercambio de filas:");
        for (int i = 0; i < estrella.length; i++) {
            for (int j = 0; j < estrella[i].length; j++) {
                System.out.print(estrella[i][j] + "\t");
            }
            System.out.println();
        }
        
         // Intercambia los valores de la primera columna con los de la última columna
        for (int i = 0; i < estrella.length; i++) {
            temp = estrella[i][0];
            estrella[i][0] = estrella[i][estrella[i].length - 1];
             estrella[i][estrella[i].length - 1] = temp;
        }

        // Imprime la matriz después del intercambio de columnas
        System.out.println("Matriz después del intercambio de columnas:");
        for (int i = 0; i < estrella.length; i++) {
            for (int j = 0; j < estrella[i].length; j++) {
                System.out.print(estrella[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}
