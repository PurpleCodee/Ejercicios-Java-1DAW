package ASOCIACION_COMPOSICION.MOL;

public class Minion extends Personaje {//heredan de personajes

    String tipo;

    //metodo constructor
    public Minion(String tipo) {
        super("Minion", 0, 0, 0, 0, 0);
        this.tipo = tipo;//todas las propiedades mas su propiedad que es tipo
        this.nombrePersonaje = "Minion";
        this.cordenadasHorizontal = (int)(Math.random()*(1520-400+1)+400);
        this.cordenadasVertical =  (int)(Math.random()*(1520-400+1)+400);
                
        //si los nombres son correctos
        if (tipo.equalsIgnoreCase("Melee") || tipo.equalsIgnoreCase("Mago")
                || tipo.equalsIgnoreCase("Cañon")) {
            this.tipo = tipo;
        } else {
            this.tipo = "Melee";
        }
        if (tipo.equalsIgnoreCase("Melee")) {
            this.puntosVida = 50;
            this.puntosEscudo = 10;
            this.puntosAtaque = 10;  
        }else if (tipo.equalsIgnoreCase("Mago")) {
            this.puntosVida = 12;
            this.puntosEscudo = 40;
            this.puntosAtaque = 30;         
            
        }else if (tipo.equalsIgnoreCase("Cañon")) {
            this.puntosVida = 75;
            this.puntosEscudo = 5;
            this.puntosAtaque = 25;     
        }
    }
}
