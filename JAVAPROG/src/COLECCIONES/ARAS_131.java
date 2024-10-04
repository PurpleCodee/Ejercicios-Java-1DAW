package COLECCIONES;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class ARAS_131 {

    private HashMap<String, String> diccionario;

    public ARAS_131() {

        //constructor de mi coleccion mapa
        diccionario = new HashMap<>();

    }

    public void borrar(String clave) {//BORRO LA CLAVE

        diccionario.remove(clave);

    }

    public void meter(String clave, String valor) {

        if (diccionario.containsKey(clave)) {

            System.out.println("La clave que intentas introducir ya existe");

        } else {
            //si no la contiene la mete
            diccionario.put(clave, valor);

        }

    }

    public void actualizar(String clave, String newValor) {
        if (diccionario.containsKey(clave)) {

            diccionario.put(clave, newValor);

        } else {
            System.out.println("La clave no existe");

        }

    }

    public boolean existeClave(String clave) {//devuelve un booleano

        return diccionario.containsKey(clave);//el contains devuelve un booleano

    }

    public boolean existeValor(String valor) {//devuelve un booleano

        return diccionario.containsValue(valor);

    }

    public String primerValor(String valor) {
        for (HashMap.Entry<String, String> entrada : diccionario.entrySet()) {
            if (entrada.getValue().equals(valor)) {
                return entrada.getKey();

            }

        }
        return "undefined";

    }

    public void mostrar() {

        if (diccionario == null || diccionario.isEmpty()) {
            System.out.println("El diccionario esta vacio");

        } else {
            for (HashMap.Entry<String, String> datos : diccionario.entrySet()) {
                String clave = datos.getKey();
                String valor = datos.getValue();
                System.out.println("Clave: " + clave + " " + "Valor: " + valor + "\n");
            }
        }
    }
}
