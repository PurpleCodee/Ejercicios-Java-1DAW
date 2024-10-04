
package ASOCIACION_COMPOSICION.Guerrero;
/*a) Implementa ambas clases y crea un par de objetos de cada una de ellas.*/
public class ejercicio_gerrero {

    public static void main(String[] args) {
        
        Arma espada = new Arma("Emma",500, 800);//nombre,resistencia,poder
        Arma cuernos = new Arma("Coramenta",200, 300);//nombre,resistencia,poder
        Gerrero yakuza = new Gerrero("Zoro", 100, 1000, 500, espada);//nombre,salud,ataque,escudo
        Gerrero yenito = new Gerrero("Chopper", 500, 800, 1000, cuernos);//nombre,salud,ataque,escudo
        
        yakuza.atacar(yenito);
        yakuza.comprobarMuerte();
        
    }
    
}
