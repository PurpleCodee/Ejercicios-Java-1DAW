package ASOCIACION_COMPOSICION.Cielo_estrellas;

public class Cielo {

    Estrellas cielito[][];
    int x;
    int y;

    //metodo constructor
    public Cielo(int x, int y) {
        this.cielito = new Estrellas[x][y];

        for (int i = 0; i < cielito.length; i++) {
            for (int j = 0; j < cielito[i].length; j++) {
                this.cielito[i][j] = null;

            }
        }
    }

    //recibe un numero de estrellas
    public void ponerEstrellas(int numeroEstrellas) {

        for (int i = 0; i < numeroEstrellas; i++) {
            int xAleatoria = (int) (Math.random() * this.cielito.length);
            int yAleatoria = (int) (Math.random() * this.cielito[0].length);//pongo 0 porque la i es el numero de estrellas y se pasa del length

            if (this.cielito[xAleatoria][yAleatoria] == null) {
                Estrellas estrellita = new Estrellas();
                this.cielito[xAleatoria][yAleatoria] = estrellita;
            }else{
                numeroEstrellas-=1;// 
            }
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < this.cielito.length; i++) {
            for (int j = 0; j < this.cielito[i].length; j++) {
                if (this.cielito[i][j]!=null) {
                    res += this.cielito[i][j];    
                }else{
                res += " ";
                }   
            }
            res += "\n";
        }  
        return res;
    }  
}
