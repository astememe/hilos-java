package Ejemplos;

public class HiloRunnable implements Runnable {
    Thread hilo;

    public HiloRunnable() {
        hilo = new Thread(this, "HiloPrueba");
        System.out.println("Hilo creado: " + hilo);
        hilo.start();
    }

    @Override
    public void run() {
        System.out.println("Ejecución");
    }

    public static void main(String[] args) {
        System.out.println("Creación de un hilo en main.");
        new HiloRunnable();
        new HiloRunnable();
        System.out.println("Ha terminado el hilo.");
    }
}
