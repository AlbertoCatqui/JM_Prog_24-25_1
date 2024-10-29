package Tema2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E2_2_Calificacion {
    public static void main(String[] args) {
        System.out.println("Introduce la nota numérica:");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        if (nota >= 0 && nota < 3) {
            System.out.println("Muy deficiente");
        } else if (nota >= 3 && nota < 5) {
            System.out.println("Insufuciente");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Bien");
        } else if (nota >= 6 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else if (nota < 0 || nota > 10) {
            System.out.println("Nota Invalida");
        }
    }
}
