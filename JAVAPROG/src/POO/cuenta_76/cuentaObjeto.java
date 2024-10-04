
package POO.cuenta_76;


public class cuentaObjeto {

    
    public static void main(String[] args) {
        Cuenta BBVA = new Cuenta("Enya", 500);
        BBVA.setCantidad(200);
        BBVA.ingresar(200);
        BBVA.retirar(410);
        System.out.println(BBVA.toString());
        double cantidad_get = BBVA.getCantidad();
        String titular_get = BBVA.getTitular();
       
    }
    
}
