package Tema2;

import java.util.Scanner;

public class E2_2_3NumerosMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es el mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " es el mayor");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " es el mayor");
        } else {
            System.out.println("Son iguales");
        }

    }
}
