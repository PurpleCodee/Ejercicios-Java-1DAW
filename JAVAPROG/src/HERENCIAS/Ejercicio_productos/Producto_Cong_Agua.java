
package HERENCIAS.Ejercicio_productos;
public class Producto_Cong_Agua extends Producto_Congelado {
    double salinidadAgua;// gramos de sal por litro de agua
    
    //constructor

    public Producto_Cong_Agua(double salinidadAgua, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada, String fechaCaducidad, int numeroLote) {
        super(fechaEnvasado, paisOrigen, temperaturaRecomendada, fechaCaducidad, numeroLote);
        this.salinidadAgua = salinidadAgua;
    }
    //metodo mostrar datos

    @Override
    public String toString() {
        return "Producto congelado con agua"+ "\n" +
                "Salinidad Agua: " + this.salinidadAgua + "\n" +
                "Fecha Envasado: " + this.fechaEnvasado + "\n" + 
                "Pais Origen: " + this.paisOrigen + "\n" + 
                "Temperatura Recomendada: " + this.temperaturaRecomendada + "\n" + 
                "Fecha Caducidad: " + this.fechaCaducidad + "\n" + 
                "Numero Lote: " + this.numeroLote;
    }
    
}
