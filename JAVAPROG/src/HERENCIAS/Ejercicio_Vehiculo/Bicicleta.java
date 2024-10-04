package HERENCIAS.Ejercicio_Vehiculo;

public class Bicicleta extends Vehiculo {

    protected boolean tipo;
    //metodo constructor

    public Bicicleta(boolean tipo, String color, int ruedas) {
        super(color, ruedas);
        this.tipo = tipo; //false urbana true deportiva
    }
    public void tocarTimbre(){
        System.out.println("Rin rin");
        
    }

    @Override
    public String toString() {
        String res = " ";
        res += super.toString() + "\n";
        res += "Bicicleta: \n ";
        res += "tipo: " + this.tipo + ("\n");
        return res;
    }

}
