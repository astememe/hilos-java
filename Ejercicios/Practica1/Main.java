package Ejercicios.Practica1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador(0);

        Hilo hilo1 = new Hilo("Hilo 1", contador);
        Hilo hilo2 = new Hilo("Hilo 2", contador);
        Hilo hilo3 = new Hilo("Hilo 3", contador);
        Hilo hilo4 = new Hilo("Hilo 4", contador);
        Hilo hilo5 = new Hilo("Hilo 5", contador);

        hilo1.startRunnable();
        hilo2.startRunnable();
        hilo3.startRunnable();
        hilo4.startRunnable();
        hilo5.startRunnable();

        System.out.println(contador.getValor());
    }
}
