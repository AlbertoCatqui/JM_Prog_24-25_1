package Tema3;

import java.util.Scanner;

public class E3_65_100Siguientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introcuce un número positivo:");
        while (true) {
            double num = sc.nextDouble();
            double num2;
            if (num >= 0) {
                for (int i = 1; i <= 100; i++) {
                    num2 = num + i;
                    System.out.println(num2);
                    num = num + num2;
                }
                System.out.println(num);
            } else {
                System.out.println("Ese número no es positivo, vuelve a introducir un número.");
            }

            break;
        }
    }
}
