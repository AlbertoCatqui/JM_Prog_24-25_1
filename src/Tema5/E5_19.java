package Tema5;

import java.util.Scanner;

public class E5_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce que dado quieres tirar");
        int dado = sc.nextInt();
        juegoDado(dado);
    }

    public static void juegoDado(int dado) {
        int ranPlayer = (int) (Math.floor(Math.random() * (dado - 1 + 1) + 1));
        int ranPC = (int) (Math.floor(Math.random() * (dado - 1 + 1) + 1));
        if (ranPlayer > ranPC) {
            System.out.println(ranPlayer + " es mayor que " + ranPC);
            System.out.println("Has ganado");
        } else if (ranPlayer < ranPC) {
            System.out.println(ranPlayer + " es menor que " + ranPC);
            System.out.println("Ha ganado la máquina");
        } else if (ranPlayer == ranPC) {
            System.out.println("Ha salido el mismo resultado ("+ranPlayer+")");
            System.out.println("Nadie gana");
        }
    }
}
