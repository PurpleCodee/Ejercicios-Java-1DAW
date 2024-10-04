
package ASOCIACION_COMPOSICION.Guerrero;
/*Por otro lado, la clase arma. Va a representar un arma que podrá ser usada por un
guerrero. Un arma va a tener:
• nombre: nombre del arma.
• resistencia: un número que indica el aguante del arma.
• poder: número que indica la cantidad de daño que hace el arma.

Todos los atributos serán privados. El único método que tendrá la clase arma es
toString()*/
public class Arma {
    private String nombre;
    private int resistencia;
    private int poder;
    private int nivel;
    
    //Metodo constructor
    public Arma(String nombre, int resistencia, int poder) {
        this.nombre = nombre;//nombre del arma.
        this.resistencia = resistencia;// un número que indica el aguante del arma.
        this.poder = poder;//número que indica la cantidad de daño que hace el arma.
        this.nivel = 1;//simepre comienza en 1 el nivel 
    }
    //metodo toString para mostrar datos del arma

    public String getNombre() {
        return this.nombre;
    }

    public int getResistencia() {
        return this.resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getPoder() {
        return this.poder;
    }
    
    public void subirNivelArma(){
    // este método hace que el nivel del arma aumente y, en consecuencia,
    //su resistencia aumente en 2 puntos y su ataque en 1. apartado f
        this.nivel++;
        this.resistencia+=2;
        this.poder++;
    
    }
    @Override
    public String toString() {
        return "Nombre de la arma: " + this.nombre + ("\n") +
               "Resistencia: " + this.resistencia + ("\n") +
               "Poder:" + this.poder;
    }
  
}
