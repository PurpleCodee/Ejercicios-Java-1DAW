package POO.listaCadenas;


/*79.- Implementa la clase lista de cadenas. Dicha clase va a servirnos para facilitar el uso
de arrays a gente que está aprendiendo a programar.
La clase va a tener la propiedad lista, la cual será un array del tamaño indicado en el
constructor, por tanto, el constructor de la clase sólo necesita un parámetro: el tamaño
de la lista.

También tendrá un número encargado de indicar la siguiente posición vacía de la lista si
la hubiera. Si no hubiera una posición vacía en la lista, su valor será -1
La lista, al principio, estará rellena de cadenas vacías y el valor del indice será el del
primer cajón del array: 0 (primer posición libre del array)

Los métodos de la clase serán los siguientes:

• aniadir(String elemento): añade el elemento que se le pasa como
argumento a una posición vacía de la lista. Sino puedo hacerse, se muestra un
mensaje por pantalla.


• aniadir(String elemento, int pos): añade el elemento que se pasa
como primer argumento en la posición indicada en el segundo argumento. Si ya
hay algo en esa posición, lo machaca. Si la posición indicada no existe, debe
mostrarse por pantalla el fallo y no hacer nada.

• tamanio(): devuelve el tamaño de la lista.

• llena(): devuelve un booleano indicando si la lista está llena o no.

• vacia(): devuelve un booleano indicando si la lista está totalmente vacía o no.

• obtener(int pos): devuelve el elemento que hay en la posición indicada
como argumento. Si la posición indicada no existe, debe mostrarse por pantalla
el fallo.

• buscar(String elemento): devuelve la posición de la primera aparición
del elemento que se pasa como argumento en la lista. Si el elemento no está,
devuelve -1.

• borrar(): borra todos los elementos de la lista (los pone como cadena vacía).

• borrar(int pos): borra el contenido de la posición indicada como
argumento (es decir, coloca la cadena vacía). Si la posición indicada no existe,
debe mostrarse por pantalla el fallo.

• borrar(String elemento): borra el contenido de la primera celda que
encuentre con el mismo contenido que el argumento (es decir, solo borra UNA
vez). Si no puede borrar nada, lo indica por pantalla.

• trozo(int pos1, int pos2): devuelve un trozo de la lista (un array)
tomando como inicio el argumento de menor valor y como fin el argumento de
mayor valor. Si alguno de los argumentos no es correcto (se sale del tamaño de
la lista), devolverá un array vacío*/
public class ListaCadena {

    private String[] lista;
    private int posVacia;

    //constructor
    public ListaCadena(int tamaño) {
        this.lista = new String[tamaño];
        for (int i = 0; i < this.lista.length; i++) {
            this.lista[i] = "";

        }
        this.posVacia = 0;
    }

    //metodo para añadir elemeno a la lista
    public void aniadir(String elemento) {
        boolean añadido = false;
        int i = 0;
        while (!añadido && i < this.lista.length) {
            if (this.lista[i].equals("")) {
                this.lista[i] = elemento;
                this.posVacia++;
                añadido = true;
            }
            i++;
        }
        if (!añadido) {
            System.out.println("No se puede introducir el elemento a la lista");
        }
    }

    //metodo para añadir elementos
    public void aniadir(String elemento, int pos) {
        if (pos >= 0 && pos < this.lista.length) {
            //asigno el elemento en la posicion especifica
            this.lista[pos] = elemento;
            if (this.posVacia > pos) {
                this.posVacia = pos;

            }
            
          
        } else {
           
            // La posición está fuera del rango, muestra un mensaje de error
            System.out.println("La posicion indicada no existe");
            
        }

    }
    // metodo para saber el tamaño del array

    public int tamanio() {

        /*devuelve el tamaño de la lista.*/
        System.out.println(this.lista.length);//mensaje de prueba
        return this.lista.length;
    }

    //metodo para comprobar si el array de cadenas esta lleno
    public boolean llena() {

        return -1 == this.posVacia;
    }

    public boolean vacia() {
        boolean vacio = true;//compruebo si esta vacio o no
        int i = 0;
        while (i < this.lista.length && vacio) {
            if (!this.lista[i].equals("")) {
                vacio = false;

            }
        }
        return vacio;
    }

    public String obtener(int pos) {
        String res = "";
        if (pos >= 0 && pos < this.lista.length) {
            res = this.lista[pos];
        } else {
            res = "La posicion indicada no es correcta";
        }

        return res;

    }

    //metodo para buscar la posicion de la primera aparicion de un elemento
    public int busca(String elemento) {
        int posicion = -1;//si el elemento no esta en ninguna posicion
        int i = 0;
        boolean encontrado = false;
        while (i < this.lista.length && !encontrado) {
            if (this.lista[i].equals(elemento)) {
                posicion = i;
                encontrado = true;
                System.out.println("La primera aparicion de : " + elemento + " esta en la posicion: " + posicion);
            }
            i++;
        }
        System.out.println("La posicion del elemento es: " + posicion);
        return posicion;
    }

    //metodo para borrar todos los elementos del array y asignarles una cadena vacia
    public void borrar() {
        for (int i = 0; i < this.lista.length; i++) {

            this.lista[i] = "";
        }
        this.posVacia = 0;

    }

    //metodo para borrar en concreto una posicion del array
    public void borrar(int posicion) {
        //verifico si la posicion indicada esta dentro del rango
        if (posicion >= 0 && posicion < this.lista.length) {
            //borro lo que hay dentro de la posicion
            this.lista[posicion] = "";
            if (this.posVacia > posicion) {
                this.posVacia = posicion;

            }

        } else {
            System.out.println("La posicion no existe");
        }
    }

    //metodo para borrar el contenido de la primera celdad que encuentre con el mismo elementro introducido en el parametro
    public void borrar(String elemento) {
        boolean encontrado = false;
        int i = 0;
        while (i < this.lista.length && !encontrado) {
            if (this.lista[i].equals(elemento)) {
                this.lista[i] = "";
                encontrado = true;
            }
            i++;
        }
        //lo coloco fuera del bucle para que el mensaje no se repita
        if (!encontrado) {
            System.out.println("No puede borrar nada");

        } else {
            if (this.posVacia > i) {
                this.posVacia = i;

            }

        }
    }

    //metodo que devuelve 
    public String [] trozo(int pos1, int pos2) {
       
        
        String[] trozo;
        int comienza = 0;//variable para comparar cual es el comienzo de la posicion
        int finaliza = 0;//variable para comparar el final de la posicion
        //comparo que el tamaño de la pos1 y de la pos2 estan en los valores correctos
        if (pos1 >= 0 && pos2 >= 0 && pos1 < this.lista.length && pos2 < this.lista.length){
            //comparo cual es el mayor o igual
            if (pos1 >= pos2){
                //inicializo un array, resto la posicion mayor y la menor y se sumo uno para que me de el tamaño correcto del array
                trozo = new String[pos1 - pos2 + 1];
                comienza = pos2;//comienza en la posicion chikita
                finaliza = pos1;//finaliza en la posicion grande
            }else{
                trozo = new String[pos2 - pos1 + 1];//si se diese el caso de que la pos1 fuese fuse la chikita
                comienza = pos1;
                finaliza = pos2;
            }
            //recorro con un for el array trozo declarado anteriormente 
            for (int i = 0; i < trozo.length; i++){
                /*y asigno a los valores de trozo los valores mi lista de cadenas declarada al comienzo del ejercicio con los valores
                
                */
                trozo[i] = this.lista[comienza + i];//
            }
            
        }else{
            //mi nuevo array esta vacio
            trozo = new String[0];
        }
        
        return trozo;
    }

    @Override
    public String toString() {
        String elementos = "";
        for (int i = 0; i<this.lista.length; i++){
            if (i == this.lista.length-1){
                elementos += this.lista[i] + "\n";
            }else{
                elementos += this.lista[i] + ", ";
            }
        }
        
        return "El array de caracteres: \n" + "lista: " + elementos + 
                "Posicion vacia: " + this.posVacia;
    }
}
