package Ejercicios.PracticaUT2_1B.Ejercicio_15;

import javax.swing.*;
import java.util.ArrayList;

public class Hilo extends Thread {
    public ArrayList<Integer> numeros;
    public long tiempo = 0;

    public Hilo(ArrayList<Integer> numeros) {
        super();
        this.numeros = numeros;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        this.numeros.sort(null);
        long end = System.currentTimeMillis();
        this.tiempo = end - start;
        System.out.println("Tiempo en acabar el proceso: " + this.tiempo);
    }
}
