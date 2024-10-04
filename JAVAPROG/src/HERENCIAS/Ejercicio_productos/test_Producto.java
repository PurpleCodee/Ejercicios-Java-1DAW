
package HERENCIAS.Ejercicio_productos;
public class test_Producto {
    public static void main(String[] args) {
        
        Producto pescadito = new Producto("25/09/2023", 6);
        Producto salmoncito = new Producto_Cong_Agua(2.5, "25/09/2017","España", 5, "25/09/2023", 7);
        Producto carnecita = new Producto_Cong_Aire(5.5, 8.6, 7.8, 8.4, "12/8/2015","Marruecos", 5, "25/09/2023", 7);
        Producto patatita = new Producto_Cong_Nitrogeno("congelacion", 5,"5/12/2014","Paris", 8, "25/09/2023", 10);
        Producto pulpito = new Producto_Fresco(6, "Andalucia","Frigorifico", "25/09/2023", 4);
        Producto salchichita = new Producto_Refrigerado(3,"4/8/2018", 5,"Italia", "25/09/2023", 4);
        System.out.println(pulpito.toString());
        

    }
    
}
