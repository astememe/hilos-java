package Ejercicios.Practica3_1.Ejercicio_4;

public class Hilo extends Thread {
    int limite;

    public Hilo(String nombre, int limite) {
        super(nombre);
        this.limite = limite;
    }

    @Override
    public void run() {
        for (int i = 0; i < limite; i++) {
            System.out.println(getName()+ ": " + i);
        }
    }
}
