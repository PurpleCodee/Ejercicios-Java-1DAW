
package Ejercicios_Bucles;
import java.util.Scanner;
public class Ejercicio_30_Bucles {
//Escribe un programa que lea de teclado 2 números enteros y saque en pantalla todos los números que estén entre ellos.//
//b) Modifica el programa para que solo escriba en pantalla los números pares del intervalo.//
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Dime un numero entero : ");
        int num_1 = teclado.nextInt();
        System.out.print("Dime un numero entero : ");
        int num_2 = teclado.nextInt();
        
        teclado.close();
        System.out.println("Numeros entre " + num_1 +" y " + num_2);
        
        if(num_1<=num_2){//si el numero 1 es menor o igual que el numero 2
            for (int i = num_1; i < num_2; i++) {//ahora ejecutamos el for a la i le damos el valor de num_1 si num_1 es menor que num_2 aparece i y se le suma 1
                System.out.println(i); 
            }  
        }
        else{//para el caso contrario creo un else
            
            for (int i = num_2; i < num_1; i++) { //hago lo mismo que arribe pero con las instrucciones al reves la i guarda el valor de num_2
                                                   //y si num_2 es menor que num_ aparecera i con el valero de num_2 y se le sumara 1
                System.out.println(i);
                
            }
        }      
       
                
    }
           
 }       

