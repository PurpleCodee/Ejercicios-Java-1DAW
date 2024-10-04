package EXCEPCIONES;

public class Excepciones_2_ejemplo {

    public static void main(String[] args) {

        int lista[] = new int[10];
        int suma = 0;
        int i = 0;

        for (i = 0; i < 10; i++) {
            lista[i] = (int) (Math.random() * 3);
            System.out.println("He metido un " + lista[i]);
        }
        System.out.println(" ");

        for (i = 1; i < lista.length; i++) {
            try {
                suma += (lista[i] / lista[i - 1]);
            } catch (ArithmeticException e) {
                suma += 0;
            }
        }
        System.out.println("Suma es: " + suma);
    }
}
