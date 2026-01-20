package Gestion_Hilos;

public class EjercicioRunnable implements Runnable {
    private Thread hilo;
    private int num;

    public EjercicioRunnable(String nombre, int iteraciones) {
        hilo = new Thread(this, nombre);
        this.num = iteraciones;
    }

    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            System.out.println(hilo.getName() + i);
        }
    }

    public void startRunnable() {
        hilo.start();
    }

    public void joinRunnable() {
        try {
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        EjercicioRunnable stephano = new EjercicioRunnable("Stephano", 30);
        EjercicioRunnable fabio = new EjercicioRunnable("Fabio", 30);
        EjercicioRunnable stoian = new EjercicioRunnable("Stoian", 30);

        stephano.startRunnable();
        stephano.joinRunnable();
        fabio.startRunnable();
        stoian.startRunnable();
    }
}
