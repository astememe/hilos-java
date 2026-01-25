package Ejercicios.Practica3_1.Ejercicio_3;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hilo> hilos = new ArrayList<>(Arrays.asList(
                new Hilo("Hilo 1", "Mensaje: 1"),
                new Hilo("Hilo 2", "Mensaje: 2"),
                new Hilo("Hilo 3", "Mensaje: 3"),
                new Hilo("Hilo 4", "Mensaje: 4"),
                new Hilo("Hilo 5", "Mensaje: 5"),
                new Hilo("Hilo 6", "Mensaje: 6"),
                new Hilo("Hilo 7", "Mensaje: 7")
        ));

        for (Hilo hilo: hilos) {
            hilo.startRunnable();
        }
    }
}
