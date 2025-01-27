package Tema5;

import java.util.Scanner;

public class E5_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A que unidades quieres cambiar? 1 Kelvin|2 Celsius");
        if (sc.nextInt() == 1) {
            System.out.println(KtoC());

        } else if (sc.nextInt() == 2) {
            System.out.println(CtoK());
        } else {
            System.out.println("opcion no válida");
        }

    }

    public static double CtoK() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura");
        double C = sc.nextDouble();
        double K = C + 273.15;
        return K;
    }

    public static double KtoC() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura");
        double K = sc.nextDouble();
        double C = 273.15 - K;
        return C;
    }

}
