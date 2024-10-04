package ASOCIACION_COMPOSICION.Bleach;

public class Sustitutos extends Mestizos {

    String zonaAsignada;

    public Sustitutos(String zonaAsignada, double hollow, double quincy, String nombre,
            String origen, int edad, Zanpakuto espada) {
        super(hollow, quincy, nombre, origen, edad, espada);
        this.zonaAsignada = zonaAsignada;

    }

    public void vigilar() {
        System.out.println(this.nombre + " sustituto vigila " + this.zonaAsignada);

    }

    @Override
    public void invocarBankai() {
        Zanpakuto espada = this.getEspada();
        double ataqueEspada = espada.getAtaque() * (hollow / 10);
        double resistenciaEspada = espada.getResistencia() * 2;
        espada.setAtaque(ataqueEspada);
        espada.setResistencia(resistenciaEspada);
        System.out.println(this.nombre + " ha invocado su bankai");
    }

    @Override
    public void pelear(Shinigami shinigamiDefensor) {
        Zanpakuto espada = this.getEspada();
        if (shinigamiDefensor instanceof Sustitutos) {
            
            double vidaPerdida = (espada.getAtaque() - shinigamiDefensor.getEspada().getResistencia());//cuanto se va a restar
            shinigamiDefensor.vida -= vidaPerdida;//restando vida
            Math.abs(shinigamiDefensor.vida);//hace que tranforme el numero negativo a positivo 

        } else if (shinigamiDefensor instanceof Tenientes) {
            espada = this.getEspada();
            double vidaPerdida = (espada.getAtaque() + this.poder) - shinigamiDefensor.getEspada().getResistencia();
            ((Tenientes) shinigamiDefensor).vida -= vidaPerdida;
            Math.abs(shinigamiDefensor.vida);

        } else if (shinigamiDefensor instanceof Capitanes) {
             espada = this.getEspada();
            double vidaPerdida = (espada.getAtaque() - shinigamiDefensor.getEspada().getResistencia());
            ((Capitanes) shinigamiDefensor).vida -= vidaPerdida;
            Math.abs(shinigamiDefensor.vida);
        }
    }

    @Override
    public String toString() {
        String res = " ";
        res += this.nombre + " [ " + " Vida: " + this.vida + ", " + " Poder: " + this.poder + " ] ";
        res += " Shinigami Sustituto " + ", ";
        res += " Datos de su Zampakuto: " + getEspada().toString();
        return res;
    }
}
