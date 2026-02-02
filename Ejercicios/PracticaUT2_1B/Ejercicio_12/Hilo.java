package Ejercicios.PracticaUT2_1B.Ejercicio_12;

public class Hilo extends Thread {
    public String nombre;
    public String tipo;

    public Hilo(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    @Override
    public void run() {
        int suma = 0;
        if (this.tipo == "par") {
            for (int i = 0; i <= 100; i++) {
                if (i%2 == 0) {
                    suma += i;
                }
            }
        } else {
            for (int i = 0; i <= 100; i++) {
                if (i%2 != 0) {
                    suma += i;
                }
            }
        }
        System.out.println(suma);
    }
}
