package Ejercicios.Practica3_1.Ejercicio_7;

public class Main {
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo(1);
        Hilo hilo2 = new Hilo(2);

        hilo1.startRunnable();
        hilo2.startRunnable();
    }
}
