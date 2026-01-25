package Ejercicios.Practica3_1.Ejercicio_5;

public class Hilo implements Runnable {
    Thread hilo;
    int limite;


    public Hilo(String nombre, int limite) {
        hilo = new Thread(this, nombre);
        this.limite = limite;
    }

    @Override
    public void run() {
        for (int i = 0; i < limite; i++) {
            System.out.println(hilo.getName()+ ": " + i);
        }
    }

    public void startRunnable() {
        hilo.start();
    }
}
