package ASOCIACION_COMPOSICION.Revolver;

public class Revolver {

    private String marca;
    private int modelo;
    private Bala tambor[];
    private int martillo;

    //metodo constructor
    public Revolver(String marca, int modelo, int tamañoTambor) {
        this.marca = marca;
        this.modelo = modelo;
        this.tambor = new Bala[tamañoTambor];
        this.martillo = 0;

        for (int i = 0; i < tamañoTambor; i++) {//lo recorro hasta llenar el tambor de balas
            int calibreAleatorio = (int) (Math.random() * (20 - 5 + 1) + 5);
            int longitudAleatoria = (int) (Math.random() * (70 - 20 + 1) + 20);

            //utilizo la sobrecarga del constructor
            this.tambor[i] = new Bala(calibreAleatorio, longitudAleatoria);
        }
    }

    /*si el hueco al que (apunta el martillo) i tiene una bala osea esta lleno se dispara (resto una bala)
      en este caso se devuelve la info de la bala que se disparo (la que apunta el martillo la que esta en
      esa posicion) deja el hueco a null vacio*/

 /*Si no hay bala en la posicion a la que apunta el martillo(i) se devuelove "No hay bala en ese hueco"*/
 /*Si dispare una bala o no el tambor se va a mover una posicion */
    public String disparar() {
        String mensajito = "Ha disparado";//variable para mostrar mensaje
        
        if (this.tambor[this.martillo] != null) {
            this.tambor[this.martillo] = null;

        } else {
            mensajito = "No hay bala en ese hueco";
        }
        if (this.martillo == this.tambor.length -1) {
            this.martillo = 0; 
        }else{
            this.martillo++;
        }
        return mensajito;
    }

    @Override
    public String toString() {
        String res = "";
        String info_bala = "";
        for (int i = 0; i < this.tambor.length; i++) {
            if (this.tambor[i] != null) {
                info_bala += "Bala " + i + ": " + this.tambor[i].toString() + "\n";
            }else{
                info_bala += "Bala " + i + ": No hay bala\n";
            }   
        }
        res = "La marca es: " + this.marca + "\n" +
              "El modelo es: " + this.modelo + "\n" +
              "El tamaño del tambor es: " + this.tambor.length + "\n" +
              "Balas: \n" + info_bala;  
        
        return res;
    }    
}
