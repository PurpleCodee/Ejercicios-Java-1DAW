
package COLECCIONES.Ejercicio_126;

import java.util.ArrayList;

public class ColaDeSupermercado {
    /*a) EstaVacia: devuelve Verdadero o Falso si la cola está vacía o no.
        b) Entrar: mete una persona en la cola.
        c) Salir: saca de la cola a la persona que le corresponde. Muestra la información
        de esa persona.
        d) Primero: este método devuelve una persona. La persona devuelta será la que
        está primera en la cola. Nota: No muestra nada por pantalla.
        e) Cantidad: devuelve el número de personas que hay en la cola.*/
    private ArrayList<Persona> cola;

    public ColaDeSupermercado() {
        this.cola = new ArrayList<>();
        
    }
    
    /*--------------Devuelve booleano cuando comprueba si esta vacia o llena-----------------*/
    public boolean EstaVacia(){
        return this.cola.isEmpty();//si esta lleva devuelve false
    } 
     /*--------------Aniado una persona a la cola-----------------*/
    public void  Entrar(Persona aniado){
        cola.add(aniado);
    }
      /*--------------Saco de la cola a la persona que corresponde-----------------*/
    public void Salir(){
        cola.remove(cola);
    }
       /*--------------Devuelvo la primera persona de la cola-----------------*/
    public Persona Primero(){
        return cola.get(0);
    }
     /*--------------Devuelvo el numero de personas qu hay en la cola-----------------*/
    public int Cantidad(){
        return cola.size();
    }
}
