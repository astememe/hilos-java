package sleephilos;

public class Main {
    public static void main(String[] args) {
        Dormible dormible = new Dormible("dormido");
        dormible.start();

        try {
            dormible.sleep(10);
            System.out.println("CLASE MAIN: " + dormible.isAlive());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
