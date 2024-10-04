
package POO.urna_77;

/*77.- El objetivo de este ejercicio es crear la clase Urna cuyos objetos pueden contener
bolas blancas y bolas negras y, además, nos va a permitir realizar operaciones básicas
sobre ellas. Posteriormente crearemos un test para ver si la clase funciona
correctamente.
• La clase tendrá un par de variables de instancia privadas en las que se
almacenará el número de bolas de cada color.
• También tendrá un constructor que permita crear instancias de la clase con un
número inicial de bolas blancas y negras pasadas como parámetros.
• Además incluirá métodos para:
◦ Consultar el número total de bolas.
◦ Extraer una bola y saber su color. El color vendrá dado simplemente por un
carácter ‘n’ o ‘b’. Para extraer una bola aleatoriamente se suma el número de
bolas blancas y negras y se toma un número aleatorio entre 1 y esa suma. Si
ese número es menor o igual que el número de bolas blancas, suponemos que
la bola que sale es blanca. En otro caso, suponemos que la bola es negra.
◦ Introducir una bola de un color determinado.


A continuación, hay que crear el archivo TestUrna.java e implementar el test de la
siguiente forma:
• Debe crear una urna con un número de bolas blancas y negras aleatorias (entre 1
y 10).
• Mientras quede más de una bola en la urna, se sacan dos bolas:
◦ Si ambas son del mismo color, se mete una bola blanca en la urna.
◦ Si son de diferente color, metemos una bola negra.
• Por último, cuando quede una sola bola, se saca y se indica su color,
Hay que analizar si, partiendo del número de bolas iniciales, la última bola que indica el
test es correcta. Para ello recomiendo implementar un modo verbose, es decir, un modo
que vaya indicando qué va pasando.*/
public class Urna {
    //variables privadas las llamo con el get almaceno las bolas de cada color en ellas
    private int bolas_negras;
    private int bolas_blancas;
    
    //Metodo constructor

    public Urna(int bolas_negras, int bolas_blancas) {//el numero de bolas se pasan por parametros
        this.bolas_negras = bolas_negras;
        this.bolas_blancas = bolas_blancas;
        System.out.println("Urna creada con " + this.bolas_negras + " bolas negras " + " y " + this.bolas_blancas + " bolas blancas ");
    }

    public int getBolas_negras() {
        return this.bolas_negras;
    }

    public int getBolas_blancas() {
        return this.bolas_blancas;
    }
    
    //Metodo consultar numero bolas totales
    
    public String bolasTotales(){//consulto el numero de bolas
        String totalBolas ="Quedan " + (this.bolas_blancas+this.bolas_negras) + " bolas en la urna\n " + this.bolas_blancas + " blancas y " + this.bolas_negras + " negras ";
        
        return totalBolas;
    }
    
    //Metodo extraer bola y saber su color
    
    public char extraerBolas(){
        int max = this.bolas_blancas + this.bolas_negras;//la suma
        int min = 1;
        char res = 'a'; //devuelve un caracter
        int aleatorio = (int)(Math.random() * (max - min + 1) + min);
        
        if (aleatorio <= this.bolas_blancas) {
            //color de las bolas los almaceno en un char
            res = 'b'; //sale una bola blanca
            this.bolas_blancas--;//por lo que resto una bola
            
        }
        else{
            res = 'n';//si el numero aleatorio es mayor sale una bolsa negra
            this.bolas_negras--;
        }
        
        return res;
        
    }
    
    //Metodo para introducir bola de color determinado
    
    public void introducirBolaNegra(){
        this.bolas_negras++;
   
      
    }
   
    public void introducirBolaBlanca(){
        this.bolas_blancas++;

    }

    @Override
    public String toString() {
        return bolasTotales();
       
    }
}
