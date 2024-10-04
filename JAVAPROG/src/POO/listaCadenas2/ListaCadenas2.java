
package POO.listaCadenas2;

public class ListaCadenas2 {
    String lista[];
    int posLibre;
    
    
    //constructor

    public ListaCadenas2(int tamaño) {//introduzco el tamaño en el constructor
        this.lista = new String[tamaño];//la lista tiene el tamaño de que se introduce en el parametro del constructor
        for (int i = 0; i < this.lista.length; i++) {
            this.lista[i] = "";//lleno las posiciones de cadenas vacias
            
        }
        this.posLibre = 0; //la posicion libre tiene el indice del array (lista)
    }
    
    //Metodo para aniadir un elemento
    
    public void aniadir(String elemento){
        String res = "";
        boolean añadido = false; //no esta añadido
        int i = 0;
        while (!añadido && i < this.lista.length) {//recorro hasta añadir el elemento
            if (this.lista[i].equals("")) {//si la lista esta vacia añado el elemento
                this.lista[i] = elemento;
                this.posLibre++; //actualizo la posicion libre
                añadido = true;//añadido es cierto
                if (i == this.lista.length -1) {
                    this.posLibre = -1;   
                }
            }
            i++; 
        }
        if (!añadido) {//si ya no puedo añadir ningun elemento 
            res = "No se puede introducir el elemento en la lista";   
        }
    }
    
    //Metodo añado elemento y posicion
    public void aniadir(String elemento, int pos){
        String res = "";
        if (pos >=0 && pos < this.lista.length) {//compruebo que la posicion es correcta
            this.lista[pos] = elemento;//asigno el elemneto pedido por parametro a la posicion que se pide por parametro 
            if (this.posLibre > pos) {
                this.posLibre = pos;    
            }
        }else{
            res = "La posicion indicada no existe";//si la posicion indicada no esta en los rangos adecuandos
        
        }
    }
    
    //Metodo para devolver el tamanio
    public int tamanio(){
        return this.lista.length;//devuelvo eltamaño de la lista introducido anteriormente en el parametro
    }
    
    //Metodo que me dice si el array esta lleno
    public boolean lleno(){
        return this.posLibre == -1;//comprueba si esta lleno
    
    }
    
    //Metodo que me dice si la lista esta vacia
    public boolean vacia(){
        boolean vacio = true;//doy poe echo que esta vacio
        int i = 0;
        while (i < this.lista.length && vacio){//recorro mientras que esta vacio PARO!! si encuentro un elemento
            if (!this.lista[i].equals("")){//si los elementos de la lista son diferente a cadenas vacias
                vacio = false;//la lista estarea llena   
            }
            i++;
        }
        return vacio;
    }
    
    //Metodo para obtener la posicion
    public String obtener(int pos){
        String res = "";
        if (pos >= 0 && pos < this.lista.length) {
            res = this.lista[pos];
              
        }else{
            res = "La posicion indicada no existe";
        }
        return res;
    }
    
    //Metodo que devuelve el elemento indicado en el parametro del metodo 
    public int buscar(String elemento){
        int posicion = -1;
        boolean encontrado = false; //doy por echo que no lo he encontrado
        int i = 0;
        while (!encontrado && i < this.lista.length) {
             if (this.lista[i].equals(elemento)){//si los elementos de la lista son diferente a cadenas vacias
                 posicion = i;//la posicion de la primera paricion
                 encontrado = true;
            }
             i++;
        }
        return posicion;
    }
    
    //Metodo borro todos los elementos de la lista
    public void borrar(){
        for (int i = 0; i < this.lista.length; i++) {
            this.lista[i] = ""; //lo vacio completamente  
        }
        this.posLibre = 0;//actulizo de nuevo la posicion
    }
    
     //Metodo borro posicion de la lista
    public void borrar(int pos){
        if (pos >= 0 && pos < this.lista.length) {//comprubo que la posicion es correcta
            this.lista[pos] = "";//vacio la poscion introducuida por parametros    
            if (this.posLibre > pos || this.posLibre == -1) {//actulizo la posicion
                this.posLibre = pos;    
            }
        }else{
            System.out.println("La posicion indicada no existe");
        }
    }
    
    //Metodo borrar elemento de la lista
    public void borrar(String elemento){
        boolean encontrado = false;//no lo he enconrtrado
        int i = 0;
        while (!encontrado && i < this.lista.length) {//doy vueltas hasta que lo encuentre
            if (this.lista[i].equals(elemento)) {//mientras que elemento sea igual
                this.lista[i] = "";//lo borro
                encontrado = true;//lo he encontrado 
                if (this.posLibre > i || this.posLibre == -1) {
                    this.posLibre = i; //actualizo la posicion 
                }
            }
            i++;
        } 
        if (!encontrado) {
            System.out.println("No puedo borrar ningun elemento");       
        }
    }
    
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
        for (int i = 0; i < this.lista.length; i++) {
            if (i == this.lista.length-1) {
                elementos+=this.lista[i] + "\n";    
            }else{
                elementos += this.lista[i] + ", ";
            }   
        }
        return "El array de caracteres: \n" + "lista: " + elementos + 
                "Posicion: " + this.posLibre;
    }   
}
