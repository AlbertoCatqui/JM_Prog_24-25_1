package Tema3;

import java.util.Scanner;

public class E3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número.");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Es par");
        } else if (num % 2 != 0) {
            System.out.println("Es impar");
        } else if (num == 0) {
            System.out.println("Es par");
        }
    }
}
