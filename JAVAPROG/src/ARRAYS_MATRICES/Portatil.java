
package ARRAYS_MATRICES;

public class Portatil {
    
    String marca;
    String modelo;
    int ram;
    double disco_duro;
    int bateria;
    boolean apagado;
    //Estos dos últimos son final porque no van a cambiar
    final double tamaño_pantalla;
    final String Sistema_operativo;

    public Portatil(String marca, String modelo, int ram, double disco_duro,
            int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.disco_duro = disco_duro;
        this.bateria = bateria;
        
        /* A estos les pongo los valores porque siempre que cree un objeto, se 
        iniciará con estas características.*/
        this.apagado= true;//está apagado
        this.tamaño_pantalla = 15.3;
        this.Sistema_operativo = "Windows 11";
    }
    
    public void encender(){
        //Si está apagado, puede encenderse
        if(apagado){
            System.out.println(this.marca+", "+this.modelo+", "+
                    this.Sistema_operativo);
            apagado=false;
        }
        //Si no ERROR
        else{
            System.out.println("El portatil ya estaba encendido.");
 
        }
    }
    
    public void apagar(){
        //Si está encendido, puede apagarse
        if(!apagado){
            System.out.println(this.Sistema_operativo+" se está apagando.");
            apagado=true;
        }
        
        // Si no ERROR
        else{
            System.out.println("El portatil ya estaba apagado.");
 
        }
    }
    
    public void aumentarRam(int cantidad){
        //Si quiere aumentar en un número mayor que 0, aumenta
        if(cantidad>0){
            this.ram=this.ram+cantidad;
        }
        //Si no ERROR
        else{
            System.out.println("No se ha podido aumentar la RAM del portatil.");
        }
    }
    
    
    
    
}
