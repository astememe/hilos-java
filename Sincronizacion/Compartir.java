package Sincronizacion;

public class Compartir {
    public static void main(String[] args) {
        Contador contador = new Contador(100);
        HiloSumador hS = new HiloSumador("Sumador", contador);
        HiloRestador hR = new HiloRestador("Restador", contador);

        hS.start();
        hR.start();
    }
}
