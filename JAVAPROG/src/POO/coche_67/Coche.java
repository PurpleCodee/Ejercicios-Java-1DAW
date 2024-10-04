package POO.coche_67;

/*67.- Se desea implementar en JAVA la clase Coche. Cada coche debe tener un color,
una anchura, una altura, un numero de puertas y un numero de ruedas.
a) Programa la clase coche usando un constructor con parámetros. Ten en cuenta
que todo coche tiene 4 ruedas siempre.
b) Implementa el método arrancar() para arrancar el coche. Un coche sólo puede
arrancarse si está parado/apagado. El método mostrará por pantalla si consigue
arrancar el coche o no.
c) Implementa el método parar() para parar/apagar el coche. Un coche sólo puede
pararse si está arrancado. El método mostrará por pantalla si consigue parar el
coche o no.
d) Implementa el método desplazarse() para hacer que el coche se mueva. Un
coche sólo puede moverse si está arrancado. El método mostrará por pantalla si
consigue desplazarse con el coche o no.
e) Añade el atributo de clase gasolina (tipo entero), el cual indicará la cantidad de
gasolina que posee el coche en cada momento (valores entre 0 y 50).
f) Haz que el método arrancar consuma 5 unidades de gasolina y el método
desplazarse, 20 unidades.
g) Crea el método echar gasolina, el cual añadirá tantas unidades de gasolina como
indique su argumento. Recuerda que para echar gasolina debes apagar el coche.
h) Crea el método chequear() el cual devolverá un valor booleano. Verdadero si el
coche tiene gasolina y falso en caso contrario. Además, el coche sólo podrá
arrancar si este método devuelve true.
i) Crea la el método pintar() el cual “pintará” el coche con el color que se le pase
como parámetro.
j) Implementa el método toString() para la clase coche*/

public class Coche {

    String color;
    double altura;
    double anchura;
    int puertas;
    int ruedas;
    boolean arrancar;
    double gasolina;
    

    //Metodo constructor
    public Coche(String color, double altura, double anchura, int puertas) {
        this.color = color;
        this.altura = altura;
        this.anchura = anchura;
        this.puertas = puertas;
        this.ruedas = 4;
        this.arrancar = false;//si es true el coche esta arrancado si es false el coche esta parado
        this.gasolina = 50;//va a ser la gasolina que va a consumir el coche
       
    }

    public void arrancar() {
        if (!this.arrancar) {
            if (this.chequear()){
                System.out.println("Se arranca el coche");
                this.arrancar = true;
                this.gasolina = this.gasolina - 5;
            }else{
                System.out.println("No queda gasolina para arrancar");
            }
            
        } else {
            System.out.println("El coche esta ya arrancado");
        }
        
    }
     public void parar() {
         if(this.arrancar){
            System.out.println("El coche a parado");
            this.arrancar = false;
         }else{
            System.out.println("El coche esta encendido");
         }
    }
    public void desplazarse(){
       if(this.arrancar){
           if (this.gasolina - 20 < 0){
               System.out.println("No queda gasolina para desplazarse");
           }else{
               System.out.println("Se desplaza el coche");
               this.gasolina = this.gasolina - 20;
           }    
        }else{
           System.out.println("El coche esta apagado");
       }
    }
    public void echarGasolina(int gasolina){
        if (!this.arrancar){
            if(this.gasolina == 50){
                System.out.println("La gasolina esta llena");
            }else if(this.gasolina + gasolina >= 50){
                this.gasolina = 50;
            }else{
                this.gasolina += gasolina;
            }
        }else{
            System.out.println("El coche tiene que estar parado para echar gasolina");
        }
    }
    
    public void pintar(String color){
        System.out.println("Coche pintado de color: " + color);
        this.color = color;
    }
    
    public boolean chequear(){
        boolean result;
        if (this.gasolina == 0){
            result = false;
        }else{
            result = true;
        }
        
        return result;
    }

    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", altura=" + altura + ", anchura=" + anchura + ", puertas=" + puertas + ", gasolina=" + gasolina + '}';
    }
    
}
