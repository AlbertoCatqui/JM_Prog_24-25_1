package Tema3;

import java.util.Scanner;

public class E3_56_tablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número.");
        int num = sc.nextInt();
        int con = 0;
        while (con <= 10) {
            System.out.println(num + " × " + con + " = " + num * con);
            con++;
        }
    }
}
