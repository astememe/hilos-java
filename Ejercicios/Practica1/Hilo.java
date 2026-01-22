package Ejercicios.Practica1;

public class Hilo implements Runnable {
    Thread hilo;
    Contador contador;
    public Hilo(String nombre, Contador contador) {
        hilo = new Thread(this, nombre);
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            contador.incrementar();
        }
        System.out.println(this.hilo.getName() + " " + contador.getValor());
    }

    public void startRunnable() {
        hilo.start();
    }
}
