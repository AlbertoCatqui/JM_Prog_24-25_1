package Tema3;

import java.util.Scanner;

public class E3_18_cuentaAtras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número positivo desde el cual empezará la cuenta atrás:");
        int num = sc.nextInt();
        if (num > 0) {
            for (int i = num; i > 0; i--) {
                System.out.print(" " + i);
            }
        } else if (num < 0) {
            for (int i = num; i < 0 + 1; i++) {
                System.out.print(" " + i);
            }
        } else {
            System.out.println("0 no es un número válido");
        }

    }
}
