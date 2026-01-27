package monitor.MonitorDeTartas;

public class Vitrina {
    private boolean turnoConsumidor = false;
    public String opcion = "";

    public synchronized void hornear(String repostero, String sabor) throws InterruptedException {
        while (turnoConsumidor) {
            wait();
        }

        opcion = sabor;
        System.out.println("El repostero" + repostero + " ha hecho una tarta de " + sabor);
        turnoConsumidor = true;
        notifyAll();
    }

    public synchronized void comprar(String cliente) throws InterruptedException {
        while (!turnoConsumidor) {
            wait();
        }
        System.out.println(cliente+ " ha comprado una tarta de " + opcion);
        opcion = "";
        turnoConsumidor = false;
        notifyAll();
    }
}
