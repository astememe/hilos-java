package Ejercicios.Practica3_1.Ejercicio_8;



import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Contador> contadores = new ArrayList<>(Arrays.asList(
                new Contador("Hilo 1", 10),
                new Contador("Hilo 2", 20),
                new Contador("Hilo 3", 30),
                new Contador("Hilo 4", 40)
        ));

        for (Contador contador: contadores) {
            contador.start();
        }
    }
}
