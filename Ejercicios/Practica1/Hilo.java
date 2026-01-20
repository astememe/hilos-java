package Ejercicios.Practica1;

public class Hilo extends Thread {
    Contador contador;
    public Hilo(String nombre, Contador contador) {
        this.setName(nombre);
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            contador.incrementar();
        }
        System.out.println(getName() + " " + contador.getValor());
    }
}
