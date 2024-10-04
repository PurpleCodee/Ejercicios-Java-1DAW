
package ASOCIACION_COMPOSICION.Instrumentos;
public class NotaMusical {
    String notasValor;
    int duracion;
    
    //metodo constructor
    public NotaMusical(String notasValor, int duracion) {
        this.notasValor = notasValor;
        this.duracion = duracion;
        switch (notasValor) {
            case "Do":
            case "Re":
            case "Mi":
            case "Fa":
            case "Sol":
            case "La":
                this.notasValor=notasValor;
                break;
            default:this.notasValor="Si";       
        }
        this.duracion = duracion;
    }
    

    @Override
    public String toString() {
        String res = "";
        return 
                res+= "[" +this.notasValor +","+ this.duracion + "]";
    }
}
