package Tema6.Temperaturas;

import java.util.Scanner;

public class E6_1_Main {
    public static void main(String[] args) {
        int opcion = 0;
        do {
            imprimirMenu();
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            /*System.out.println("Dame la temperatura");
            double tempreatura = sc.nextDouble();*/
            switch (opcion) {
                case 1:

                    f1(sc/*, temperatura*/);
                    break;
                case 2:
                    f2(sc/*, temperatura*/);
                    break;
                case 3:
                    System.out.println("Ha elegido Salir.");
                    break;
                default:
                    System.out.println("Debes poner un número del 1 al 3.");
            }
        } while (opcion != 3);
    }

    private static void f1(Scanner sc/*, double temperaturaC*/) {
        /*1.- Paso de ºC a ºF.*/
        System.out.print("Dame la temperatura en ºC: ");
        double temperaturaC = sc.nextDouble();
        double temperaturaF = Temperatura.celsiusToFarenheit(temperaturaC);
        System.out.println("La temperatura en ºF es " + temperaturaF);
    }

    private static void f2(Scanner sc/*, double temperaturaF*/) {
        /*2.- Paso de ºF a ºC.*/
        System.out.print("Dame la temperatura en ºF: ");
        double temperaturaF = sc.nextDouble();
        double temperaturaC = Temperatura.farenheitTocelsius(temperaturaF);
        System.out.println("La temperatura en ºC es " + temperaturaC);
    }

    static void imprimirMenu() {
        System.out.println("Menú de conversión de temperaturas:");
        System.out.println("1.- Paso de ºC a ºF.");
        System.out.println("2.- Paso de ºF a ºC.");
        System.out.println("3.- Salir.");
        System.out.print("¿Qué quieres hacer? ");
    }
}

