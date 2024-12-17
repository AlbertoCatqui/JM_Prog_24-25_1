package Tema3;

import java.util.Scanner;

public class E3_5_rotacionArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[15];
        System.out.println("Introduce 15 numeros para rotarlos por el array.");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        int save = 0;
        int saveDelSave = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("----------");
        for (int i = 0; i < numeros.length - 1; i++) {
            save = numeros[i + 1];
            numeros[i + 1] = saveDelSave;
            saveDelSave = save;
        }
        numeros[0] = saveDelSave;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
