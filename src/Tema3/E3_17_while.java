package Tema3;

import java.util.Scanner;

public class E3_17_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();
        while (num >= 0) {
            System.out.print(" " + num);
            num--;
        }
    }
}

