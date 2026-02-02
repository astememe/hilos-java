package Ejercicios.PracticaUT2_1B.Ejercicio_13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\ememe\\Desktop\\Clase\\PSP\\Hilos\\Ejercicios\\PracticaUT2_1B\\Ejercicio_13\\notas.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linea = bufferedReader.readLine();
        int cont = 1;
        while (linea != null) {
            Hilo alumno = new Hilo("Alumno " + cont, linea);
            alumno.start();
            linea = bufferedReader.readLine();
            cont++;
        }
    }
}
