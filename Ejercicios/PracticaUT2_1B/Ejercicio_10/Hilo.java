package Ejercicios.PracticaUT2_1B.Ejercicio_10;

public class Hilo implements Runnable {
    private int tipo;

    public Hilo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        if (tipo == 1) {
            for (int i = 0; i <= 30; i++) {
                System.out.print(i + " ");
            }
        } else {
            for(int i = 97; i <= 122; i++) {
                System.out.print((char)i + " ");
            }
        }
    }
}