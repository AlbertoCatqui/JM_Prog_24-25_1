package Tema3;

import java.util.Scanner;

public class E3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es el mayor.");
        } else if (num2 > num1) {
            System.out.println(num2 + " es el mayor.");
        } else {
            System.out.println("Son iguales");
        }
    }
}
