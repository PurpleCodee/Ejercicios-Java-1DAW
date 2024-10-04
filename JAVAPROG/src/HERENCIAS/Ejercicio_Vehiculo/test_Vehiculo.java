package HERENCIAS.Ejercicio_Vehiculo;

import java.util.Scanner;

public class test_Vehiculo {

    public static void main(String[] args) {
        //1º crear un par de objetos de cada clase
        Coche nissan = new Coche(60, 200, "blanco", 4);
        Coche clio = new Coche(100, 300, "negro", 4);
        Furgoneta gatin = new Furgoneta(500, "rosa", 4);
        Furgoneta perron = new Furgoneta(600, "morada", 4);
        Bicicleta deportiva = new Bicicleta(true, "azul", 2);
        Bicicleta urbana = new Bicicleta(false, "verde", 2);
        Motocicleta kioto = new Motocicleta(200, 150, "fuxia", 2);
        Motocicleta japon = new Motocicleta(150, 100, "naranja", 2);

        //2º recorrer la lista de vehiculos mostrar info de cada objeto
        Vehiculo lista[] = new Vehiculo[8];
        lista[0] = nissan;
        lista[1] = clio;
        lista[2] = gatin;
        lista[3] = perron;
        lista[4] = deportiva;
        lista[5] = urbana;
        lista[6] = kioto;
        lista[7] = japon;

        //3º utilizar un for para instanciar la clase bicicleta y llamar su metodo
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Bicicleta) {
                ((Bicicleta) (lista[i])).tocarTimbre();
                //()para lo que casteo que es la clase
                //()para lo que quiero castear
                //() para lo que muestro todo menos el metodo
            }
        }
        //4º  preguntar al usuario por un numero que indicara el numero de ruedas   
        Scanner teclado = new Scanner(System.in);
        int ruedasCambiar = 0;
        System.out.print("Dime un numero de ruedas: ");
        ruedasCambiar = teclado.nextInt();

        if (ruedasCambiar == kioto.ruedas) {
            System.out.println(ruedasCambiar);
        }else{
            System.out.println("La rueda no miau miau miau");
        
        }
        //cierro teclado
        teclado.close();
    }
}
