package Tema2;

import java.util.Scanner;

public class E2_2_AreasFiguras {
    public static void main(String[] args) {
        boolean out = true;
        Scanner sc = new Scanner(System.in);
        while (out == true) {
            System.out.println("Elie que de que figura quieres calcular el área: 1 cuadrado | 2 Rectángulo | 3 Triángulo | 4 Círculo");
            int option = sc.nextInt();
            if (option == 1) {
                System.out.println("Has elegido cuadrado");
                System.out.println("intoduce el lado en cm:");
                int ladoC = sc.nextInt();
                System.out.println("El área del cuadrado es: " + (ladoC * ladoC) + "cm²");
                out = false;
            } else if (option == 2) {
                System.out.println("Has elegido rectángulo");
                System.out.println("intoduce el primer lado en cm:");
                int ladoR1 = sc.nextInt();
                System.out.println("intoduce el segundo lado en cm:");
                int ladoR2 = sc.nextInt();
                System.out.println("El área del rectángulo es: " + (ladoR1 * ladoR2) + "cm²");
                out = false;
            } else if (option == 3) {
                System.out.println("Has elegido triángulo");
                System.out.println("intoduce la base en cm:");
                int baseT = sc.nextInt();
                System.out.println("intoduce la altura en cm:");
                int HeightT = sc.nextInt();
                System.out.println("El área del triángulo es: " + ((baseT * HeightT) / 2) + "cm²");
                out = false;
            } else if (option == 4) {
                System.out.println("Has elegido círculo");
                System.out.println("intoduce el radio en cm:");
                double radiusC = sc.nextDouble();
                System.out.println("El área del círculo es: " + ((radiusC * radiusC) * Math.PI) + "cm²");
                out = false;
            } else {
                System.out.println("Número equivocado.");
            }
        }
    }
}