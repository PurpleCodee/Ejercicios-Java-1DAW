
package Ejercicios_Bucles;

public class Ejercicio_34_while {
//Crea un programa que muestre todos los múltiplos de 6 entre 6 y 200, ambos
//inclusive
    public static void main(String[] args) {
        int num = 6; //la variable num vale 6
            while(num<200){//Utilizo un bucle while que se ejecutará mientras num sea menor o igual a 200
                
                System.out.println (num);//aparecera el mensaje en pantalla num 
                num+=6;// Incrementamos num en 6 para pasar al siguiente múltiplo de 6
                
            }
        }
    
}
