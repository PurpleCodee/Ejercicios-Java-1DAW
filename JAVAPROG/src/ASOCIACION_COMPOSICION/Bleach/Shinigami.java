package ASOCIACION_COMPOSICION.Bleach;

public abstract class Shinigami {

    protected String nombre;
    protected String origen;
    protected int edad;
    private Zanpakuto espada;//espada de la clase arma 
    protected double vida;
    protected double poder;

    public Shinigami(String nombre, String origen, int edad, Zanpakuto espada) {
        this.nombre = nombre;
        this.origen = origen;
        this.edad = edad;
        this.espada = espada;
        this.vida = 1500;
        this.poder = (Math.random() * (50 - 5 + 1) + 5);
    }

    public Zanpakuto getEspada() {
        return this.espada;
    }


    //metodos de la clase
    public abstract void invocarBankai();//dependiendo del tipo de shinigami se hara una cosa o otra
    
    public abstract void pelear(Shinigami shinigamiDefensor);
    

    @Override
    public String toString() {
        String res = "";
        res += "Nombre del shinigami: " + this.nombre + " vida: " + this.vida + " poder: " + this.poder;
        res += "Datos de su Zampakuto: " + this.espada.toString();

        return res;
    }

}
