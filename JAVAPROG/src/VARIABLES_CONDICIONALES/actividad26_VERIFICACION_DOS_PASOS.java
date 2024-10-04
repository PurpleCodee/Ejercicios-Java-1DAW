
package VARIABLES_CONDICIONALES;
import java.util.Scanner;
import java.lang.Math;

public class actividad26_VERIFICACION_DOS_PASOS {
//EJERCICIO 26 Sistema de verificacion en 2 pasos,se le pide al usuario nick,email,contraseña//
    //si el email y contraseña son correctos el programa genera un numero aleatorio de 4 cifras y lo muestra por pantalla//
    //a continuacion se vuelve a pedir el email y la contraseña y esta vez el numero aleatorio//
    //si todo va correctamente se muestra "verificacion aceotada bienvenido:nick del usuario//
    //si hay algun fallo se muestra un mensaje de error//
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.print("Escribe tu nick: ");//Le digo al usuario que me de su nick,email y contraseña//
        String nick = teclado.nextLine();

        System.out.print("Escribe tu email: ");
        String email  = teclado.nextLine();//utilizo el tipo string//

        System.out.print("Escribe tu contraseña: ");
        String contraseña = teclado.nextLine();

        String contraseñaCorrecta ="a";//creo las variables que seran la contraseña y el email correcto que introducire//
        String emailCorrecto = "a";

        if(email.equals(emailCorrecto)&& contraseña.equals(contraseñaCorrecta)){//utilizo equals para comparar y && para que si son correcto pasen//
                                                                                //y si uno de ellos no es correcto no pasa//
            System.out.println("Datos correctos");
            
            int aleatorio = (int) (Math.random()*9000+1000);//creo variable aleatorio y utilizo el math random para que me de 4 digitos//
            System.out.println(aleatorio);//con esta funcion me crea un cogigo aleatorio//
            
            System.out.println("Introduzca email: ");//vuelvo a pedir al usuario su email y contraseña//
            String email_2 = teclado.nextLine();//creo 2 variables nuevas de email y contraseña//
           
            System.out.println("Introduzca contaseña: ");
            String contraseña_2 = teclado.nextLine();
            
            System.out.println("Introduzca codigo: ");//pido que introduzca el codigo//
            int codigo = teclado.nextInt();//creo la variable codigo//
           
            if(!email_2.equals(email) || !contraseña_2.equals(contraseña)|| codigo!=aleatorio){//Con la exclamacion indico que no seran correctos//
                System.out.println("ERROR: Alguno de los datos no son correctos");
            }
            else{
                System.out.print("Verificacion aceptada: " + nick);
            }
        }
        else{
            System.out.println("Los datos no son correctos");
        }
    }
    
}
