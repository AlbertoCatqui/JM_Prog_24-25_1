package Tema6.Vehiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        Bicicleta b1 = new Bicicleta("nose", "rojo");
        Coche c1 = new Coche("fiat", "negro");
        while (continuar) {
            System.out.println("Introduce la opcion que quieras:");
            System.out.println("1 Avanzar con la bici");
            System.out.println("2 Hacer un caballito con la bici");
            System.out.println("3 Avanzar con el coche");
            System.out.println("4 Quemar rueda con el coche");
            System.out.println("5 Ver kilometraje bici");
            System.out.println("6 Ver kilometraje coche");
            System.out.println("7 Ver kilometraje total");
            System.out.println("8 Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    b1.moverse();
                    break;
                case 2:
                    b1.caballito();
                    break;
                case 3:
                    c1.moverse();
                    break;
                case 4:
                    c1.quemarRueda();
                    break;
                case 5:
                    b1.getKilometrosRecorridos();
                    break;
                case 6:
                    c1.getKilometrosRecorridos();
                    break;
                case 7:
                    c1.getKilometrosTotales();
                    break;
                case 8:
                    continuar = false;
                    break;
                default:
                    break;
            }
        }
    }
}