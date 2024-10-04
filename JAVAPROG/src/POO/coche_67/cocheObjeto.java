
package POO.coche_67;

import POO.coche_67.Coche;



public class cocheObjeto {
/*67.- Se desea implementar en JAVA la clase Coche. Cada coche debe tener un color,
una anchura, una altura, un numero de puertas y un numero de ruedas.
a) Programa la clase coche usando un constructor con parámetros. Ten en cuenta
que todo coche tiene 4 ruedas siempre.
b) Implementa el método arrancar() para arrancar el coche. Un coche sólo puede
arrancarse si está parado/apagado. El método mostrará por pantalla si consigue
arrancar el coche o no.
c) Implementa el método parar() para parar/apagar el coche. Un coche sólo puede
pararse si está arrancado. El método mostrará por pantalla si consigue parar el
coche o no.
d) Implementa el método desplazarse() para hacer que el coche se mueva. Un
coche sólo puede moverse si está arrancado. El método mostrará por pantalla si
consigue desplazarse con el coche o no.
e) Añade el atributo de clase gasolina (tipo entero), el cual indicará la cantidad de
gasolina que posee el coche en cada momento (valores entre 0 y 50).
f) Haz que el método arrancar consuma 5 unidades de gasolina y el método
desplazarse, 20 unidades.
g) Crea el método echar gasolina, el cual añadirá tantas unidades de gasolina como
indique su argumento. Recuerda que para echar gasolina debes apagar el coche.
h) Crea el método chequear() el cual devolverá un valor booleano. Verdadero si el
coche tiene gasolina y falso en caso contrario. Además, el coche sólo podrá
arrancar si este método devuelve true.
i) Crea la el método pintar() el cual “pintará” el coche con el color que se le pase
como parámetro.
j) Implementa el método toString() para la clase coche*/
    
    public static void main(String[] args) {
        Coche coche1 = new Coche("rojo", 1.60,2.10,5);//mi objeto que es uno
        System.out.println(coche1.toString());
        coche1.arrancar();
        System.out.println(coche1.toString());
        coche1.desplazarse();
        System.out.println(coche1.toString());
        coche1.pintar("morado");
        System.out.println(coche1.toString());
        coche1.arrancar();
        coche1.desplazarse();
        System.out.println(coche1.toString());
        coche1.desplazarse();
        System.out.println(coche1.toString());
        coche1.parar();
        coche1.arrancar();
        System.out.println(coche1.toString());
        coche1.parar();
        coche1.arrancar();
        coche1.echarGasolina(10);
        System.out.println(coche1.toString());
        coche1.arrancar();
        coche1.echarGasolina(10);
        System.out.println(coche1.toString());
        coche1.parar();
        coche1.echarGasolina(10);
        System.out.println(coche1.toString());
        coche1.echarGasolina(60);
        System.out.println(coche1.toString());
        coche1.echarGasolina(60);
        System.out.println(coche1.toString());
          
    }
    
      
      
    
}
