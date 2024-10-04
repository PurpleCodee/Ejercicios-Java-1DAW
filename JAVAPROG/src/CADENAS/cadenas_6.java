package CADENAS;

public class cadenas_6 {

    public static void main(String[] args) {
        /*6. Para la cadena cad = “Volando, volando… siempre arriba”, crear un algoritmo que:
        a) nos indique la posición de la letra ‘d’ en los 7 primeros caracteres de cad.
        b) Igual pero ahora busca la letra ‘d’ en los 7 ultimos*/

        String cad = "Volando, volando... siempre arriba";

        //Extraemos los primero 7 caracteres
        String primeroSiete = cad.substring(0, 7);

        //buscamos la primera posicion de d en los 7 primeros caracters
        int pos1 = primeroSiete.indexOf('d');
        
        //mostrar resustado
        if (pos1 !=-1) {
            System.out.println("La letra 'd' se encuentra en la posicion: " + pos1);    
        }else{
            System.out.println("No se encuentra en los primeros");
        }
        
        //extraemos los ultimos 7 caracteres
        String ultimosSiete = cad.substring(cad.length()-7);
        
        //buscamos la posicion d de los ultimos 7
        
        int pos2 = ultimosSiete.indexOf('d');
        
        //mostramos el resultado
        if (pos2 != -1) {
            System.out.println("La letra 'd' se encuentra en la posicion: " + (cad.length()-7+pos2));
        }else{
             System.out.println("No se encuentra en los ultimos");
        }
    }
}
