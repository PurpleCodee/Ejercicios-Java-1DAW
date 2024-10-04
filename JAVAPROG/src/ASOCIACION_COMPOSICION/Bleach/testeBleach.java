
package ASOCIACION_COMPOSICION.Bleach;
public class testeBleach {
    public static void main(String[] args) {
        Zanpakuto demonio = new Zanpakuto("MIMI", 13, 6);
      
   
        Sustitutos nini = new Sustitutos("malaga", 6, 10, "ichigo", "andalucia", 9, demonio);
      
        Capitanes mister  = new Capitanes(12, "nanai", "rusia", 9, demonio);
        System.out.println(mister);
        nini.pelear(mister);
        System.out.println(mister);
    }
    
}
