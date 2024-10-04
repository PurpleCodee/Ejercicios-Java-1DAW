
package HERENCIAS.Ejercicio_productos;
public class Producto_Fresco extends Producto{
    
    int fechaEnvasado;
    String paisOrigen;
    String metodoConservacion;
    
    //constructor

    public Producto_Fresco(int fechaEnvasado, String paisOrigen, String metodoConservacion, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.metodoConservacion = metodoConservacion;
        
         
         
    }   
    //metodo para mostrar la informacion del objeto
    @Override
    public String toString() {
        return "Producto fresco"+ "\n" +
               "Fecha de Envasado: " + this.fechaEnvasado + "\n"+
               "Pais de Origen: " + this.paisOrigen +  "\n" +
               "metodo Conservacion: " + this.metodoConservacion+ "\n" +
                "Numero de Lote: " + this.numeroLote + "\n" + 
                "Fecha Caducidad: " + this.fechaCaducidad;
    }
}
