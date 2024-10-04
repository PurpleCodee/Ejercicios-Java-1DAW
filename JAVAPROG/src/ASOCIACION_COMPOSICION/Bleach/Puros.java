package ASOCIACION_COMPOSICION.Bleach;

public abstract class Puros extends Shinigami {

    int escuadron;

    public Puros(int escuadron, String nombre, String origen, int edad, Zanpakuto espada) {
        super(nombre, origen, edad, espada);

        this.escuadron = escuadron;

        if (this.escuadron > 13 || this.escuadron < 1) {
            this.escuadron = (int) (Math.random() * (13 - 1 + 1) + 1);
        } else {
            this.escuadron = escuadron;//es chic
        }
    }

    public void shunpo() {
        System.out.println(this.nombre + " Se ha desplazado usando shunpo");
    }
    //hereda los metodos de shinigami pero no se ponen porque no se utiliza
}
