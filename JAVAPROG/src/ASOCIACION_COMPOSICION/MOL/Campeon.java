package ASOCIACION_COMPOSICION.MOL;

public class Campeon extends Personaje {//heredan de personajes

    double puntosMagia;//propias de la clase
    int nivel;//propias de la clase
    Habilidad habilidades[];
    String rol;

    //metodo constructor
    public Campeon(String nombrePersonaje, String rol) {

        super(nombrePersonaje, 0, 0, 0, 0, 0);
        this.puntosMagia = puntosMagia;
        this.nivel = 1;//todos los campeones comienzan en el nivel 1
        this.habilidades = new Habilidad[4];
        this.rol = rol;
        this.cordenadasVertical = (int) (Math.random() * (1920 - 1000 + 1) + 1000);
        this.cordenadasHorizontal = (int) (Math.random() * (1920 - 1000 + 1) + 1000);
        this.puntosAtaque = (int) (Math.random() * (7 - 3 + 1) + 3);
        this.puntosVida = (int) (Math.random() * (200 - 150 + 1) + 150);

        if (this.rol.equalsIgnoreCase("Tanque") || this.rol.equalsIgnoreCase("Carry")
                || rol.equalsIgnoreCase("Support") || rol.equalsIgnoreCase("Mago")
                || rol.equalsIgnoreCase("Jungla")) {
            this.rol = rol;
        } else {
            this.rol = "Carry";
        }
        if (rol.equalsIgnoreCase("Tanque")) {
            this.puntosVida = 50;
            this.puntosEscudo = puntosEscudo;
            this.puntosAtaque = puntosAtaque;
            puntosMagia = 100;
        } else if (rol.equalsIgnoreCase("Carry")) {
            this.puntosVida = 12;
            this.puntosEscudo = 40;
            this.puntosAtaque = puntosAtaque + 100;
            puntosMagia = 300;

        } else if (rol.equalsIgnoreCase("Support")) {
            this.puntosVida = 75;
            this.puntosEscudo = puntosEscudo + 50;
            this.puntosAtaque = puntosAtaque;
            puntosMagia = 300;

        } else if (rol.equalsIgnoreCase("Mago")) {
            this.puntosVida = 75;
            this.puntosEscudo = puntosEscudo + 150;
            this.puntosAtaque = puntosAtaque;
            puntosMagia = 500;

        } else if (rol.equalsIgnoreCase("Jungla")) {//me lo puedo ahorrar y ponerlo en un else
            this.puntosVida = 75;
            this.puntosEscudo = 5;
            this.puntosAtaque = puntosAtaque;
            puntosMagia = 200;
        }
    }

    public void subirNivel(Habilidad nueva) {
        //1º Incrementa en 1 el nivel del campeon
        /*2º Saca numero aleatorio entre 1 y 9.Se lo suma a los puntos de vida
          3º Saca numero aleatorio entre 1 y 9, divide el numeri entre 10 y se 
             y se los suma a los puntos de escudo
          4º Saca numero aleatorio entre 1 y 9, dividse ese numero entre 10 y 
             se lo suma a los puntos de ataque
          5º Si el campeon esta en el nivel 4,6 u 8, se añadira la habilidad 
             que se pasa como parametro a la lista de habilidades */
        this.nivel++;
        double numAleatorio = (int) (Math.random() * (9 - 1 + 1) + 1);
        this.puntosVida += numAleatorio;
        numAleatorio = (int) (Math.random() * (9 - 1 + 1) + 1);
        this.puntosEscudo += (numAleatorio / 10);
        numAleatorio = (int) (Math.random() * (9 - 1 + 1) + 1);
        this.puntosAtaque += (numAleatorio / 10);
        
        if (this.nivel==4 || this.nivel==6 || this.nivel==8) {
            boolean vacia = false;
            int i = 0;
            while (habilidades.length > i && !vacia) { //si esta llena
                if (habilidades[i] == null) {
                     habilidades[i]=nueva;
                     vacia = true;
                }
                i++;
            }   
        }
    }
}
