package EXCEPCIONES;

public class Persona {

    String nombre;
    int edad;

    public Persona(String name, int age) {
        this.nombre = nombre;
        this.edad = edad;

        if (age < 0) {
            //propaga excepcion con el throw
            throw new ArithmeticException("Edad incorrecta");
        }

        this.edad = age;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

}
