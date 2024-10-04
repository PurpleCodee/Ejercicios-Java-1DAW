
package programacion1ºTrimestre.javaapplication1;
//EJERCICIO 3 TENGO QUE PEDIR 2 EDADES Y DECIR CUAL ES LA MAYOR Y CUAL ES EL MENOR SIN UTILIZAR Math//
import java.util.Scanner;
public class ejercicio_EDAD_MAYOR_MENOR {
    
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);//Le pido al usuario que me escriba dos edades una mayor y otra menor//
        System.out.print("Dame una edad:");
        int numero1 = teclado.nextInt();
        
        System.out.print("Dame otra edad:");
        int numero2 = teclado.nextInt();
        teclado.close();
        //nombro dos variables mas que seran mayor y menor//
       int mayor;
       int menor;
       
        if(numero1 > numero2 ) {//si numero 1 es mayor que numero 2 el mayor sera el 1 y el menor sera el 2//
            mayor = numero1;
            menor = numero2;
        }else{//si no es mayor el numero 1 el mayor sera el 2 y el menor sera el 1//
            mayor = numero2;
            menor = numero1;
        }
        System.out.println("El mayor es:" + mayor);//muestro por pantalla mas la variable mayor y la variable menor//
        System.out.println("El menor es:" + menor);
    }//fijarse muy bien en las llaves a veces el error es de que no se ha cerrado alguna//
}
