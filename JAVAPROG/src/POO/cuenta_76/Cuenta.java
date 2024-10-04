
package POO.cuenta_76;
/*76.- Crea una clase llamada Cuenta que tendrá los siguientes atributos privados: titular
y cantidad. Al crear un objeto de la clase, el titular será obligatorio pero la cantidad
puede ser opcional.
Ademas de los métodos getters y setters, la clase tendrá los siguientes:
• ingresar: se ingresa una cantidad a la cuenta, si la cantidad introducida es
negativa, no se hará nada.
• retirar: se retira una cantidad indicada de la cuenta, si y solo si, hay
suficiente dinero para eso. En caso contrario se indica un mensaje de error.
• toString: muestra una cadena con los datos de la cuenta: Esta cuenta
pertenece a xxxxx y posee actualmente una cantidad de yyyy €.*/

public class Cuenta {
    private String titular;
    private double cantidad;
    
    
    //constructor
    public Cuenta(String titular){
        this.titular = titular;
        this.cantidad = 0;
    }
    
    
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void ingresar(double dineroIngresado){
        if (dineroIngresado > 0) {
            cantidad += this.cantidad;
        }

    }
    
    public void retirar(double dineroRetirado){
        if (dineroRetirado > 0) {
            if (cantidad - dineroRetirado >= 0){
                //cantidad que es lo que tengo menos el dinero que retiro
                cantidad -= dineroRetirado;        
            }else{
                System.out.println("Error no hay suficiente dinero");
            }
            
        }else{
            System.out.println("El dinero que intenta retirar no es positivo");
        }
            
    }
    
    private String Mostrar(){
        return "Esta cuenta pertenece a " + this.titular + " y posee actualmente una cantidad de "+ this.cantidad +"€";
       
    }

    @Override
    public String toString() {
        return Mostrar();
    }
    
 
}
