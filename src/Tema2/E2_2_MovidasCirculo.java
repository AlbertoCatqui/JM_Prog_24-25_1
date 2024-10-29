package Tema2;

import java.util.Scanner;

public class E2_2_MovidasCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio en cm:");
        double rad = sc.nextDouble();
        System.out.println("La longitud de la circunferencia es: " + (2 * Math.PI * rad));
        System.out.println("El área del circulo es: " + (Math.PI * rad * rad));
        System.out.println("El volumen de la esfera es: " + (Math.PI * rad * rad * rad * 4) / 3);
    }
}
