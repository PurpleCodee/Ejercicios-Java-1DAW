
package ASOCIACION_COMPOSICION.Bleach;
public class Capitanes extends Puros{

    public Capitanes(int escuadron, String nombre, String origen, 
            int edad, Zanpakuto espada) {
        super(escuadron, nombre, origen, edad, espada);
    }
    
    @Override
    public void invocarBankai(){
        Zanpakuto espada = this.getEspada();
        double ataqueEspada = espada.getAtaque()*(this.escuadron*1.5);
        double resistenciaEspada = espada.getResistencia()*1.5;
        System.out.println(this.nombre + " ha invocado su bankai ");
        getEspada().setAtaque(ataqueEspada);
        getEspada().setResistencia(resistenciaEspada);
 
    }
    
    @Override
    public void pelear(Shinigami shinigamiDefensor){
         Zanpakuto espada = this.getEspada();
        if (shinigamiDefensor instanceof Capitanes) {
            
            double vidaPerdida = (espada.getAtaque() - shinigamiDefensor.getEspada().getResistencia());//cuanto se va a restar
            shinigamiDefensor.vida -= vidaPerdida;//restando vida
            Math.abs(shinigamiDefensor.vida);//hace que tranforme el numero negativo a positivo 

        } else if (shinigamiDefensor instanceof Tenientes) {
            espada = this.getEspada();
            double vidaPerdida = (espada.getAtaque() + this.poder) - shinigamiDefensor.getEspada().getResistencia();
            ((Tenientes) shinigamiDefensor).vida -= vidaPerdida;
            Math.abs(shinigamiDefensor.vida);

        } else if (shinigamiDefensor instanceof Sustitutos) {
             espada = this.getEspada();
            double vidaPerdida = (espada.getAtaque() - shinigamiDefensor.getEspada().getResistencia());
            ((Sustitutos) shinigamiDefensor).vida -= vidaPerdida;
            Math.abs(shinigamiDefensor.vida);
        }
    }

    @Override
    public String toString() {
        String res = " ";
        res+= this.nombre + " [ " + " Vida: " + this.vida + ", " + " Poder: " + this.poder + " ] ";
        res+=" Capitan del " + this.escuadron + " escuadron ";
        res+=  "Datos de su Zampakuto: " + getEspada().toString();
        return res;   
    }   
}
