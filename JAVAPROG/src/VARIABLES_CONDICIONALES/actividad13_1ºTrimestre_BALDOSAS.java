
package programacion1ºTrimestre.javaapplication1;

import java.util.Scanner;//Esta linea importa la clase Scanner para leer la entrada del usuario en la consola//
import java.lang.Math;//Esta linea importa la clase Math que me sirve para hacer metodos matematicos//

public class actividad13_1ºTrimestre_BALDOSAS {
    //Se necesita un algoritmo que calcule el coste total de baldosas cuadradas necesarias//
    //para cubrir el suelo de una habitación rectangular. El programa solicitará como datos las dimensiones de la habitación en metros//
    //(ancho y largo), el lado de cada baldosa expresado en centímetros y el precio por baldosa expresado en euros.//
    //Con esos datos calculará el número de baldosas necesarias que hay que colocar en la habitación //
    //(redondeando hacia arriba si el resultado no es un numero entero) y el precio//
    //total a invertir.//
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        //Pido las dimensiones de la habitacion en metros//
        
        System.out.print("Dime el ancho de la habitacion en metros:");
        double ancho = teclado.nextDouble();//Imicio las variables ancho,largo con el tipo double//
        
        System.out.print("Dime el largo de la habitacion en metros:");
        double largo = teclado.nextDouble();
        
        //Solicito el lado de las baldosas en centimetros//
        System.out.print("Lado de baldosas en centimetros:");
        double lado_cm = teclado.nextDouble();
        
        //Convierto el lado de las baldosas de centimetros a metros//
        //Creo otra variable que sea lado de baldosas a metros y hago que se ejecute en el teclado igual que las demas//
        double lado_metro = lado_cm / 100.0;
        
        //Solicito el precio de baldosa en euros//
        //Creo otra variable para el precio de las baldosas y hago que se ejecute//
        System.out.print("Diga el precio de baldosa en euros:");
        double precio = teclado.nextDouble();
        
        teclado.close();//cierro la varible teclado porque ya a terminado su funcion//
        //ahora debo calcular el area de la habitacion en metros cuadrados//
        //calculo el area creando una variable que sea el area y multiplico largo por ancho//
        double area = largo * ancho;
        //calculo el numero de baldosas que necesito(redondeando hacia arriba con Math.ceil//
        //creo una variable para numero de baldosas//
        double numero_baldosas = Math.ceil(area/(lado_metro * lado_metro));
        
        //Calculo el precio a invertir//
        //creo una variable para el precio total que va a ser//
        double precio_total = numero_baldosas * precio;
        //muestro el resultado//
        System.out.print("Numero de baldosas que se necesitan:" + numero_baldosas);
        System.err.print("Precio total en euros:" + precio_total);
        
        
        
       
    }
    
}
