
package POO.listaCadenas2;

public class lista_Objeto_2 {

    public static void main(String[] args) {
        ListaCadenas2 nami = new ListaCadenas2(5);
        nami.aniadir("1");
        nami.aniadir("4");
        nami.aniadir("7");
        nami.aniadir("8");
        nami.aniadir("8");
        nami.borrar("1");
        nami.aniadir("9");
        System.out.println(nami.toString());
        

    }
    
}
