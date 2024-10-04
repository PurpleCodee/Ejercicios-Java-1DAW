package COLECCIONES.Ejercicio_126;//127

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Agenda {

    private ArrayList<Persona> cola;

    public Agenda() {
        this.cola = new ArrayList<Persona>();

    }

    /*---------------Metodo para aniadir una persona--------------*/
    public void AniadirPersona(Persona nueva) {
        cola.add(nueva);

    }

    /*---------------Metodo para borrar una persona--------------*/
    public boolean BorrarPersona(String DNI) {
        boolean encontrado = false;
        int i = 0;
        while (i < cola.size() && !encontrado) {
            Persona personitaBorrar = cola.get(i);
            if (personitaBorrar.getDni().equals(DNI)) {
                cola.remove(i);
                encontrado = true;
             // No incrementamos i si encontramos y eliminamos la persona,
            // porque los elementos subsiguientes se desplazan hacia arriba.
            } else {
             // Solo incrementamos i si no se elimina ningún elemento,
            // para seguir avanzando a través de la lista
                i++;
            }
        }
        return encontrado;
    }
    /*---------------Metodo para buscar una persona--------------*/
    public void EncontrarPersona(String DNI){
        boolean encontrado = false;
        int i = 0;
        while (i < cola.size() && !encontrado){
            if (DNI.equals(cola.get(i).getDni())) {
                System.out.println("Datos de la persona: \n" + cola.get(i).toString());
                encontrado = true;
            }
            
            i++;
        }
        
        if (encontrado == false){
            System.out.println("La persona el DNI indicado no existe");
        }
            
    }
    /*---------------Metodo para Mostrar agenda--------------*/
    public String  MostrarAgenda (){
        String res = "";
        for (int i = 0; i < cola.size(); i++) {
            Persona personitaMostrar = cola.get(i);
            System.out.println(personitaMostrar.toString());
            
        }
        return res;
    }
    /*---------------Metodo para Ordenar agenda--------------*/
    public void  OrdenarAgenda(){
        Collections.sort(this.cola, (Persona p1, Persona p2) -> p1.getApellido().compareTo(p2.getApellido()));
    }
    /*El metodo collrctions sort me ordena lo que yo quiera*/
    
}
