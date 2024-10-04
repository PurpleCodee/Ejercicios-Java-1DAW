package ASOCIACION_COMPOSICION.Bleach;

public abstract class Mestizos extends Shinigami {

    double hollow;
    double quincy;

    public Mestizos(double hollow, double quincy, String nombre, String origen, int edad, Zanpakuto espada) {
        super(nombre, origen, edad, espada);
        this.hollow = (Math.random() * (50 - 10 + 1) + 10);//porcentaje de hollow
        this.quincy = 50 - this.hollow;
    }
    //hereda los metodos de shinigami pero no se ponen porque no se utiliza

}
