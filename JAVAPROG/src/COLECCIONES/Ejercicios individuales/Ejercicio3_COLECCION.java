package COLECCIONES;

import java.util.HashSet;

public class Ejercicio3_COLECCION {
    /*3.- Dado un conjunto de NOMBRES de estudiantes que aprobaron Matemáticas y un conjunto de
    NOMBRES de estudiantes que aprobaron Física, realiza las siguientes operaciones:

    • Encuentra el conjunto de estudiantes que aprobaron tanto Matemáticas como Física.
    • Encuentra el conjunto de estudiantes que aprobaron solo Matemáticas.
    • Encuentra el conjunto de estudiantes que aprobaron solo Física.
    • Encuentra el conjunto de estudiantes que aprobaron Matemáticas pero no Física.
    • Encuentra el conjunto de estudiantes que aprobaron Física pero no Matemáticas.*/

    public static void main(String[] args) {
        /*------------------Conjuntos de aprobados--------------------*/
        HashSet<String> NombresMates = new HashSet<>();
        HashSet<String> NombresFisica = new HashSet<>();
        
        /*-------------Añado los estudiantes aprobados Fisica---------------*/
        NombresFisica.add("Estela");
        NombresFisica.add("Luis");
        NombresFisica.add("Sofia");
        NombresFisica.add("Emilio");
        /*-------------Añado los estudiantes aprobados Matematicas-----------------*/
        NombresMates.add("Estela");
        NombresMates.add("Luis");
        NombresMates.add("Sofia");
        NombresMates.add("Mateo");
         /*-------------Ambos que han aprobado-----------------*/
        HashSet<String> ambas = new HashSet<>(NombresFisica);
        System.out.println("Los que han aprobado Ambas Mates y fisica");
        ambas.retainAll(NombresMates);//me saca de la lista los repetidos 
        System.out.println(ambas);
        /*-------------------Aprobado solo matematicas--------------*/
        
        HashSet<String> soloMates = new HashSet<>(NombresMates);
        soloMates.removeAll(NombresFisica);
        System.out.println("Los que han aprobado matematicas: " + soloMates);
        
          /*-------------------Aprobado solo fisica--------------*/
          HashSet<String> soloFisica = new HashSet<>(NombresFisica);
          soloFisica.retainAll(NombresMates);
          System.out.println("Los que han aprobado fisica: " + soloFisica);



        

    }

}
