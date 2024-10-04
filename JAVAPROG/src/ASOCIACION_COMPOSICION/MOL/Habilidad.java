
package ASOCIACION_COMPOSICION.MOL;
public class Habilidad {
    
    private  String nombreHabilidad;
    double puntosMana;
    private int nivelHabilidad;
    private char teclaHabilidad;
    double basicoDaño;
    //constructor
    public Habilidad(String nombreHabilidad, char teclaHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
        this.teclaHabilidad = teclaHabilidad;
        this.nivelHabilidad = 1;//todas comienzan en nivel 1
        this.puntosMana = (int)(Math.random()*(10-1+1)+1) + (this.nivelHabilidad/2);//aleatorio + la mitad del nivel de habilidad
        this.basicoDaño =  (int)(Math.random()*(20-5+1)+5) + (this.puntosMana/3);// aleatorio entre 5 y 20 más un tercio mana
    }  
    //metodo subida de nivel
    public void subirNivel(){
            this.nivelHabilidad++;
            this.puntosMana = (int)(Math.random()*(10-1+1)+1) + (this.nivelHabilidad/2);      
    }
    //metodo mostrar datos
    @Override
    public String toString() {
        String res = "";
        return res+= "Habilidad: " + "nombreHabilidad " + this.nombreHabilidad + " teclaHabilidad: " + this.teclaHabilidad;
    }   
}
