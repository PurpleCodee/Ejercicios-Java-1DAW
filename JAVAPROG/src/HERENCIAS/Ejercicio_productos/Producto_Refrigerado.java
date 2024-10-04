
package HERENCIAS.Ejercicio_productos;
public class Producto_Refrigerado extends Producto {
    int codigoOrganismo;//organismo de supervision alimentaria
    String fechaEnvasado;//¿String o int?
    double temperatura;
    String paisOrigen;
    
    //constructor

    public Producto_Refrigerado(int codigoOrganismo, String fechaEnvasado, double temperatura, String paisOrigen, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperatura = temperatura;
        this.paisOrigen = paisOrigen;
    }
    //metodo para mostrar la informacion del objeto

    @Override
    public String toString() {
        return "Producto refrigerado"+ "\n" +
               "Codigo Organismo: " + this.codigoOrganismo + "\n" +
               "FechaEnvasado: " + this.fechaEnvasado + "\n" + 
               "Temperatura: " + this.temperatura + "\n"+
               "pais de Origen: " + this.paisOrigen+ "\n" +
               "Numero de Lote: " + this.numeroLote + "\n" + 
               "Fecha Caducidad: " + this.fechaCaducidad;
    }
    
}
