
package HERENCIAS.Ejercicio_Vehiculo;
public class Motocicleta extends Vehiculo {
    protected double velocidad;
    protected double cilindrada;
    //metodo constructor

    public Motocicleta(double velocidad, double cilindrada, String color, int ruedas) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        String res = " ";  
        res+= super.toString() + "\n";
                res+= " Motocicleta \n ";
                res+= " velocidad: " + this.velocidad + ("\n");
                res+= " cilindrada: " + this.cilindrada + ("\n");
                return res;        
    }   
}
