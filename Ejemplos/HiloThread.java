package Ejemplos;

public class HiloThread extends Thread {

    public HiloThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Creación de: " + this);
        System.out.println("\t");
    }

    public static void main(String[] args) {
        System.out.println("INICIO");
        new HiloThread("hilo").start();
        new HiloThread("hilo 2").start();
        System.out.println("FINAL");
    }
}
