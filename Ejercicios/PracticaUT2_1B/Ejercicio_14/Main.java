package Ejercicios.PracticaUT2_1B.Ejercicio_14;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros1 = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            numeros1.add(random.nextInt(1, 1000));
            numeros2.add(random.nextInt(1, 1000));
        }

        long start = System.currentTimeMillis();
        numeros1.sort(null);
        numeros2.sort(null);
        long end = System.currentTimeMillis();

        long tiempo = end - start;
        System.out.println(numeros1);
        System.out.println(numeros2);
        System.out.println("Tiempo en ordenar: " + tiempo + " milisegundos");
    }
}
