
package HERENCIAS.Ejercicio_productos;
public class Producto_Congelado extends Producto {
    
    String fechaEnvasado;
    String paisOrigen;
    double temperaturaRecomendada;
  
    //constructor

    public Producto_Congelado(String fechaEnvasado, String paisOrigen, double temperaturaRecomendada, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    //metodo para mostrar

    @Override
    public String toString() {
        return "Producto congelado"+ "\n" +
               "FechaEnvasado: " + this.fechaEnvasado + "\n"+ 
               "Pais de Origen: " + this.paisOrigen + "\n" +
               "Temperatura Recomendada: " + this.temperaturaRecomendada + "\n" +
                "Numero de Lote: " + this.numeroLote + "\n" + 
                "Fecha Caducidad: " + this.fechaCaducidad;
    }
    
    
    
   
}
