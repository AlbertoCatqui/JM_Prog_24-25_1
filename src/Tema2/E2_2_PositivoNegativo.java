package Tema2;

import java.util.Scanner;

public class E2_2_PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        int num = sc.nextInt();
        if (num >= 0) {
            System.out.println("El numero es positivo");
        } else if (num < 0) {
            System.out.println("El numero es negativo");
        }
    }
}
