package Tema2;

import java.util.Scanner;

public class E2_2_NumeroMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("El numero mayor que el numero mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El numero mayor que el numero mayor es: " + num2);
        } else {
            System.out.println("Son iguales");
        }
    }
}
