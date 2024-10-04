package POO.listaCadenas;

public class listaCadena_objeto {

    public static void main(String[] args) {
        ListaCadena juanji = new ListaCadena(3);
        juanji.aniadir("1");
        juanji.aniadir("2");
        juanji.aniadir("4");
        System.out.println(juanji.toString());
        juanji.llena();

        juanji.vacia();
        //int pos = 2;

        //String res = juanji.obtener(pos);
        //System.out.println("Elemento de la posicion " + pos + ": " + res);
        //juanji.busca("1");
        //int posElemento = juanji.busca("2");
        String[] resTrozo = juanji.trozo(1, 2);

        //utilizo metodo para borrar el elemento de la policion
        //juanji.borrar("2");
        //utilizo metodo para borrar la posicion
        //juanji.borrar(5);
        //utilizo metodo para borrar todos los elementos
        //juanji.borrar();
        //mi for para comprobar las modificaciones

    }
}
