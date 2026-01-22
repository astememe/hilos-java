package Ejercicios.Practica2.Ejercicio_5;

public class Hilo implements Runnable {
    private Thread hilo;
    private int tipo;

    public Hilo(int tipo) {
        hilo = new Thread(this);
        this.tipo = tipo;
    }
    @Override
    public void run() {
        if (tipo == 1) {
            for (int i = 0; i < 31; i++) {
                System.out.print(i + " ");
            }
        } else {
            for(int i = 97; i <= 122; i++) {
                System.out.print(Character.toString(i) + " ");
            }
        }
    }

    public void startRunnable() {
        hilo.start();
    }
}
