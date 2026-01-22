package Ejercicios.Practica2.Ejercicio_6;

public class Contador extends Thread {
    private int contador;
    private String nombre;
    private int limite;

    public Contador(String nombre, int limite) {
        this.nombre = nombre;
        this.limite = limite;
    }

    @Override
    public void run() {
        for (int i = 0; i <= limite; i++) {
            contador = i;
            System.out.println(nombre + ": " + contador);
        }
    }
}
