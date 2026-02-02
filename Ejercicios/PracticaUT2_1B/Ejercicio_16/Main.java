package Ejercicios.PracticaUT2_1B.Ejercicio_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el límite inferior: ");
        int limiteinf = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce el límite superior: ");
        int limitesup = Integer.parseInt(sc.nextLine());

        int procesadores = Runtime.getRuntime().availableProcessors();

        int rangoTotal = (limitesup - limiteinf) + 1;
        int numerosPorNucleo = rangoTotal / procesadores;

        ArrayList<Hilo> listaHilos = new ArrayList<>();
        long tiempoInicio = System.currentTimeMillis();

        int inicioActual = limiteinf;

        for (int i = 0; i < procesadores; i++) {
            int finActual;
            if (i == procesadores - 1) {
                finActual = limitesup;
            } else {
                finActual = inicioActual + numerosPorNucleo - 1;
            }

            Hilo hilo = new Hilo(inicioActual, finActual);
            hilo.setName("Hilo " + i);
            listaHilos.add(hilo);
            inicioActual = finActual + 1;
        }

        for (Hilo hilo : listaHilos) {
            hilo.start();
        }

        for (Hilo hilo : listaHilos) {
            hilo.join();
        }

        long tiempoFin = System.currentTimeMillis();
        System.out.println("\nEncontrados primos en: " + (tiempoFin - tiempoInicio) + " ms");
    }
}
