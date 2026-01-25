package Ejercicios.Practica3_1.Ejercicio_2;

public class Hilo extends Thread {
    public Hilo(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + ": Hola Mundo");
    }
}
