package Tema5;

import java.util.Scanner;

public class E5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dia");
        int dia = sc.nextInt();
        System.out.println("Introduce mes");
        int mes = sc.nextInt();
        System.out.println("Introduce año");
        int anho = sc.nextInt();
        validarFecha(dia, mes, anho);
    }

    static boolean validarFecha(int dia, int mes, int anho) {
        if (dia > 0 && dia <= 30) {
            if (mes > 0 && mes <= 12) {
                if (anho > 2000 && anho <= 2025) {
                    System.out.println("true");
                    return true;
                } else {
                    System.out.println("false");
                    return false;
                }
            } else {
                System.out.println("false");
                return false;
            }

        } else {
            System.out.println("false");
            return false;
        }
    }
}
