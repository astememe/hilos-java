package monitor.MonitorDeTartas;

public class Main {
    public static void main(String[] args) {
        Vitrina vitrina = new Vitrina();
        Repostero r1 = new Repostero(vitrina, "Angelo Cakes", "Nata", 4);
        Repostero r2 = new Repostero(vitrina, "Fruity", "Naranja", 3);
        Repostero r3 = new Repostero(vitrina, "Martínez", "Chocolate", 5);

        Cliente cliente = new Cliente(vitrina, "Fabio", 8);
        Cliente cliente2 = new Cliente(vitrina, "Alba", 4);

        r1.start();
        r2.start();
        r3.start();
        cliente.start();
        cliente2.start();
    }
}
