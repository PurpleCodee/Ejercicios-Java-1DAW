
package ASOCIACION_COMPOSICION.Cielo_estrellas;

public class test_Cielo_estrella {

    public static void main(String[] args) {
        Cielo miCielo = new Cielo(30, 200);
        miCielo.ponerEstrellas(500);
        System.out.println(miCielo.toString());
   
    }
    
}
