package ASOCIACION_COMPOSICION.Instrumentos;

public class Partitura {

    String nombre;
    String autor;
    private NotaMusical[] notas;
    private String[] notitas; 
   
    
    //metodo constructor

    public Partitura(String nombrePartitura, String autor) {
        this.nombre = "desconocido";
        this.autor = "desconocido";
        this.notas = new NotaMusical[100];
        this.notitas = new String[]{"Do", "Re", "Mi", "Fa", "Sol", "La", "Si"};
      
        for (int i = 0; i < this.notas.length; i++) {
            this.notas[i] = null;
        }
    }

    //metodo numero de notas
    public int numNotas() {
        int contador = 0;
        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] != null) {
                contador++;
            }
            //no pasa nada
        }
        //devuelvo las veces que haya algo dentro
        return contador;
    }

    //metodo aniadir notas
    public boolean addNotas(NotaMusical notaNueva) {
        int i = 0;
        boolean aniadida = false;//doy por echo que no esta aniadida
        while (this.notas.length > i && !aniadida) {
            if (this.notas[i] == null) {
                this.notas[i] = notaNueva;
                aniadida = true;
            }
            i++;
        }
        return aniadida;
    }

    @Override
    public String toString() {
        String res = "";
        res+= this.nombre + " de " + this.autor;
        for (int i = 0; i < numNotas(); i++) {
            if (i%10==0) {
                res+="\t";    
            }
            res+=this.notitas[i];
        }
        return res;
    }  
}
