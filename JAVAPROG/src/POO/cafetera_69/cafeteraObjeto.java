
package POO.cafetera_69;


public class cafeteraObjeto {

/*69.- Crea la clase Cafetera con los atributos capacidadMaxima y cantidadActual.
También se necesitan los siguientes métodos:
• El constructor debe indicar la capacidad máxima en 1000 cc y la capacidad
actual en 0 (cafetera vacía).
• echarCafe: recibe una cantidad de café y lo anota en la capacidad actual. Hay
que controlar que la cantidad recibida no sea mayor que la capacidad máxima (si
es así, la cafetera se llena completamente y se desecha el sobrante)
• llenarCafetera: pone la cafetera a su valor máximo de cantidad.
• VaciarCafetera: tira todo el café de la cafetera.
• servirTaza: recibe un numero que indica la capacidad de la taza y hace que la
cafetera pierda esa cantidad de café. Hay que controlar si la cafetera puede servir
la taza.
• cantidadCafe: muestra cuanto café queda en la cafetera: Queda xxxxxxx cc de
café en la cafetera*/
    
    public static void main(String[] args) {
        Cafetera gusto = new Cafetera(1000,0);
        System.out.println(gusto.toString());
        
       
        gusto.llenarCafetera();
        System.out.println(gusto.toString());
        gusto.echarCafe(50);
        System.out.println(gusto.toString());
        gusto.VaciarCafetera();
        System.out.println(gusto.toString());
        gusto.llenarCafetera();
        System.out.println(gusto.toString());
        gusto.ServirTaza(50);
        System.out.println(gusto.toString());
        int cantidad = gusto.CantidadCafe();
        
        System.out.println("Cantidad: " + cantidad);
        System.out.println(gusto.toString());
   
    }
    
}
