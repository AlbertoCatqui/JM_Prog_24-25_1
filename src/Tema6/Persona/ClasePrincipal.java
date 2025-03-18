package Tema6.Persona;

import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cual = sc.nextInt();
        Persona tal[] = new Persona[cual];
        for (int i = 0; i < cual; i++) {
            tal[i] = new Persona("Pepito", "Perez");
        }
    }
}
