package Tema2;

import java.util.Scanner;

public class E2_2_PrecioDescuento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el precio final del producto");
        double finalPrice = sc.nextDouble();
        System.out.println("Introduzca el precio del producto sin descuento");
        double discountPrice = sc.nextDouble();
        double discount = finalPrice / discountPrice;
        System.out.println("El porcentaje de descuento aplicado es de un " + (1 - discount) * 100 + " % de descuento.");
    }
}
