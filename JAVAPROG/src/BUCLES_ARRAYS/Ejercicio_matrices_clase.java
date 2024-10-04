
package Ejercicios_Bucles;


public class Ejercicio_matrices_clase {
/*a)Calcula la suma de todos los elementos de la matriz

b) Calcula la media de todos los elementos de la matriz (NO SE PUEDE UTILIZAR CONTADOR)*/
    //Intercambia los valores de la primera fila con los de la última
    //Igual que C pero con columnas
    
    
    public static void main(String[] args) {
        int estrella [][] = {{2 ,7, 9 },{33, 2, 5},{9, 14 ,7}};
        double suma = 0;//declaro una variable para calcular la suma
        double media =0;
        int temp = 0;
        
        for (int i = 0; i < estrella.length; i++) {//son las filas
            
            for (int j = 0; j < estrella[i].length; j++) {//son las columnas
                suma +=estrella[i][j];
      
            }
            
        }
         System.out.println(suma);
         media = suma/(estrella.length*estrella.length);
         System.out.println(media);
         
         for (int j = 0; j < estrella.length; j++) {//el segundo apartado seria lo mismo pero con i
            temp=estrella[0][j];
            estrella[0][j]=estrella[2][j];
            estrella[2][j]=temp;
     
        }
         for (int i = 0; i < estrella.length; i++) {
             
             for (int j = 0; j < estrella.length; j++) {
                 System.out.print(estrella[i][j]+"\t");
             
             }
             System.out.println();
            
        }
       
    }
    
}
