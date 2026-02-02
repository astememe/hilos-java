package Ejercicios.PracticaUT2_1B.Ejercicio_11;

public class Hilo extends Thread {
    public String nombre;
    public int metros_recorridos;

    public Hilo(String nombre) {
        super(nombre);
        metros_recorridos = 0;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            metros_recorridos++;
            System.out.println(this.getName() + ": " + metros_recorridos);
        }
        Main.leaderboard.add(this);
    }
}
