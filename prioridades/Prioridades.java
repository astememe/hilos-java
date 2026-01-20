package prioridades;

public class Prioridades extends Thread {
    public Prioridades(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for(int i = 0; i <10; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Prioridades prioridades1 = new Prioridades("Luna");
        Prioridades prioridades2 = new Prioridades("Sol");
        System.out.println(prioridades1.getPriority());
        System.out.println(prioridades2.getPriority());
        prioridades1.setPriority(prioridades1.getPriority() + 3);
        prioridades1.start();
        System.out.println(prioridades1.getPriority());
        prioridades2.start();
    }
}
