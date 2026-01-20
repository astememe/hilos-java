package Gestion_Hilos;

public class Main {
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo("Piero", 5);
        Hilo hilo2 = new Hilo("Isamir", 8);
        Hilo hilo3 = new Hilo("Joshua", 3);

        hilo2.start();
        hilo1.start();
        hilo3.start();
    }
}
