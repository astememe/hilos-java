package Ejercicios.Practica2.Ejercicio_5;

public class Main {
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo(1);
        Hilo hilo2 = new Hilo(2);

        hilo1.startRunnable();
        hilo2.startRunnable();
    }
}
