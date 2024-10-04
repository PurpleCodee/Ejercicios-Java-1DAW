
package Ejercicios_Bucles;


public class Ejercicio_48_ARRAYS {
/* Sea el array relleno con las notas: 6,3,9,7,5,8,10,2,4 y 5
Crea un programa que, a partir de ese array, muestre por pantalla la media aritmética de
las notas*/
    
    public static void main(String[] args) {
        double notas_suma = 0;//creo una variable con valor 0 para despues utilizarla para calcular la media
        double lista[]={6,3,9,7,5,8,10,2,4,5};//creo un array mostrando sus valores pero sin indicar su tamaño
        for (int i = 0; i < lista.length; i++) {//tutilizo un for para recorrer el array 
            notas_suma = notas_suma + lista[i];// Suma el valor actual del array al acumulador "notas_suma"
            System.out.println("["+i+"]" + " " + lista[i]);//muestro la celda y el valor dentro de ella
        }
        double media = notas_suma/lista.length;//fuera del for creo una variable (media) en la que hago la diision de la suma de los valores del array y el tamaño
        System.out.println("La media es: " + media);//muestro la media de las notas
       
    }
    
}
