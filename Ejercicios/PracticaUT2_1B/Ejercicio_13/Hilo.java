package Ejercicios.PracticaUT2_1B.Ejercicio_13;

import javax.swing.*;
import java.util.ArrayList;

public class Hilo extends Thread {
    public String nombre;
    public String linea;

    public Hilo(String nombre, String linea) {
        super(nombre);
        this.linea = linea;
    }

    @Override
    public void run() {
        String[] notas = linea.trim().split(" ");
        float suma = 0;
        for (String nota: notas) {
            suma += Float.parseFloat(nota);
        }
        System.out.println(this.getName()+ ": " + suma/notas.length);
    }
}
