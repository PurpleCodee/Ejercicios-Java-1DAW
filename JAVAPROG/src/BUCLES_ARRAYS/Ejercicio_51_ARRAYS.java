
package Ejercicios_Bucles;


public class Ejercicio_51_ARRAYS {
/*Crea un array de 100 elementos dónde cada elemento sea un número aleatorio entre
1 y 100. Realiza los siguientes apartados:
a) Haz un programa que muestre los valores múltiplos de 5.
b) Otro que sólo muestre los números pares.
c) Otro que muestre el mayor de todos los elementos del array y su posición (si hay
varios iguales, muestra el primero*/
    
    public static void main(String[] args) {
       int aleatorio = (int) (Math.random()*100+1);
       int lista[] = new int[100];
       
        for (int i = 0; i < lista.length; i++) {//este for me genera un numero alaeatorio que va metiendo en casa celda
            lista[i] = (int) (Math.random()*100+1);//le he dado el valor de random a los valores dentro del array
            
            System.out.println("["+ i +"]"+ " " +lista[i]);//lo muestro por pantalla junto a lu posicion
            
        }
        
        System.out.print("Los multiplos de 5 son: " + " ");//creo otro for para decir que numeros son multiplos de 5
        for (int i = 0; i < lista.length; i++) {//es igual que el anterior
            
            if(lista[i] %5 == 0){//en el if le digo que me diga los numeros que sean divisibles entre 5 y el resto sea 0
                System.out.print(lista[i]+" ");//pido que me muestre los valores de la lista que sean multiplos de 5                
            }
        }
        System.out.println(" ");
       
        System.out.print("Los numeros pares son: " + " ");//creo otro for para decir que numeros son multiplos de 5
        for (int i = 0; i < lista.length; i++) {//es igual que el anterior
            if(lista[i] %2 == 0){//en el if le digo que me diga los numeros que sean divisibles entre 5 y el resto sea 0
                System.out.print(lista[i]+ " ");//pido que me muestre los valores de la lista que sean multiplos de 5
            }  
        }
    }
 }

