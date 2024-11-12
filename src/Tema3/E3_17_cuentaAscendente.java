package Tema3;

import java.util.Scanner;

public class E3_17_cuentaAscendente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();
        for (int i = 1; i < num + 1; i++) {
            System.out.print(" " + i);
        }
    }

}
