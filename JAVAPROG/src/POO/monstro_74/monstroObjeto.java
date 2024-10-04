
package POO.monstro_74;

import POO.monstro_74.Monstro;


public class monstroObjeto {

    
    public static void main(String[] args) {
        Monstro cacas = new Monstro("Nami");
        System.out.println(cacas.toString());
        cacas.jugar();
        System.out.println(cacas.toString());
        cacas.comunicarse();
        System.out.println(cacas.toString());
        cacas.comer();
        System.out.println(cacas.toString());
        cacas.dormir();
        System.out.println(cacas.toString());
        
    }
    
}
