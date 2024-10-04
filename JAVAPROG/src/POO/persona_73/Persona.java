package POO.persona_73;

/*73.- Crea la clase Persona con los siguientes datos: Una persona debe tener nombre
(cadena), edad (entero mayor a 0), sexo (‘M’ o ‘F’) y país (España, Bulgaria, Colombia
o Venezuela).
Además tendrá dos métodos:
• saludar: el cual debe devolver (que no mostrar) un saludo de la forma:
“Hola! Me llamo nombre y soy de pais”
• mostrarDatos(): muestra por pantalla de forma ordenada los datos de la
persona.
• EsMayorEdad(): devuelve un booleano que indica si la persona es mayor de
edad o no.
• toString(): método para devolver la información de una persona.
b) Mejora el método saludar para que reciba un número entero entre 1 y 3 como
parámetro. Dicho número indica el saludo que se debe realizar. Es decir, ahora el
método tendrá tres saludos distintos y el parámetro de entrada decidirá cual devuelve.*/
public class Persona {

    String nombre;
    int edad;
    char sexo;
    String pais;
    boolean esPersona;

    //Metodo constructor
    public Persona(String nombre, char sexo, int edad, String pais) {
        if(edad >= 0 && (sexo == 'M' || sexo == 'F') && (pais.toLowerCase().equals("españa") 
        || pais.toLowerCase().equals("bulgaria") || pais.toLowerCase().equals("colombia") ||
                                            pais.toLowerCase().equals("venezuela"))){
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
            this.pais = pais;
            esPersona = true;
        }else{
            esPersona = false;
            System.out.println("Alguno de los datos no son correctos, vuelve a crear la persona");
        }
        
    }

    public String saludar(int saludo) {
        String res = "";
        if(this.esPersona){
            switch (saludo) {
                case 1:
                    res = "Que pasa maricon";
                    break;
                case 2:
                    res = "Que pasa pichilla";
                    break;
                case 3:
                    res = "Que pasa chochillo";
                    break;
                default:
                    res = "Este tipo de saludo no existe";
            }
        }
        return res;
    }

    public void mostrarDatos() {
        if(this.esPersona){
            System.out.println("Los datos de la persona creada son: ");
            System.out.println("Su nombre es: " + this.nombre + ", tiene: " + this.edad + " años, " + " su sexo es: " + this.sexo + ", pais: " + this.pais);
        }
    }

    public boolean EsMayorEdad() {
        boolean res = false;
        if (this.esPersona){
            if (this.edad < 18) {
                System.out.println(this.nombre + " es menor de edad");
            }else{
                System.out.println(this.nombre + " es mayor de edad");
                res = true;
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        if(this.esPersona){
            res = "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", pais=" + pais + '}';
        }
        
        return res;
    }
    

}
