package Ejercicios.Practica3_1.Ejercicio_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hilo> hilos = new ArrayList<>(Arrays.asList(
                new Hilo("Hilo1", 50),
                new Hilo("Hilo2", 100),
                new Hilo("Hilo3", 150)
        ));

        for(Hilo hilo: hilos) {
            hilo.start();
        }
    }
}
