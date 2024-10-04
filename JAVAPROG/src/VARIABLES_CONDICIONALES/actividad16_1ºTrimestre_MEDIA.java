
package programacion1ºTrimestre.javaapplication1;
import java.util.Scanner;

public class actividad16_1ºTrimestre_MEDIA {
//ACTIVIDAD 16 DE CONDICIONALES: se necesita un algoritmo que calcule la media de tres notas introducidas por teclado y en el caso//
    //de que la media sea superior a 6.5 se muestre por pantalla"Promocionado con una media de :" en caso de lo contrario "no promocionas//
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);//pido las 3 notas por teclado//
    
        System.out.println("Introduce 3 notas:");//Creo las variables de las notas y hago que se muestren por teclado//
        double nota1 = teclado.nextDouble();//utilizo el tipo de variable double para abarcar tanto numeros enteros como numeros decimales//
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();
        
        teclado.close();//se utiliza para cerrar el teclado ya que no voy a pedirle al usuario ningun dato mas//
        double media = (nota1 + nota2 + nota3)/3;//con esta operacion calculo una media se calcula sumando las variables que a dado el usuario y dividiendolas//
        //y dividiendolas entre 3 que son las notas que me a dado el usuario/7
        //anteriormente he creado una variable que se llame media//
       
        if (media > 6.5) {//si la variable media que es la operacion anterior es mayor que 6.5 que son los datos que me da el ejercicio//
            System.out.print("Promocionado con un media de:" + media);//la pantalla me muestra que promociona + la variable media//
        }
        else//es el caso de que la media no fuese mayor a 6.5//
            System.out.print("No promocionas");//la panatalla me mostrara no promocionas//
    }
    
}
