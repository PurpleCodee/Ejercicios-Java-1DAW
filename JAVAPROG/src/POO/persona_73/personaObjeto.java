
package POO.persona_73;

import POO.persona_73.Persona;


public class personaObjeto {

    
    public static void main(String[] args) {
    Persona Juanjo = new Persona("Juanjo",'M',22,"España");
    Juanjo.mostrarDatos();
    System.out.println(Juanjo.toString());
    boolean res = Juanjo.EsMayorEdad();
    System.out.println(Juanjo.toString());
    String res1 = Juanjo.saludar(2);//le llamo res 1 ya que en el main lo identifica como la misma variable
        System.out.println(res1);

    }
    
}
