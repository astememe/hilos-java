package Ejercicios.Practica2.Ejercicio_3;

public class Hilo implements Runnable {
    private String mensaje;
    private Thread hilo;

    public Hilo(String nombre, String mensaje) {
        hilo = new Thread(this, nombre);
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        System.out.println(hilo.getName() + ": Hola mundo " + mensaje);
    }

    public void startRunnable() {
        this.hilo.start();
    }
}
