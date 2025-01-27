package Tema5;

import java.util.Scanner;

public class E5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los 5 precios");
        double precios[] = new double[5];
        for (int i = 0; i < 5; i++) {
            precios[i] = sc.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Precio sin IVA: " + precios[i] + "---> Precio con IVA: " + calcularIVA(precios[i]));
        }
    }

    public static double calcularIVA(double precioBase) {
        double precioIVA = precioBase * 1.21;

        return precioIVA;
    }
}
