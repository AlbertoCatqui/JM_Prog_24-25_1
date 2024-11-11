package Tema3;

import java.util.Scanner;

public class E3_11_diasSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 7 para saber que dia es");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.println("Martes");
        } else if (opcion == 2) {
            System.out.println("Miércoles");
        } else if (opcion == 3) {
            System.out.println("Jueves");
        } else if (opcion == 4) {
            System.out.println("Viernes");
        } else if (opcion == 5) {
            System.out.println("Sábado");
        } else if (opcion == 6) {
            System.out.println("Domingo");
        } else if (opcion == 7) {
            System.out.println("Lunes");
        }

    }
}
