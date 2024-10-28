package Tema2;

import java.util.Scanner;

public class E2_2_MayorEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Introduce tu edad: ");
            int edad = sc.nextInt();
            if (edad >= 18 && edad < 115) {
                System.out.println("Eres mayor de edad");
                break;
            } else if (edad < 18 && edad > 1) {
                System.out.println("Eres menor de edad");
                break;
            } else if (edad > 115 || edad < 1) {
                System.out.println("No mientas.");
            }
        }
    }
}
