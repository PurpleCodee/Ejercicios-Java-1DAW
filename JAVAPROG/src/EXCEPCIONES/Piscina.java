package EXCEPCIONES;

public class Piscina {

    public final int MAXNIVEL;
    private int nivel;

    public Piscina(int tope) {
        if (tope < 0) {
            tope = 0;
        }
        this.MAXNIVEL = tope;
        this.nivel = 0;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void quitarAgua(int cantidad) throws PiscinitaException {
        if (this.nivel - cantidad < 0) {
            throw new PiscinitaException("WaterInThePoolException poquita agua");
        }
        this.nivel -= cantidad;
        System.out.println(this.nivel);

    }

    public void ponerAgua(int cantidad) throws PiscinitaException {
        if (this.nivel + cantidad > MAXNIVEL) {
            throw new PiscinitaException("WaterInThePoolException muchita agua");
        }
        this.nivel += cantidad;
        System.out.println(this.nivel);
    }
}
