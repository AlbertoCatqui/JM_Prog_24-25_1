package Tema5;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class entornos4_1 {
    public static void main(String[] args) {


        int vueltas = 5000000;
        long horaInicio = System.currentTimeMillis();

        
        try {
            File fw = new File("Prueba2.txt");
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < vueltas; i++) {
                pw.println("Línea 2");
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("tiempo " + (System.currentTimeMillis() - horaInicio));
    }
}
