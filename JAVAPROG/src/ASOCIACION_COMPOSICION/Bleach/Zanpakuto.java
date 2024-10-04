package ASOCIACION_COMPOSICION.Bleach;

public class Zanpakuto {

    private String nombre;
    private double anchura;
    private double altura;
    private boolean estado; //shikai=True bankai=False
    private double ataque;
    private double resistencia;
    private final double newAtaque;
    private final double newResistencia;
    
//constructor
    public Zanpakuto(String nombre, double anchura, double altura) {
        this.nombre = nombre;
        this.anchura = anchura;
        this.altura = altura;
        //propiedades propias
        this.ataque = (Math.random() * (25 - 5 + 1) + 5);
        this.resistencia =(Math.random() * (155 - 70 + 1) + 70);
        this.newAtaque = this.ataque;
        this.newResistencia = this.resistencia;
        this.estado = true;//shikai
    }
    //metodos privados para la clase sustituto

    public double getAtaque() {
        return this.ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }
    

//metodos de la clase
    public void bankai(double multiAtaque, double multiResistencia) {
        this.ataque = multiAtaque*this.ataque;
        this.resistencia = multiResistencia*this.resistencia;
        this.estado = false;//el estado pasa a false que es bankai
    }
    public void shikai(){
        this.ataque = this.newAtaque;
        this.resistencia = this.newResistencia;
        this.estado = true;//el estado pasa a true que es shikai
    }
    @Override
    public String toString() {
        String res = " ";
        res+= this.nombre + " [ "+ " Atq: " + this.ataque + "," + " Res: " +  this.resistencia + " ] " +" Estado: " +  this.estado ;
        return res;        
    }  
}
