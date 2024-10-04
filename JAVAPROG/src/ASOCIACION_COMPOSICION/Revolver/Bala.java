package ASOCIACION_COMPOSICION.Revolver;

public class Bala {

    //Este ejercicio es de composicion ya que el array de balas se crea en el revolver
    private double calibre;
    private double longitud;

    //metodo constructor
    public Bala(double calibre, double longitud) {
        this.calibre = calibre;
        this.longitud = longitud;
    }

    //sobrecarga constructor
    public Bala() {
        this.calibre = 9;//milimetros
        this.longitud = 40;//milimetro
    }
    //metodo toString nostrar informacion balas
    @Override
    public String toString() {
        return "Bala de calibre " + this.calibre + " mm " + " y " + "longitud " + this.longitud + " mm ";
    }
}
