
package HERENCIAS.Ejercicio_productos;
public class Producto_Cong_Nitrogeno extends Producto_Congelado {
    
    String metodoCongelacion; //metodo de congelacion empleado
    int exposicioNitrogeno; // expresion de nitrogeno por segundo
    
    //metodo constructor

    public Producto_Cong_Nitrogeno(String metodoCongelacion, int exposicioNitrogeno, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada, String fechaCaducidad, int numeroLote) {
        super(fechaEnvasado, paisOrigen, temperaturaRecomendada, fechaCaducidad, numeroLote);
        this.metodoCongelacion = metodoCongelacion;
        this.exposicioNitrogeno = exposicioNitrogeno;
    }
    //metodo mostrar datos
    @Override
    public String toString() {
        return "Producto congelado con nitrogeno"+ "\n" +
                "Metodo De Congelacion: " + this.metodoCongelacion + "\n" +
                "Exposicio Nitrogeno: " + this.exposicioNitrogeno + "\n" + 
                "Fecha Envasado: " + this.fechaEnvasado + "\n" + 
                "Pais Origen: " + this.paisOrigen + "\n" + 
                "Temperatura Recomendada: " + this.temperaturaRecomendada + "\n" + 
                "Fecha Caducidad: " + this.fechaCaducidad + "\n" + 
                "Numero Lote: " + this.numeroLote;
    }
   
}
