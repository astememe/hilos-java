package Ejercicios.PracticaUT2_1B.Ejercicio_12;

public class Main {
    public static void main(String[] args) {
        Hilo hilopar = new Hilo("Par", "par");
        Hilo hiloimpar = new Hilo("Impar", "impar");

        hiloimpar.start();
        hilopar.start();
    }
}
