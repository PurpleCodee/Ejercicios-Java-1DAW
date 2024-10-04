
package COLECCIONES;

import java.util.HashMap;

public class Ejercicio_131 {

    public static void main(String[] args) {
        ARAS_131 diccionario = new ARAS_131();

        // Agregar elementos al diccionario
        diccionario.meter("clave1", "valor1");
        diccionario.meter("clave2", "valor2");
        diccionario.meter("clave3", "valor3");

        // Mostrar el contenido del diccionario
        System.out.println("Contenido del diccionario:");
        diccionario.mostrar();
        System.out.println();

        // Actualizar un valor
        diccionario.actualizar("clave2", "nuevoValor");

        // Mostrar el contenido del diccionario después de la actualización
        System.out.println("Contenido del diccionario después de la actualización:");
        diccionario.mostrar();
        System.out.println();

        // Verificar si una clave existe
        System.out.println("¿Existe la clave 'clave1'?: " + diccionario.existeClave("clave1"));
        System.out.println("¿Existe la clave 'clave4'?: " + diccionario.existeClave("clave4"));
        System.out.println();

        // Verificar si un valor existe
        System.out.println("¿Existe el valor 'valor1'?: " + diccionario.existeValor("valor1"));
        System.out.println("¿Existe el valor 'nuevoValor'?: " + diccionario.existeValor("nuevoValor"));
        System.out.println();

        // Obtener la primera clave asociada a un valor
        System.out.println("Primera clave asociada al valor 'valor3': " + diccionario.primerValor("valor3"));
        System.out.println("Primera clave asociada al valor 'inexistente': " + diccionario.primerValor("inexistente"));
        System.out.println();

        // Borrar un elemento del diccionario
        diccionario.borrar("clave3");

        // Mostrar el contenido del diccionario después de la eliminación
        System.out.println("Contenido del diccionario después de la eliminación:");
        diccionario.mostrar();

    }
    
}
