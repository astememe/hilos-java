package Ejercicios.PracticaUT2_1B.Ejercicio_15;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> numeros1 = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            numeros1.add(random.nextInt(1, 1000));
            numeros2.add(random.nextInt(1, 1000));
        }

        Hilo hilo1 = new Hilo(numeros1);
        Hilo hilo2 = new Hilo(numeros2);

        long start = System.currentTimeMillis();
        hilo1.start();
        hilo2.start();
        hilo1.join();
        hilo2.join();
        long end = System.currentTimeMillis();
        long tiempo = end - start;
        System.out.println("Tiempo en ordenar: " + tiempo + " milisegundos");
    }
}
