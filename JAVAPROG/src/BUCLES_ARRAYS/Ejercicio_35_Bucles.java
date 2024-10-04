
package Ejercicios_Bucles;
import java.util.Scanner;

public class Ejercicio_35_Bucles {
/*Implementa un programa que solicite al usuario dos números: n y m. A continuación
debe mostrar todos los múltiplos de n, entre n y m*n. Ejemplo:
Introduce primer número: 4
Introduce segundo número: 10
Los múltiplos de 4 entre 4 y 40 son: 8,12,16,20,24,28,32,36,40*/

    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
        
        System.out.print("Dime un numero : ");
        int n = teclado.nextInt();
        System.out.print("Dime un numero : ");
        int m = teclado.nextInt();
        
        teclado.close();
        
        System.out.print("Los multiplos de " + n + " entre " + n + " y " + n*m + " son: ");
        for (int i = n; i <= n*m; i++) {//utilizo un for porque se cual es n que es el primero numero y cual es n*m que es el ultimo numero
                                        //recorro el for has que llegue a un numero menor o igual que la multiplicacion de n*m
            if (i%n==0) {//i es un multiplo si en la division de i entre n el resto es 0(para saber si es un multiplo)
                if(n*m == i){//utilizo para que no me salga la , en n*m que es el ultimo numero
                    System.out.println(i);//mostrare el ultimo numero que es i sin la coma
                }else{
                    System.out.print(i + " , ");
                }
            }
        }
    
    }
}
