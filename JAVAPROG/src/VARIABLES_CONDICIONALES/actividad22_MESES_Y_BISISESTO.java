
package programacion1ºTrimestre.javaapplication1;

import java.util.Scanner;
public class actividad22_MESES_Y_BISISESTO {
    //EJERCICIO 22 necesito realizar un algoritmo pido al usuario 1 mes del 1 al 12 y un año, indica si el mes tiene 31,30,29.o.28 en//
    //recuerda que en los años bisiestos febrero tien 29 dias y no 28//
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Dime un mes del 1 al 12:");//El usuario dice cualquier mes //
        int mes = teclado.nextInt();//variable mes/
        
        System.out.println("Dime un año:");//el usuario dice cualquier año//
        int año = teclado.nextInt();//variable año//
        
        teclado.close();
        if(mes == 1 || mes == 3 || mes == 5 ||mes == 7 || mes == 8 || mes == 10 || mes == 12){//si el mes es igual que esos numeros que son los meses //
            System.out.println("El mes " + mes + " tiene 31 dias");                           //el mes tendra 31 dia//
        
        }else if (mes == 2 && (año % 4) != 0){//else if se utiliza para dar mas opciones//
                                              //&& significa and si uno de los dos es falso o los dos el resultado sera false//
                                              //!= se utiliza para decir que algo es distiento a algo//
            System.out.println("El mes " + mes + " tiene 28 dias");
        }else if (mes == 2 && ((año % 4 == 0 || año % 100 != 0) || (año % 400 == 0))){
            System.out.println("El mes " + mes + " tiene 29 dias");
        
        }else{
            System.out.println("El mes " + mes + " tiene 30 dias");
        }
        
       
    }
    
}
