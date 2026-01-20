package Gestion_Hilos;

public class Hilo extends Thread {
    private int numeroIteraciones;

    public Hilo(String nombre, int numeroIteraciones) {
        super(nombre);
        this.numeroIteraciones = numeroIteraciones;
    }

    @Override
    public void run() {
        for (int i = 0; i < numeroIteraciones; i++) {
            System.out.println(getName() + ": " + i);
        }
        System.out.println("Fin del bucle de: " + getName());
    }
}
