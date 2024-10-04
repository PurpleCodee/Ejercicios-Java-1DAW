
package HERENCIAS.Ejercicio_productos;
public class Producto {
    /*Todos los productos llevan la siguiente información común: fecha de caducidad y
    número de lote. A su vez, cada tipo de producto lleva alguna información específica:*/
    
    String fechaCaducidad;
    int numeroLote;
    
    //constructor

    public Producto(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
    //metodo para mostrar la informacion del objeto

    @Override
    public String toString() {
        return "Producto"+ "\n" +
               "fechaCaducidad: " + this.fechaCaducidad + "\n" +
               "NumeroLote: " + this.numeroLote;
    }
    
    
}
