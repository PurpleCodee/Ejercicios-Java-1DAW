package COLECCIONES;

import java.util.ArrayList;
import java.util.HashSet;

/*1.-Escribe un programa en Java que tome una lista de números enteros (con numeros repetidos)
y elimine los elementos duplicados, utilizando conjuntos. Luego, imprime la 
lista resultante sin duplicados, usando conjuntos.*/
public class Ejercicio1_COLECCIONES {

    public static void main(String[] args) {
        /*--------------Lista de numeros enteros-----------------*/
        ArrayList<Integer> listita = new ArrayList<>();

        /*---------------Relleno lista----------------*/
        for (int i = 0; i < 5; i++) {
            listita.add(i);
            listita.add(i + 1);
        }
        /*--------------Metes la bolsita de enteros en una lista-----------------*/
        HashSet<Integer> bolsitaEnteros = new HashSet<>(listita);
  
        listita.clear();
        listita.addAll(bolsitaEnteros);
      
        System.out.println("Lista de numeros: " + listita);
    }

}
