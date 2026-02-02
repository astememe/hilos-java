package Ejercicios.PracticaUT2_1B.Ejercicio_11;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static ArrayList<Hilo> leaderboard = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<Hilo> animales = new ArrayList<>(Arrays.asList(
                new Hilo("Cigarra"),
                new Hilo("Conejo"),
                new Hilo("Tortuga")
        ));

        for (Hilo animal: animales) {
            animal.start();
        }

        try {
            for (Hilo animal: animales) {
                animal.join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("El ganador es: " + leaderboard.get(0).getName());
    }
}
