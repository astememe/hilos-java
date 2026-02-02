package Ejercicios.PracticaUT2_1B.Ejercicio_10;

public class Main {
    public static void main(String[] args) {
        Hilo tareaNumeros = new Hilo(1);
        Hilo tareaLetras = new Hilo(2);

        Thread hilo1 = new Thread(tareaNumeros);
        Thread hilo2 = new Thread(tareaLetras);

        hilo1.start();
        hilo2.start();
    }
}