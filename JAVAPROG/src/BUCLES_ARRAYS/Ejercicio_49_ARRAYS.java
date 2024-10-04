
package Ejercicios_Bucles;


public class Ejercicio_49_ARRAYS {
/*Sea el array flags con los valores: 0,1,0,-1,0,-1,-1,-1,0,0,-1. Crea un
nuevo array llamado tivic que sea copia del anterior.
A continuación recorre el primer array (flags) y cambia todos los valores negativos por
el valor 8.*/

    public static void main(String[] args) {
        int flags[]={0,1,0,-1,0,-1,-1,-1,0,0,-1};//array de flags
        int tivic [] = new int [flags.length]; // Se declara un nuevo array "tivic" con la misma longitud que "flags"
        
        for(int i = 0; i < tivic.length; i++){
            tivic[i] = flags[i];// Se copian los valores del array "flags" en el array "tivic"
         
        }
        for (int i = 0; i < flags.length; i++) {// Si un valor en "flags" es negativo, se actualiza a 8
            if(flags[i] < 0){
                flags[i] = 8;
            }
        }
        
        System.out.print("Los valores de flags son: ");
        for(int i = 0; i < flags.length; i++){
            
            if (i == flags.length -1){//-1 porque no llega al tamaño del array porque le quito 1 con el -1
                System.out.println(flags[i]);// Imprime los valores de "flags" en la consola, separados por comas
            }else{
                System.out.print(flags[i] + ", ");
            }
            
        }
    }
    
}
