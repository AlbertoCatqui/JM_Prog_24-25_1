package Tema3;

import java.util.Scanner;

public class E3_55_cajaFuerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 1234;
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce la contraseña de la caja fuerte");
            int pass1 = sc.nextInt();
            if (pass1 == password) {
                System.out.println("Contraseña correcta. Caja abierta");
                break;
            } else if (i < 3) {
                System.out.println("Contraseña incorrecta, intentelo de nuevo");
                System.out.println("Quedan " + (3 - i) + " intentos");
            } else {
                System.out.println("Sen han acabado los intentos.Caja bloqueada");
            }
        }
    }
}
