
package PLANTILLAS;
//1ºImportamos la biblioteca
import java.util.ArrayList;
public class plantillaArrayList {

    public static void main(String[] args) {
        //2º Lo declaramos el arrayList dinamico
        ArrayList<Integer> listita = new ArrayList<>();
        listita.add(6);
        listita.add(3);
        listita.add(23);
        System.out.println(listita);
        
        listita.add(2,78);//añado el 78 en la posicion 2 y desplazo el 23 --> o desplazo el siguiente elemento
        System.out.println(listita);
        
        listita.add(2,123);
        System.out.println(listita);
        
        System.out.println(listita.size());//este metodo me muetra el tamaño de la lista
        
        //para que me elimine un cajo
        listita.remove(0);//me borra el elemento del cajon cero pero me actualiza el indice
        System.out.println(listita);
        
        //si quiero que me borre el 78  lo casteo y me borra el numero, no la posicion ya que la posicion no existe
        listita.remove((Integer)78);
        System.out.println(listita);
        
        //Para dejarme vacia la lista
        listita.clear();
        System.out.println(listita);//Si hiciese eso con un null me destruiria el objeto
        
        //Con el get accedo al cajon
        int num = listita.get(2);
        System.out.println(num);
        
        //si lo quisiese recorrer con un for lo debo de hacer esta manera
        //no se recomienza hacer con un for
       /*int tam = listita.size();
        for (int i = 0; i < tam; i++) {
        }*/
    }
}
