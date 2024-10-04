package POO.estudiante;

/*Define la clase Estudiante de la siguiente forma: De cada estudiante debemos
saber su nombre, sus apellidos y una lista de calificaciones que va a tener en el curso. El
tamaño de esa lista se pasará en el constructor. Además, todas las propiedades deben ser
privadas.

Al comienzo, todas las calificaciones del estudiante tendrán el valor -1 (no presentado).

Define los siguientes métodos de la clase:

• InsertarNota(double nota): meterá la nota que se le pasa como
parámetro en la lista de notas. Devolverá true si consigue meterla o false si no
consigue hacerlo (porque la lista ya esté llena).


• MostrarNotas(): devolverá una cadena bien maquetada con las notas de ese
estudiante.


• CalcularMedia(): devolverá la media de las notas que tenga ese estudiante
hasta el momento. Los ‘no presentados’ no deben contarse para calcular la
media.


• IndicarRangos(): este método contará cuantos insuficientes, suficientes,
notables y sobresalientes tiene el estudiante y devolverá esos valores.


• toString(): Este método debe generar la información del estudiante. Para
ello sigue la siguiente plantilla:*/

public class Estudiante {

    private String nombre;
    private String apellidos;
    private double[] calificaciones;

    //constructor
    public Estudiante(String nombre, String apellidos, double calificaciones[]) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calificaciones = calificaciones;
        int i = 0;

        //mientras que el contador sea menor que la cantidad de calificaciones que se introducen por teclado
        while (i < this.calificaciones.length) {
            //se inicializan todas las calificaciones a -1
            this.calificaciones[i] = -1;
            i++;
        }
    }
     //metodo insertarNota
    public boolean insertarNota(double nota) {
        int i = 0;

        //introduzco la nota mientras que el contador sea menor que y tamaño y el valor que guarda el array sea diferente a -1 (no presentado)
        while (i < this.calificaciones.length) {
            //si la nota que hay es -1 ya que todas empiezan hay por lo que hay ese espacio se llena y devuelve true
            if (this.calificaciones[i] == -1) {
                this.calificaciones[i] = nota;

                return true;

            }
            i++;

        }
        System.out.println("no puedes introducir mas notas");//de prueba
        return false;

    }


    //metodo mostrarNota
    public String mostrarNota() {
        String notas = "";
        int i = 0;
        while (i < this.calificaciones.length) {
            //guardo las notas en una cadena para despues mostrarlas
            notas += this.calificaciones[i] + "";
            i++;
        }
        return notas;
    }

    //metodo para calcular media
    public double calcularMedia() {
        double suma = 0;
        double media = 0;
        int i = 0;//cuento las vueltas que son las posicioenes 
        int contador = 0; //cuento las calificaciones

        while (i < this.calificaciones.length) {

            //si la nota del array es diferente a -1 se puede sumar
            if (this.calificaciones[i] != -1) {
                suma += this.calificaciones[i];
                contador++;
            }
            i++;

        }
        //devuelve la media si ls notas no son -1 o menores
        media = suma/contador;
        return media;
    }

    //metodos indicar rangos
    public double[] indicarRangos() {
        /*  double insuficiente = 0;
            double suficiente = 1;
            double notable = 2;
            double sobresaliente = 3;*/
        String res = "";
        
        double rangos[] = new double[4];
        for (int i = 0; i < rangos.length; i++) {
            rangos[i]=0;
            
        }
        int i_cont = 0;//contador de while
        while (i_cont < this.calificaciones.length) {

            if (this.calificaciones[i_cont] >= 0 && this.calificaciones[i_cont] < 5) {

                rangos[0]++;

            } else if (this.calificaciones[i_cont] >= 5 && this.calificaciones[i_cont] < 7) {

                rangos[1]++;

            } else if (this.calificaciones[i_cont] >= 7 && this.calificaciones[i_cont] < 9) {

                rangos[2]++;

            } else if (this.calificaciones[i_cont] >= 9 && this.calificaciones[i_cont] <= 10) {
                rangos[3]++;
            }
            i_cont++;
        }
        return rangos;
    }

    private String datosEstudiante() {
        
        double [] rangos = this.indicarRangos();

        return "Estudiante: " + this.nombre + " " + this.apellidos + "\n"+
                 "Notas: " + mostrarNota() + "\n"+
                 "Rangos: " + "Insuficientes: " + rangos[0] + "\n" + "Suficientes: " + rangos[1] + "\n" +
                 "Notables: " + rangos[2] + "\n" +  "Sobresalients: " + rangos[3] + "\n"+ 
                 "Media: " + calcularMedia();
    }
    
    @Override
    public String toString() {
        return datosEstudiante();
    }
}
