package monitor;

public class BufferMonitor {
    private int almacenaje;
    private boolean estaLleno = false;

    public synchronized void producir(int valor) throws InterruptedException {
        while (estaLleno) {
            wait();
        }
        almacenaje = valor;
        System.out.println("El productor produce " + valor);
        estaLleno = true;
        notifyAll();
//        if (almacenaje > 5) {
//            estaLleno = true;
//            notifyAll();
//        }
    }

    public synchronized int consumir() throws InterruptedException {
        while (!estaLleno) {
            wait();
        }
        int valor = almacenaje;
        System.out.println("El consumidor toma " + valor);
        estaLleno = false;
        return valor;
    }
}
