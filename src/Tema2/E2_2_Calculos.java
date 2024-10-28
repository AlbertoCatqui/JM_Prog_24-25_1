package Tema2;

import java.util.Scanner;

public class E2_2_Calculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        double num = sc.nextDouble();
        System.out.println("Introduce el segundo número");
        double num2 = sc.nextDouble();
        System.out.println("La suma de ambos números es: " + (int) (num + num2));
        System.out.println("La resta de ambos números es: " + (int) (num - num2));
        System.out.println("La multiplicación de ambos es: " + (int) (num * num2));
        System.out.println("La división de ambos es: " + (num / num2));
    }
}
