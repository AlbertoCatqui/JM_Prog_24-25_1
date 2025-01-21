package Tema5;

import java.util.Scanner;

public class tal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número positivo desde el cual empezará la cuenta atrás:");
        int n = sc.nextInt();
        tal(n);
    }

    public static void tal(int n) {
        if (n > 0) {
            for (int i = n; i > 0; i--) {
                System.out.print(" " + i);
            }
        } else if (n < 0) {
            for (int i = n; i < 0 + 1; i++) {
                System.out.print(" " + i);
            }
        } else {
            System.out.println("0 no es un número válido");
        }
    }
}
