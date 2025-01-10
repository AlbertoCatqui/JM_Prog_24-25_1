package Tema4;

import java.util.Scanner;

public class E4_12_CaraOCruz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            System.out.println("Cara (1) o cruz (2)");
            int guess = sc.nextInt();
            int coin = (int) (Math.round(Math.random() + 1));
            System.out.println("ha salido " + coin);
            if (coin == guess) {
                System.out.println("Has ganado");
            } else {
                System.out.println("mas suerte la proxima");
            }
        }
    }
}
