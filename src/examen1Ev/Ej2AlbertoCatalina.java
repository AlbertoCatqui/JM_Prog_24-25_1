package examen1Ev;

import java.util.Scanner;

public class Ej2AlbertoCatalina {
    public static void main(String[] args) {
        /* Programa menú cuenta atrás y múltiplos */
        Scanner sc = new Scanner(System.in);
        boolean salida = true;  //Declaración de variables
        int numMult;
        int num1;
        int num2;
        while (salida == true) {    //Bucle del menú
            System.out.println("_____________________________________________________________");
            System.out.println("Bienvenido al menú del programa de cálculo y cuenta atrás");
            System.out.println("Introduzca una opción: ");
            System.out.println("1. Calcular múltiplos de 5");
            System.out.println("2. Cuenta atrás");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            switch (opcion) {   //condicional
                case 1: //multiplos
                    System.out.println("Introduce el número hasta el que quieres los múltiplos de 5: (Debe ser mayor o igual que 5)");
                    numMult = sc.nextInt();
                    if (numMult >= 5) {
                        for (int i = 1; i < numMult + 1; i++) {
                            if (i % 5 == 0) {
                                System.out.print(i + " ");

                            }
                        }
                    } else {
                        System.out.println("El número debe ser igual o mayor que 5.");
                    }
                    System.out.println(" ");
                    break;
                case 2: //Cuenta atrás
                    System.out.println("Introduzca el primer número");
                    num1 = sc.nextInt();
                    System.out.println("Introduzca el segundo número");
                    num2 = sc.nextInt();
                    if (num1 > num2) {
                        while (num1 >= num2) {
                            System.out.println(num1);
                            num1--;
                        }
                    } else if (num2 > num1) {
                        while (num2 >= num1) {
                            System.out.println(num2);
                            num2--;
                        }
                    } else {
                        System.out.println("Son iguales");
                    }
                    break;
                case 3: //Salida
                    salida = false;
                    break;
                default:    //Si meten otras opciones no contempladas
                    System.out.println("Opcion no válida");
            }
        }
    }
}
