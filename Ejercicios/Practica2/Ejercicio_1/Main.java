package Ejercicios.Practica2.Ejercicio_1;

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
