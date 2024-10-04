package ASOCIACION_COMPOSICION.Instrumentos;

public class Instrumento {

    String marca;
    String fechaFabricacion;
    Partitura partitura;
    boolean tocando = false;
    String[] notitas = new String[]{"Do", "Re", "Mi", "Fa", "Sol", "La", "Si"};

    //2ºsobrecarga de constructor por composicion
    public Instrumento(String marcaInstrumento, String fechaFabricacion, Partitura partitura) {
        this.marca = marcaInstrumento;
        this.fechaFabricacion = fechaFabricacion;
        this.tocando = false;
    }

    //1º constructor con parametros
    public Instrumento(String marcaInstrumento, String fechaFabricacion) {
        this.marca = marcaInstrumento;
        this.fechaFabricacion = fechaFabricacion;
        this.partitura = new Partitura("desconocida", "desconocida");
        this.tocando = false;
       
        int duracionAleatoria = 0;
        int notaAleatoria = 0;
        int aleatorioNotas = (int) (Math.random() * (100 - 10 + 1) + 10);
        duracionAleatoria = (int) (Math.random() * (5 - 1 + 1) + 1);
        notaAleatoria = (int) (Math.random() * (notitas.length));
        
        NotaMusical nota = new NotaMusical(notitas[notaAleatoria], duracionAleatoria);
        for (int i = 0; i < aleatorioNotas; i++) {
         
            this.partitura.addNotas(nota);
        }
    }

    public void aniadirNota() {
        boolean aniadida = false;//doy por echo que no esta aniadida
        int duracionAleatoria = 0;
        int notaAleatoria = 0;
        int aleatorioNotas = (int) (Math.random() * (100 - 10 + 1) + 10);
        duracionAleatoria = (int) (Math.random() * (5 - 1 + 1) + 1);
        notaAleatoria = (int) (Math.random() * (notitas.length));
        int i = 0;
        
        while (this.notitas.length > i && !aniadida) {
            NotaMusical nota = new NotaMusical(notitas[notaAleatoria], duracionAleatoria);
            if (this.notitas[i] == null) {
            
                aniadida = true;
            }   
        }  
    }

    public void tocarPartitura() {

    }

    public void pararDeTocar() {

    }
}
