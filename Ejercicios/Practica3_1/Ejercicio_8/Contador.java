package Ejercicios.Practica3_1.Ejercicio_8;

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
