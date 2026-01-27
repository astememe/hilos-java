package monitor.MonitorDeTartas;

public class Cliente extends Thread {
    String nombre;
    Vitrina vitrina;
    int cantidadComprada;

    public Cliente(Vitrina vitrina, String nombre, int cantidadComprada) {
        super(nombre);
        this.vitrina = vitrina;
        this.nombre = nombre;
        this.cantidadComprada = cantidadComprada;
    }

    @Override
    public void run() {
        for (int i = 0; i < cantidadComprada; i++) {
            try {
                vitrina.comprar(nombre);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
