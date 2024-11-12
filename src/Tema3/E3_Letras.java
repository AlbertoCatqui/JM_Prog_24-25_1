package Tema3;

import java.util.Scanner;

public class E3_Letras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra");
        char letra = sc.next().charAt(0);
        switch (letra) {
            case 'a':
            case 'A':
                System.out.println("Es la A");
                break;
            case 'e':
            case 'E':
                System.out.println("Es la E");
                break;
            default:
                System.out.println("Es otro caracter");
        }
    }
}
