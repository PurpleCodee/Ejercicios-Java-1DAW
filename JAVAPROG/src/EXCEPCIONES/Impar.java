
package EXCEPCIONES;
public class Impar {
    
    private int numero;
    //constructor

    public Impar(int numero) throws ImparException{ 
        if (numero%2==0) {
            throw new ImparException("El numero introducido no es un numero impar");  
        }
        this.numero = numero;
     
    }
    //metodo toString

    @Override
    public String toString() {
        return "Impar{" + "El numero es=" + this.numero + '}';
    }  
}

