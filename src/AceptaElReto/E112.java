package AceptaElReto;

import java.util.Scanner;

public class E112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia;
        double velocidad;
        double tiempo;
        while (true) {
            distancia = sc.nextDouble();
            velocidad = sc.nextDouble();
            tiempo = sc.nextDouble();
            if (distancia == 0 && velocidad == 0 && tiempo == 0) {
                break;
            } else {
                if (distancia <= 0 && tiempo <= 0) {
                    System.out.println("ERROR");
                    continue;
                }
                if ((distancia / tiempo) * 3.6 <= velocidad) {
                    System.out.println("OK");
                } else if ((distancia / tiempo) * 3.6 > velocidad && (distancia / tiempo) * 3.6 <= velocidad * 1.2) {
                    System.out.println("MULTA");

                } else if ((distancia / tiempo) * 3.6 > velocidad * 1.2) {
                    System.out.println("PUNTOS");
                }

            }
        }
    }
}
