
package HERENCIAS.Ejercicio_productos;
public class Producto_Cong_Aire extends Producto_Congelado{
    
    double nitrogeno; //%
    double oxigeno; //%
    double dioxidoDeCarbono; //%
    double vaporAgua; //%
    
    //constructor

    public Producto_Cong_Aire(double nitrogeno, double oxigeno, double dioxidoDeCarbono, double vaporAgua, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada, String fechaCaducidad, int numeroLote) {
        super(fechaEnvasado, paisOrigen, temperaturaRecomendada, fechaCaducidad, numeroLote);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoDeCarbono = dioxidoDeCarbono;
        this.vaporAgua = vaporAgua;
    }
    //Metodo mostrar datos

    @Override
    public String toString() {
        return  "Producto Congelado con aire"+ "\n" +
                "Nitrogeno " + this.nitrogeno +"\n" + 
                "Oxigeno " + this.oxigeno + "\n" +
                "Dioxido De Carbono " + this.dioxidoDeCarbono +"\n"+
                "Vapor de Agua " + this.vaporAgua + "\n" + 
                "Fecha Envasado: " + this.fechaEnvasado + "\n" + 
                "Pais Origen: " + this.paisOrigen + "\n" + 
                "Temperatura Recomendada: " + this.temperaturaRecomendada + "\n" + 
                "Fecha Caducidad: " + this.fechaCaducidad + "\n" + 
                "Numero Lote: " + this.numeroLote;
    }
    
       
}
