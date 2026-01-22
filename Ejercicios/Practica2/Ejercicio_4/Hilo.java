package Ejercicios.Practica2.Ejercicio_4;

public class Hilo extends Thread {
    private int numIteraciones;

    public Hilo(int numIteraciones) {
        this.numIteraciones = numIteraciones;
    }

    @Override
    public void run() {
        long numeroanterior = 0;
        long numeroactual = 1;
        for (int i = 0; i < numIteraciones - 1; i++) {
            System.out.println(numeroactual);
            long siguiente = numeroactual + numeroanterior;
            numeroanterior = numeroactual;
            numeroactual = siguiente;
        }
    }
}
