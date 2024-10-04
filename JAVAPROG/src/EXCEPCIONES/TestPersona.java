package EXCEPCIONES;

public class TestPersona {

    public static void main(String[] args) {
        try {
            Persona gatin = new Persona("Nami", -23);
            System.out.println(gatin);

        } catch (Exception e) {
            System.out.println("No se crea nada: " + e.getMessage());
        }

        //cuando salta una exception o se trata o se propaga
        //Este metodo propaga excepciones
    }
}
