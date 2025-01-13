package Tema4;

import java.util.Scanner;

public class E4_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de columnas: ");
        int[][] numeros = new int[5][sc.nextInt()];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.floor(Math.random() * (10 - 1 + 1) + 1));
                ;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
                ;
            }
            System.out.println("");
        }
    }
}
