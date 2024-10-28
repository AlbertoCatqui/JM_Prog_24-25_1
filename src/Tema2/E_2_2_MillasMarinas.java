package Tema2;

import java.util.Scanner;

public class E_2_2_MillasMarinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la distancia de millas marinas que quieres convertir a metros:");
        double miles = sc.nextDouble();
        System.out.println(miles + " millas marinas equivalen a " + miles * 1852 + " metros");
    }
}
