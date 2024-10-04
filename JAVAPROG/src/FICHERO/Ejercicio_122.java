package FICHERO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Ejercicio_122 {

    public static void main(String[] args) {
        //objetos y variables a declarar
        BufferedWriter buferEscritor = null;
        FileWriter archivoEscritura = null;

        BufferedReader buferLector = null;
        FileReader archivoLectura = null;

        int dinero = 100;
        int aput = 0;
        int apug = 0;

        String trozos[][] = new String[4][2];


        /*a)--------Comenzamos con un mensaje de bienvenida--------*/
        System.out.println("--------------------Bienvenido al mundo de las apuestas Hol Horse Alone--------------------");

        /*b)--------Preguntamos al jugador su nombre--------*/
        Scanner teclado = new Scanner(System.in);
        String jugador = "";

            System.out.print("¡¡HOLA JUGADOR!! ¿cual es tu NOMBRE?: ");
            jugador = teclado.next();



        /*c)--------Buscamos el archivo del 'nombre del jugado.dat'--------*/
        String rutaJugador = "src\\FICHERO\\data\\" + jugador + ".dat";
        File archivoJugador = new File(rutaJugador);

        //Verifico si el archivo existe
        try {
            if (!archivoJugador.exists()) {
                //si lo existe lo creamos

                //Abrimos el buffer de escritura para escribir en el archivo
                buferEscritor = new BufferedWriter(new FileWriter(archivoJugador));

                buferEscritor.write("Nombre:" + jugador + "\n");
                buferEscritor.write("Dinero:" + dinero + "\n");
                buferEscritor.write("Aput:" + aput + "\n");
                buferEscritor.write("Apug:" + apug + "\n");

                buferEscritor.newLine();//saltito de linea
                buferEscritor.close();//cierro buffer

                System.out.println("El archivo del jugado a sido creado");

            }
            /*--------------------c) Si existe cargo los datos en el fichero ----------------*/
            String datosJugador = "";

            //abro buffer de lectura
            buferLector = new BufferedReader(new FileReader(archivoJugador));
            trozos = new String[4][2];
            int i = 0;

            do {
                datosJugador = buferLector.readLine();
                if (datosJugador != null) {

                    trozos[i] = datosJugador.split(":");

                }
                i++;

            } while (datosJugador != null && i < trozos.length);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage() + "Error al crear el fichero: ");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("El array se ha salido de los limites del array");
            System.out.println(e.getMessage());

        } finally {

            try {
                //cierro primero el ultimo que abro
                if (buferLector != null) {
                    buferLector.close();
                }
                if (buferEscritor != null) {
                    buferEscritor.close();

                }

            } catch (IOException e) {
                System.out.println("Error: Cerrando flujo de datos");
                System.out.println(e.getMessage());

            }
        }

        /*--------------------d)Muestro los datos de manera ordenada ----------------*/
        System.out.println("-------------DATOS DEL JUGADOR-------------");
        for (int i = 0; i < trozos.length; i++) {

            System.out.println(trozos[i][0] + ":" + trozos[i][1]);
        }

        System.out.println("--------------------------------------------------------------------------------------------");

        /*----------------------------------------e)Cargar el archivo horse.dat pasos similares a los anteriores------------------------------------------------*/
        System.out.println("--------------------------¡¡¡CABALLOS PREPARADOS PARA CORRER!!!------------------------------------");

        /*e)--------Buscamos el archivo del 'nombre del caballo.dat'--------*/
        String rutaCaballito = "src/FICHERO/data/horses.dat";
        HashSet<String> caballosExistentes = new HashSet<>();

        try {
            //creo el archivo escribiendo con un buffer
            buferLector = new BufferedReader(new FileReader(rutaCaballito));
            String horses = "";

            do {
                horses = buferLector.readLine();
                if (horses != null) {
                    caballosExistentes.add(horses.trim());

                }

            } while (horses != null);

            //compruebo si hay caballos en la colecion
            if (caballosExistentes.isEmpty()) {
                System.out.println("No hay caballitos disponibels para correr");
                //el metodo isEmpty devuelve un booleano devuelve true si la cadena esta vacia
                return;
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("ERROR A CERRAR EL ARCHIVO: " + e.getMessage());

        } finally {
            try {
                if (buferLector != null) {
                    buferLector.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar flujos: " + e.getMessage());
            }
        }
        /*----------------------f)Zona de la carrera---------------------*/
        System.out.println("----------------------BIENVENIDO A LA ZONA DE LA CARRERA-------------------");
        /*---------------El jugador apostara cor uno de los tres caballitos---------------*/
        //esta parte del odigo seria mas sencilla con un hashMap
        /*try {
            String opcionJugador = "";

            do {
                System.out.println("¿QUE CABALLO ES TU APUESTA SEGURA?");

                for (String datosCaballitos : caballosExistentes) {
                    System.out.println(datosCaballitos);

                }
                System.out.print("Escribe el nombre de tu caballo GANADOR: ");
                opcionJugador = teclado.next();

            } while (!caballosExistentes.contains(opcionJugador));
            System.out.println("El caballo elegido por " + jugador + " es: " + opcionJugador);

        } finally {
            teclado.close();
        }*/
        boolean caballoValido = false;
        String opcionJugador = "";
        do {
            System.out.println("¿QUE CABALLO ES TU APUESTA SEGURA?");
            for (String caballitos : caballosExistentes) {
                System.out.println(caballitos.split(":")[0]);

            }
            System.out.print("Escribe el nombre de tu caballo GANADOR: ");
            opcionJugador = teclado.next();


            for (String caballitos : caballosExistentes) {
                //el metodo startsWith compueba por donde le indicamos que empieza la cadena
                //devuelve un booleano
                String nombreCaballo = caballitos.split(":")[0];
                if (nombreCaballo.equalsIgnoreCase(opcionJugador)) {
                    System.out.println("El caballo elegido por " + jugador + " es: " + opcionJugador);
                    caballoValido = true;

                }

            }
            if (!caballoValido) {
                System.out.println("El caballo no se ha encontrado");

            }

        } while (!caballoValido);

        
        /*-------------------g)Pedimos una apuesta al jugador----------------------------*/
        System.out.println("---------------HORA DE APOSTAR DEJATE LA NOMINA---------------------");
        int apuestaJugador = 0;
        
        try {
            do {
                System.out.print("¿Cuanto dinero quieres apostar? " + jugador + " : ");

                try {
                    //meto dentro de un try el teclado lo que permite reintroducir la apuesta
                    //si la del principio no fue valida , impido que se acabe el bucle
                    apuestaJugador = teclado.nextInt();

                    if (apuestaJugador < 15) {
                        System.out.println("No puedes apostar menos de 15€");

                    }

                } catch (InputMismatchException e) {
                    System.out.println("Introduce un numeron valido: " + e.getMessage());
                    teclado.next();//consume la opcion incorrecta limpiando el teclado

                }

            } while (apuestaJugador < 15);

        } finally {
            teclado.close();
        }

    }
}
