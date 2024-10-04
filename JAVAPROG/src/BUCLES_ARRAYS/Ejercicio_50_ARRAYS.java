
package Ejercicios_Bucles;


public class Ejercicio_50_ARRAYS {
/*Crea un array de 100 Crea un array de 100 elementos dónde cada elemento sea un
número aleatorio entre 1 y 100. A continuación muestra por pantalla el mayor y el
menor elemento de ese array*/
    
    public static void main(String[] args) {
        int max = 1;
        int min = 1;
        int aleatorio = (int) (Math.random()*100+1);
        int lista [] = new int[100];
      
        for (int i = 0; i < lista.length; i++) {
            aleatorio = (int) (Math.random()*100+1);
            lista[i] = aleatorio;
                       
            if(aleatorio > max){
                max = aleatorio;
            }
            if(aleatorio < min){
               min = aleatorio;
            }
        }
        
        System.out.println("Contenido de la lista: ");
        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
       
        System.out.println("El mayor es: " + max);
        System.out.println("El menor es: " + min);
    }
}
