
package HERENCIAS.Ejercicio_Vehiculo;
public class Vehiculo {
    protected String color;
    protected int ruedas;
    
    //metodo constructor
    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return " Vehiculo:  \n" +
               " color: " + this.color + ("\n") +
               " ruedas: " + this.ruedas;
    } 
}
