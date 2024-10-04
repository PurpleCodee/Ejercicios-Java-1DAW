package ASOCIACION_COMPOSICION.MOL;

public class Personaje {

    protected String nombrePersonaje;
    protected int cordenadasHorizontal;
    protected int cordenadasVertical;
    protected double puntosVida;
    protected double puntosEscudo;
    protected double puntosAtaque;
              boolean muerto;
    //metodo constructor

    public Personaje(String nombrePersonaje, int cordenadasHorizontal,
            int cordenadasVertical, double puntosVida, double puntosEscudo, double puntosAtaque) {
        this.nombrePersonaje = nombrePersonaje;
        this.cordenadasHorizontal = cordenadasHorizontal;
        this.cordenadasVertical = cordenadasVertical;
        this.puntosVida = puntosVida;
        this.puntosEscudo = puntosEscudo;
        this.puntosAtaque = puntosAtaque;
        this.muerto = false;
    }

    public void desplazarse(int x, int y) {//este metodo lo heredan los minions y los campeones
        int x_horizontal = this.cordenadasHorizontal + x;
        int y_vertical = this.cordenadasVertical + y;

        if (x_horizontal > 0 && y_vertical > 0) {
            this.cordenadasHorizontal = x_horizontal;
            this.cordenadasVertical = y_vertical;
        } else {
            this.cordenadasHorizontal = 0;
            this.cordenadasVertical = 0;
        }
    }

    public void atacar() {
        if (this.muerto) {
            System.out.println("El campeon esta muerto");
        } else {
            if (this.puntosVida > 0) {
                this.muerto = true;
            }
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += " Personaje: " + this.nombrePersonaje + ", cordenadasHorizontal: " + this.cordenadasHorizontal + "\n ";
        res += "cordenadasVertical: " + this.cordenadasVertical + ", puntosVida: " + this.puntosVida + "\n ";
        res += "puntosEscudo: " + this.puntosEscudo + ", puntosAtaque: " + this.puntosAtaque;
        return res;
    }

}
