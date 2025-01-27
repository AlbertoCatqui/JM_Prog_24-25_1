package Tema5;

import java.util.Scanner;

public class E5_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random;
        int Contadores[] = new int[10];
        System.out.println("Introduce cuantas repeticiones quieres generar");
        int repeticiones = sc.nextInt();
        for (int i = 0; i < repeticiones; i++) {
            random = (int) (Math.floor(Math.random() * (10 - 1 + 1) + 1));
            Contadores[random - 1]++;
        }
        for (int i = 0; i < Contadores.length; i++) {
            System.out.println("El número " + (i + 1) + " ha salido " + Contadores[i] + " veces");
        }
        comprobacion(Contadores);
    }

    public static void comprobacion(int Contadores[]) {
        int mayor = 0;
        int j = 1;
        for (int i = 0; i < Contadores.length - 1; i++) {
            if (Contadores[mayor] > Contadores[j]) {
                mayor = mayor;
            } else {
                mayor = j;
            }
            j++;
        }
        System.out.println("El " + (mayor + 1) + " es el que mas veces ha salido");
    }
}
