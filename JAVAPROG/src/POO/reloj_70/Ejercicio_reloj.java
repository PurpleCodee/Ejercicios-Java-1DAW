
package POO.reloj_70;

import POO.reloj_70.Reloj;

/*Queremos implementar una clase para controlar relojes digitales de 24 horas
De un reloj es necesario saber las horas, los minutos y los segundos que marcan.
Tambien debemos controlar si el reloj esta encendido o no.

El reloj puede:
-encenderse(): el reloj pasa a estar encendido (0.25 puntos)
-apagarse(): el reloj pasa a estado apagado (0.25 puntos)

-adelantarHora(): suma una hora CORRECTA a la hora actual (0.5 puntos)
-adelantarMinutos(int cantidad): añade 'cantidad' a los minutos actuales.(1 punto)
-adelantarSegundos(int cantidad:) añade 'cantidad a los segundos actuales(1 punto)

Un reloj puede"hacer cosas" si y solo si esta encendido

a) Crea un constructor al que se le pasara como parametros las horas, minutos y segundos , Si alguno de esos valores no es correcto, se le pndra 00
Un reloj siempre empieza APAGADO .(1 punto)

b)Implementa los metodos indicados mas arriba

c) MAIN

1) Crea un reloj con los valores 24,58,73
2) adelelanta una hora
3)Muestra las horas:minutos:segundos
4) Enciende el reloj
5) adelanta 65 minutos
6) adelanta 120 segundos
7) Repite el paso 3 
8) Apaga el reloj
9) adelanta 5 segundo
10) Repite el paso 3

*/

public class Ejercicio_reloj {


    public static void main(String[] args) {
        Reloj casio = new Reloj (24, 58, 73);
        
        casio.adelantarHora();
        System.out.println(casio.horas+":"+casio.minutos+":"+casio.segundos);
        casio.encender();
        casio.adelantarMinutos(65);
        System.out.println(casio.horas+":"+casio.minutos+":"+casio.segundos);
        casio.adelantarSegundos(120);
        System.out.println(casio.horas+":"+casio.minutos+":"+casio.segundos);
        casio.apagarse();
        casio.adelantarSegundos(5);
        System.out.println(casio.horas+":"+casio.minutos+":"+casio.segundos);
        
     
        
     
      
    }
    
}
