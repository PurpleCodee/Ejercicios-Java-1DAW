
package HERENCIAS.Ejercicio_Vehiculo;
public class Coche extends Vehiculo{//heredada e vehiculo
    protected double velocidad;
    protected int cilindrada;
    
    //metodo constructor

    public Coche(double velocidad, int cilindrada, String color,int ruedas) {
        super(color,ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        String res = " ";
        res += super.toString() + "\n";
        res += "Coche: \n ";
        res += "velocidad: " + this.velocidad + ("\n");
        res += "cilindrada: " + this.cilindrada;
        return res;
    }
    
}
