package COLECCIONES.Ejercicio_126;

import java.util.Objects;

public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private double peso;

    //1º constructor con todos los atributos
    public Persona(String dni, String nombre, String apellido,String sexo, int edad, double peso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }
    //2º constructor con solo sexo,edad,peso
    public Persona(String dni) {
        this.dni = dni;
        this.nombre = " ";
        this.apellido = " ";
        this.sexo = " ";
        this.edad = 0;
        this.peso = 0;
    }
    //metodo get y set

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //metodo equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.sexo, other.sexo);
    }
    //metodo toString

    @Override
    public String toString() {
        String res = "";
        res+=" Persona " + "\n";
        res+=" dni: " + this.dni + "\n";
        res+=" nombre: " + this.nombre + "\n";
        res+=" apellido: " + this.apellido + "\n";
        res+=" sexo: " + this.sexo + "\n";
        res+=" edad: " + this.edad + "\n";
        res+=" peso: " + this.edad +  "\n";
        return res;
                
    }
}
