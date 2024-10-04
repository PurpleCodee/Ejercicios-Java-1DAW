
package CADENAS;
public class cadenas_5 {
    public static void main(String[] args) {
        /*Crea un algoritmo que, partiendo de la cadena “LA LLUVIA EN SEVILLA ES UNA MARAVILLA”
          obtenga las cadenas “sevilla es una maravilla” y “la lluvia es
          una maravilla”. Muestra ambas por pantalla.*/
        
        String texto = "LA LLUVIA EN SEVILLA ES UNA MARAVILLA";
        String texto_chiquito = texto.toLowerCase();
        
        String texto_1_mitad = texto_chiquito.substring(10,37);
        String texto_2_mitad = texto_chiquito.substring(0,10) + texto_chiquito.substring(21);
        
        System.out.println(texto_chiquito);
        System.out.println(texto_1_mitad);
        System.out.println(texto_2_mitad);
        
        
    }
    
}
