package POO.reloj_70;

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
 */
public class Reloj {

    boolean encendido;
    int horas;
    int minutos;
    int segundos;

    //Metodo constructor
    public Reloj(int horas, int minutos, int segundos) {
        this.encendido = false;//declaaro en false porque por defecto el reloj esta apagado
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        //en el constructor controlo que las horas, minutos y segundos son correctos no son ni menores que o ni mayores que el valor
        if (this.horas < 0 || this.horas >= 24) {
            this.horas = 0;
        }
        if (this.minutos < 0 || this.minutos >= 60) {
            this.minutos = 0;
        }
        if (this.segundos < 0 || this.segundos >= 60) {
            this.segundos = 0;
        }
    }

    public void encender() {//metodo para encender el reloj
        encendido=true;
        System.out.println("El reloj esta encendido");
        
    }

    public void apagarse() {//metodo para apagar el reloj
       encendido = false;
       System.out.println("El reloj esta apagado");
    }

    //controlo las horas correctas
    public void adelantarHora() {
        if (this.encendido) {//encendido 
            System.out.println("El reloj esta encendido se adelanta una hora");
            this.horas++;
            if (horas > 23 || (this.horas < 0)) {
                this.horas = 0;
            }
        }
        else{
        //    System.out.println("El reloj esta apagado y no se pueden adelantar horas...");
        }
    }
    //adelantar segundos

    public void adelantarSegundos(int cantidad) {
        if (this.encendido) {
            if (cantidad >= 60){
                int minSobra = cantidad / 60;
                this.segundos = cantidad % 60;
                this.adelantarMinutos(minSobra);

            }else{
                this.segundos = cantidad;
            }
            System.out.println("El reloj esta encendido y se añade " + cantidad + " segundos");

            
        }else {
            System.out.println("El reloj esta apagado y no puedo adelantar segundos....");
        }
    }
    //adelanto los minutos
    public void adelantarMinutos(int cantidad) {
        if (this.encendido) {
            this.minutos += cantidad;
            if (this.minutos >= 60){
                while (this.minutos >= 60) {
                    this.adelantarHora();
                    this.minutos -= 60;
                    System.out.println("El reloj esta encendido y se añade " + this.minutos + " minutos");
                }
            }else{
                System.out.println("El reloj esta encendido y se añade " + cantidad + " minutos");
            }
            

        }else{
            System.out.println("El reloj esta apagado y no puedo adelantar minutos....");
        }
    }
}
