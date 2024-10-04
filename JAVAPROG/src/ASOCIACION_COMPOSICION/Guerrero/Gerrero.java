
package ASOCIACION_COMPOSICION.Guerrero;

import java.time.chrono.ThaiBuddhistEra;

public class Gerrero {//atributos privados del gerrero a crear
    private String nombre;
    private int salud;
    private int ataque;
    private int escudo;
    private int salud_actual;
    private boolean muerto;
    private Arma arma;
    private int nivel;
    private int experienciaActual;
    private double siguienteNivel;

    //metodo constructor

    public Gerrero(String nombre, int salud, int ataque, int escudo, Arma arma) {
        this.nombre = nombre;//nombre del guerrero/a.
        this.salud = salud;//un número que indica la salud máxima del guerrero.
        this.ataque = ataque;//número que indica su fuerza de ataque.
        this.escudo = escudo;//número que indica su resistencia a los golpes.
        this.salud_actual = this.salud;//salud actual cuando se crea un gerrero su salud actual coincide con su salud maxima
        this.muerto = false;//añado propiedad muerto si esta muerto no puede hacer nada no puede atacar
        
        //apartado H
        this.nivel = 1;
        this.experienciaActual = 0;
        this.siguienteNivel = Math.ceil(this.nivel*10+this.nivel*1.5);
        
        
        
        //creo mi arma
        this.arma = arma;
        
    }
    /*La única acción que puede hacer nuestro guerrero es atacar. Dicha acción devuelve la
    fuerza del ataque del guerrero. Define también el método toString()*/
    
    /*C.Modifica la clase guerrero para que ahora todo guerrero tenga un arma (el arma
    debe existir previamente) y mejora el método atacar para que también tenga
    en cuenta el poder del arma.*/
    
    /*D.Mejora el método atacar del apartado anterior para que reciba como
    argumento a otro guerrero que ya exista (será el guerrero que defiende). Ahora,
    atacar debe quitar al guerrero que defiende una cantidad de salud igual al ataque
    total del guerrero que ataca menos el escudo del guerrero que defiende. Además
    debe verificar si el guerrero que defiende queda vivo o muerto tras el ataque.*/
    
    /*E. Mejora el método atacar para que cada vez que un guerrero ataque, su arma
    pierda un punto de resistencia. Si un arma se queda sin resistencia no se podrá
    atacar con ella (no se tomará en cuenta su poder al atacar).*/
    
    //F. EN EL ARMA
    
    /*G.ABAJO.*/
    
    /*H. ARRIBA*/
   
    /*I. Crea el método subir, el cual devuelve True si el guerrero puede subir de nivel
    o False en caso contrario. Un guerrero subirá de nivel si sus puntos de
    experiencia actuales coinciden con el valor de siguienteNivel.*/
    
    /*J.ABAJO*/

    /*K. Modifica el método atacar para que cada vez que el guerrero ataque, el guerrero
    gane 3 puntos de experiencia si usa un arma, o 5 si no usa arma o está rota.
    Además hay que comprobar si el guerrero sube de nivel tras el ataque realizado.*/

   
    
    /*Metodo para atacar del gerrero devuelve la fuerza del ataque del guerrero.*/
    public void atacar(Gerrero guerrero_defiende){
        
        if (muerto) {
            System.out.println("El guerrero esta muerto");    
        }else{
            if (this.arma.getResistencia()>0) {
                int ataqueTotal = this.ataque+this.arma.getPoder();//variable de ataque total y poder del arma
                guerrero_defiende.salud_actual-=ataqueTotal-guerrero_defiende.escudo;
                //quito resistencia de arma
                int quitarResistencia = this.arma.getResistencia();
                //dentro del set le restablezco una nueva resistencia
                this.arma.setResistencia(quitarResistencia-1);  
            } 
        } 
    }
    //Además debe verificar si el guerrero que defiende queda vivo o muerto tras el ataque.
    public void comprobarMuerte(){
        if (this.salud_actual<0) {
            this.muerto = true; 
            System.out.println(this.nombre +" Esta morido");//mensaje prueba
        }else{
            System.out.println(this.nombre + " Sigue vivito");
        } 
    }
    //apartado G recive el nombre del arma a mejorar si el nombre coincide con el arma
    //del guerrero el arma sube de nivel
    public void mejorarArma(Arma arma){
        if (this.arma.getNombre().equals(arma.getNombre())) {
            this.arma.subirNivelArma();     
        }
    }
    
    //Apartado i si los puntos de experincia actuales coinciden con la subida de nivel
    public boolean subir(){
        return this.experienciaActual==this.salud_actual;
    }
    
    /*J. Implementa el método subidaNivel en el guerrero, el cual aumentará en 1 el
    nivel del guerrero, pondrá la experienciaActual a 0, volverá a calcular
    siguienteNivel, sumará 1 punto al ataque y al escudo del guerrero y 10
    puntos a su salud máxima*/
    public void subirNivel(){
        if (this.subir()) {
            this.nivel+=1;
            this.experienciaActual = 0;
            this.ataque+=1;
            this.escudo+=1;
            this.salud+=10;    
        }else{
            System.out.println("No puede subir el nivel");
        
        }
    }
 
    //Metodo toString mostrar los datos mi guerrero
    @Override
    public String toString() {
        return "Gerrero :"+ this.nombre + ("\n") +
                "Salud maxima: " + this.salud +("\n") +
                "Ataque:" + this.ataque +("\n") +
                "Escudo: " + this.escudo +("\n");
    }
    
    
    
}
