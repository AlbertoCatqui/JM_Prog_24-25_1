package Tema6.Vehiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        Bicicleta b1 = new Bicicleta("nose", "rojo");
        Coche c1 = new Coche("fiat", "negro");
        while (continuar) {
            System.out.println("Introduce la opcion que quieras ejecutar:");
            System.out.println("1 Avanzar con la bici");
            System.out.println("2 Hacer un caballito con la bici");
            System.out.println("3 Avanzar con el coche");
            System.out.println("4 Quemar rueda con el coche");
            System.out.println("5 Ver kilometraje bici");
            System.out.println("6 Ver kilometraje coche");
            System.out.println("7 Ver kilometraje total");
            System.out.println("8 Ver numero de vehiculos");
            System.out.println("9 Salir");
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
                    System.out.println("La bici ha recorrido " + b1.getKilometrosRecorridos() + " km.");
                    break;
                case 6:
                    System.out.println("El coche ha recorrido " + c1.getKilometrosRecorridos() + " km.");
                    break;
                case 7:
                    System.out.println("Los vehículos han recorrido en total " + c1.getKilometrosTotales() + " km.");
                    break;
                case 8:
                    System.out.println("Se han creado " + c1.getVehiculosCreados() + " vehículos.");
                    break;
                case 9:
                    continuar = false;
                    break;
                default:
                    break;
            }
            System.out.println("");
        }
    }
}