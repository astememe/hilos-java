package sleephilos;

public class Dormible extends Thread {

    public Dormible(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(this.getName() + " " + i);
        }
    }
}
