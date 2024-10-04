package EXCEPCIONES;

public class piscinaTest {

    public static void main(String[] args) {

        int aleatorio_dios = (int) (Math.random() * (100 - 1 + 1) + 1);
        Piscina charquito = new Piscina(aleatorio_dios);
        try {
            for (int i = 0; i < 4; i++) {
                charquito.ponerAgua((int) (Math.random() * (25 - 1 + 1) + 1));
                System.out.println("Nivel poniendo");
            }

        } catch (PiscinitaException e) {
            System.out.println(e.getMessage());

        }
        try {
            for (int i = 0; i < 4; i++) {
                charquito.quitarAgua((int) (Math.random() * (25 - 1 + 1) + 1));
                System.out.println("Nivel quitando");

            }

        } catch (PiscinitaException e) {
            System.out.println(e.getMessage());
        }
    }
}
