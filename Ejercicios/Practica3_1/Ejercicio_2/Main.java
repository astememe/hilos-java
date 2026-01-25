package Ejercicios.Practica3_1.Ejercicio_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hilo> hilos = new ArrayList<>(Arrays.asList(
                new Hilo("Hilo 1"),
                new Hilo("Hilo 2"),
                new Hilo("Hilo 3"),
                new Hilo("Hilo 4"),
                new Hilo("Hilo 5")
        ));

        for (Hilo hilo: hilos) {
            hilo.start();
        }
    }
}
