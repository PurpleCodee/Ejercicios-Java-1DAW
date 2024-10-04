package POO.pila_80;

/*80.- Una pila es una estructura informática que sirve para almacenar/recuperar datos y
cuyo funcionamiento se basa en que el primer elemento que se almacena, es el último en
poder obtenerse.

No puedo “sacar” un elemento si no se han extraído los que tiene encima. Es decir, si no
está en la cima de la pila.

El objetivo de este ejercicio es crear una clase que imite el funcionamiento de la
estructura tipo Pila de números. Para ello la clase va a tener estas propiedades:

1. Un array de números enteros que usaremos para almacenar los elementos.

2. Un número encargado de indicarnos cual el índice del array que hace de cima de
la pila.

El constructor sólo debe tener como argumento el tamaño que va a tener la pila.
Además, cuando se crea la pila por primera vez, esta debe estar vacía.

Los métodos que debe tener la clase son:

insertar(int elemento): si se puede, añade el elemento a la pila. Sino,
informa de que no ha podido.

cima(): devuelve el elemento que está en la cima (pero no lo elimina).

extraer(): devuelve el elemento que está en la cima y lo saca de la pila (lo elimina).

vacia(): devuelve un booleano indicando si la pila está vacía o no.

llena(): devuelve un booleano indicando si la pila está llena o no.

toString(): representa la pila en su estado actual*/
public class Pila {

    private int[] pila;
    private int posCima;

    //metodo contrustor
    public Pila(int tamaño) {
        pila = new int[tamaño];
        for (int i = 0; i < this.pila.length; i++) {
            this.pila[i] = 0;
        }
        this.posCima = tamaño - 1;
    }
    
    public void insertar(int elemento){
        if (this.posCima == 0){
            System.out.println("La pila esta llena");
        }else if (this.pila[posCima] == 0){
            this.pila[this.posCima] = elemento;
        }else{
            this.posCima--;
            this.pila[this.posCima] = elemento;
        }
    }

    public int cima() {
        return this.pila[this.posCima];

    }

    public int extraer() {
        int elemento = -1;
        if (this.pila[posCima] == 0){
            System.out.println("La pila esta vacia");
        }else{
            elemento = this.pila[this.posCima];

            this.pila[this.posCima] = 0;

            this.posCima++;            
        }
        return elemento;
    }

    public boolean vacia() {
        boolean vacia = true;
        if (this.pila[posCima] == 0) {
            vacia = true;

        } else {
            vacia = false;

        }
        return vacia;
        
    }

    public boolean llena() {
        return this.posCima == 0;
    }

    @Override
    public String toString() {
        String elementos = "";
        for (int i = 0; i < this.pila.length; i++) {
            if (i == this.pila.length - 1) {
                elementos += this.pila[i];
            } else {
                elementos += this.pila[i] + ", ";
            }
        }
        return "El array de caracteres:\n" + "Pila: " + elementos + "\n"
                + "La posicion de la cima: " + this.posCima;
    }
}
