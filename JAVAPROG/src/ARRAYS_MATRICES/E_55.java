package ARRAYS_MATRICES;

public class E_55 {

    /*53.- Haz un programa que dados dos arrays (tamaño y tipo los que tu quieras) diga sin
            esos arrays son iguales o no. Dos arrays son iguales si sus elementos son iguales y están
            en la misma posición.*/
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};//array prueba

        boolean iguales = true;//son iguales

        if (array1.length != array2.length) {//si el tamaño de array1 y array2 no es igual
            iguales = false;
        } else {
            int i = 0;
            while (iguales && i < array1.length) {//mientras que iguales sea cierto y i sea menor que el tamaño de array1
                if (array1[i]!=array2[i]) {//compara los valores de los arrays
                    iguales = false;
                    
                }
                i++;
            }
        }
        System.out.println("array1 y array2 son iguales: " + iguales);
        
        //compara array1 y array3
        iguales = array1.length == array3.length;
        
        int j = 0;
        
        while (iguales && j < array1.length) {
            if (array1[j] != array3[j]) {//compara los valores de array1 y array3
                iguales = false;//si son diferentes sera false
                
            }
            j++;
        }
        System.out.println("array1 y array3 son iguales: " + iguales);
    }
}
