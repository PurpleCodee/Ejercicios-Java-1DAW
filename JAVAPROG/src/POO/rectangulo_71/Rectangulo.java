package POO.rectangulo_71;

/*Crea la clase Rectángulo, la cual almacenará la base y la altura. Estos atributos
serán privados y no deben poder accederse desde el exterior. Además, la clase tendrá los
métodos necesarios para calcular el área (base * altura), el perímetro (2*(b+h)) del
rectángulo y un método para representar en texto la clase:*/
public class Rectangulo {

    private double base;//los atributos son privados
    private double altura;
    double resultadoArea = 0;
    double resultadoPerimetro = 0;

    //Metodo constructor con atributos privados
    public Rectangulo(double base, double altura) {//los atributos son privados
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        //Calculo el area de el rectangulo
        
        resultadoArea = (this.base * this.altura);

    }

    //Calculo el perimetro del rectangulo
    public void calcularPerimetro() {
        
        resultadoPerimetro = 2 * (this.base + this.altura);
    }
    //GET Y SET
    public double getAltura(){
    return this.altura;}
    //Con el metodo de mostrar
    
   
    @Override
    public String toString() {
        this.calcularArea();
        this.calcularPerimetro();
        return "Rectangulo con base :" + "( X ) es:" + this.base + ",  y altura: " + " ( Y ) es:" + this.altura + "\n"
                + " Area: " + this.resultadoArea + "\n" + "Perimetro: " + this.resultadoPerimetro;
    }

    

}
