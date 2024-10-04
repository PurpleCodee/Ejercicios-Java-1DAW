
package programacion1ºTrimestre.javaapplication1;
import java.util.Scanner;


public class ejercicioAREA_BASE {
    public static void main(String [] args){
        //Primero, voy a pedirle al usuario la base y la altura que quiera
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame la base");
        double base = teclado.nextDouble();
        System.out.println("Dame la altura");
        double altura = teclado.nextDouble();
        
        //Una vez tengo la base y la altura, voy a calcular el area y el perimetro
        double area = base*altura;
        System.out.println("El resultado del area es: " + area);//que es el resultado de la base por la altura//
        double perimetro = base*2 + altura*2;//la base la multiplico por 2 dos veces y la sumo para saber el perimetro//
        System.out.println("El resultado del perimetro es: " + perimetro);


        //Una vez calculado el area y el perimetro, voy a mostrarlo por pantalla



        //FIN
    }
}
