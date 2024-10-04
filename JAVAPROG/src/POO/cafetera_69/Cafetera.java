
package POO.cafetera_69;

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
public class Cafetera {
    int capacidadMaxima;
    int cantidadActual;

//Metodo constructor
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;//son 1000 centilitros
        this.cantidadActual = cantidadActual;//si es 0 la cafetera esta vacia
        
    }
    //Metodo para echar el cafe
    public void echarCafe(int cantidad){//parametro
        if ( cantidad + this.cantidadActual <= this.capacidadMaxima) {//teniendo en cuenta que la cantidad sea menor a la maxima
            this.cantidadActual+=cantidad; //aqui se llena la cafetera con la cantidad que se le introduce
        }
        else{//si la cantidad excede
            System.out.println("Hay demasiado cafe no cabe en la cafetera");
        int sobrante = (cantidad + this.cantidadActual)-this.capacidadMaxima;
        System.out.println("El sobrante de cafe es: "+ sobrante);}//muestro cuanto cafe sobra
   
    }
    //Metodo para llenar la cafetera
    public void llenarCafetera(){
        this.cantidadActual=this.capacidadMaxima;//esta parte estaba perfecta
    }
    //Metodo para vaciar la cafetera de cafe
    public void VaciarCafetera(){
        this.cantidadActual=0;//dejamos la cafetera a 0 vacia
    }
    //Metodo para servir una taza
    public void ServirTaza(int capacidadTaza){
        if (this.cantidadActual >= capacidadTaza) {
            System.out.println("Sirviendo el cafe");
            this.cantidadActual-=capacidadTaza; 
        }
        else{
            System.out.println("No hay suficiente cafe para llenar la taza");
        }
    }
    //Metodo para saber que cantidad de cafe queda en la cafetera
    public int CantidadCafe(){
        System.out.println("A la cafetera le quedan: "+ this.cantidadActual+" centilitros de cafe");
        return this.cantidadActual;
    }
    
    @Override
    public String toString(){
        return "Cafetera ("+"cantidadActual="+cantidadActual+", capacidadMaxima="+ capacidadMaxima+")";
    }
}
