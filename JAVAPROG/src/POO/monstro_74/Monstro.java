
package POO.monstro_74;

/*74.- Queremos crear un juego en el que vamos a tener unas criaturas llamadas
“Monstros”. Para ello hay que crear una clase que represente estas criaturas.
De cada Monstro necesitamos guardar su nombre, sus puntos de esfuerzo, sus vidas
totales, sus puntos de hambre y su estado (vivo o muerto). Además, cada Monstro puede
comer, comunicarse, jugar y dormir.
De momento, las reglas que rigen el juego son:
• El constructor sólo necesita el nombre del Monstro.
• Un Monstro empieza con 10 puntos de esfuerzo, 3 puntos de hambre, 7 vidas y,
obviamente, VIVO.
• Los valores de esfuerzo, hambre y vidas no pueden superar los valores iniciales.
• Al jugar gasta 3 puntos de esfuerzo y 1 de hambre.
• Al comunicarse gasta 1 punto de esfuerzo.
• Si come, gasta dos puntos de esfuerzo y gana dos de hambre. Pero si además
come su comida favorita, ganará 3 puntos de hambre.
• Al dormir gana 5 puntos de esfuerzo.
• Si los puntos de esfuerzo o de hambre llegan a cero, el Monstro perderá una vida
y volverá a vivir con los valores por defecto.
• Si el Monstro pierde todas las vidas, muere, todos sus atributos tomarán el valor
-1 y no podrá realizar ninguna acción .*/
public class Monstro {
    String nombre;
    int puntosEsfuerzo;
    int puntosHambre;
    int vidas;
    boolean murido;

    public Monstro(String nombre) {
        this.nombre = nombre;
        this.puntosEsfuerzo = 10;
        this.puntosHambre = 3;
        this.vidas = 7;// solo tiene 7 vidas
        this.murido = false;//si es true esta vivo 
    }
     public void chequearEstado() {
        if (!murido) {
            if (this.puntosEsfuerzo <= 0 || this.puntosHambre <= 0) {
                this.vidas--;//PIERDE VIDA
                this.puntosEsfuerzo = 10;
                this.puntosHambre = 3;

                if (this.vidas <= 0) {
                    this.murido = true;
                    this.puntosEsfuerzo = -1;
                    this.puntosHambre = -1;
                    this.vidas = -1;
                }
            }
        }
    }

   public void jugar(){
       if (!murido){
           this.puntosEsfuerzo-=3;
           this.puntosHambre-=1;
           
       }
       chequearEstado();
}
   public void comunicarse(){
       if (!murido){
           this.puntosEsfuerzo-=1;
           
       }
        chequearEstado();  
}
   
   public void comer(){
       if (!murido){
           this.puntosEsfuerzo-=2;
           this.puntosHambre+=2;
           //falta comida favorita
           
       }
        chequearEstado();

      
}
   public void dormir(){
       if (!murido){
           this.puntosEsfuerzo+=5;
           
       }
        chequearEstado();
}

    @Override
    public String toString() {
        return "Monstro{" + "nombre=" + nombre + ", puntosEsfuerzo=" + puntosEsfuerzo + ", puntosHambre=" + puntosHambre + ", vidas=" + vidas + ", murido=" + murido + '}';
    }
   
    
    
    
}
