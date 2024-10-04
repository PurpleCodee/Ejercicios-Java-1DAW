package ASOCIACION_COMPOSICION.Revolver;

public class test_Revolver {

    public static void main(String[] args) {
        Revolver pistolita = new Revolver("Winchester", 1883, 6);
        for (int i = 0; i < 7; i++) {
            System.out.println(pistolita.toString());
            System.out.println(pistolita.disparar());

        }
        System.out.println(pistolita.toString());
    }
}
