package HERENCIAS.Ejercicio_Vehiculo;

public class Furgoneta extends Vehiculo {

    protected double kilos;
    //metodo constructor

    public Furgoneta(double kilos, String color, int ruedas) {
        super(color, ruedas);
        this.kilos = kilos;
    }

    @Override
    public String toString() {
        String res = " ";
        res += super.toString() + "\n";
        res += "Furgoneta: \n ";
        res += "kilos:" + this.kilos + "\n";
        return res;
    }

}
