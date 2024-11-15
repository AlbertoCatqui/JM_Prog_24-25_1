package Tema3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E3_57_longitudNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        String num = sc.nextLine();
        System.out.println(num + " tiene " + num.length() + " digitos");
    }
}
