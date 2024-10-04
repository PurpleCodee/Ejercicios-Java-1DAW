package ASOCIACION_COMPOSICION.Bleach;

public class Tenientes extends Puros {

    public Tenientes(int escuadron, String nombre, String origen,
            int edad, Zanpakuto espada) {
        super(escuadron, nombre, origen, edad, espada);
    }
    
    @Override
    public void invocarBankai() {
        System.out.println(this.nombre + "No puede invocar su bankai");

    }

    @Override
    public void pelear(Shinigami shinigamiDefensor) {
        Zanpakuto espada = getEspada();
        if (shinigamiDefensor instanceof Tenientes) {
            double vidaPerdida = espada.getAtaque() - shinigamiDefensor.getEspada().getResistencia();
            shinigamiDefensor.vida = vidaPerdida;
            Math.abs(shinigamiDefensor.vida);

        } else if (shinigamiDefensor instanceof Capitanes || shinigamiDefensor instanceof Sustitutos ) {
            espada = getEspada();
            double vidaPerdida = (espada.getAtaque() - shinigamiDefensor.getEspada().getResistencia()) + poder;
            shinigamiDefensor.vida = vidaPerdida;
            Math.abs(shinigamiDefensor.vida);
        } 
    }

    @Override
    public String toString() {
        String res = " ";
        res += this.nombre + " [ " + " Vida: " + this.vida + ", " + " Poder: " + this.poder + " ] ";
        res += " Teniente del " + this.escuadron + " escuadron ";
        res += "Datos de su Zampakuto: " + getEspada().toString();
        return res;
    }
}
