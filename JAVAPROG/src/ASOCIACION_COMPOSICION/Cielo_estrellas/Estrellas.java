
package ASOCIACION_COMPOSICION.Cielo_estrellas;
public class Estrellas {
    //Cordenadas Y,X que representaran filas y columnas en la clase cielo
    char estrellitas;
    
    //metodo constructor

    public Estrellas() { //1 es grande 3 es pequeñas
        //estrellas lejanas
        this.estrellitas = '.';
        int proporcion = (int)(Math.random()*(3-1+1)+1);
        //si es 1 seran estrellas grandes
        if (proporcion == 1) {
            this.estrellitas = '*';  
        }  
    }  
    //el unico meto que tiene la clase estrellas es el toString
    @Override
    public String toString() {
        return "" + this.estrellitas ;
    }   
}
