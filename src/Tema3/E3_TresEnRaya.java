package Tema3;

import java.util.Scanner;

public class E3_TresEnRaya {
    public static void main(String[] args) {
        /*Variables*/
        Scanner sc = new Scanner(System.in);
        char var1 = ' ';
        char var2 = ' ';
        char var3 = ' ';
        char var4 = ' ';
        char var5 = ' ';
        char var6 = ' ';
        char var7 = ' ';
        char var8 = ' ';
        char var9 = ' ';
        char varJugador = 'x';

        /*Entrada al programa*/
        System.out.println("Bienvenido al 3 en raya.");

        /*Bucle de 9 repeticiones*/
        for (int i = 0; i < 9; i++) {
            /*Representación del tablero y a qué jugador le toca*/
            System.out.println("|" + var1 + "|" + var2 + "|" + var3 + "|");
            System.out.println("|" + var4 + "|" + var5 + "|" + var6 + "|");
            System.out.println("|" + var7 + "|" + var8 + "|" + var9 + "|");
            System.out.println("Turno del jugador: " + varJugador);

            /*Pregunta sobre la posición y rellenado de dicha posición*/
            System.out.print("Dame la posición que quieres poner (1-9 y libre): ");
            int casilla = sc.nextInt();
            switch (casilla) {
                case 1:
                    var1 = varJugador;
                    break;
                case 2:
                    var2 = varJugador;
                    break;
                case 3:
                    var3 = varJugador;
                    break;
                case 4:
                    var4 = varJugador;
                    break;
                case 5:
                    var5 = varJugador;
                    break;
                case 6:
                    var6 = varJugador;
                    break;
                case 7:
                    var7 = varJugador;
                    break;
                case 8:
                    var8 = varJugador;
                    break;
                case 9:
                    var9 = varJugador;
                    break;
                default:
                    System.out.println("No has metido una casilla correcta.");
            }

            /*Comprobación de victoria*/
            if (((var1 == var2) && (var2 == var3) && var1 != ' ') ||
                    ((var4 == var5) && (var5 == var6) && var4 != ' ') ||
                    ((var7 == var8) && (var8 == var9) && var7 != ' ') ||
                    ((var1 == var4) && (var4 == var7) && var1 != ' ') ||
                    ((var1 == var5) && (var5 == var9) && var1 != ' ') ||
                    ((var7 == var5) && (var5 == var3) && var7 != ' ') ||
                    ((var2 == var5) && (var5 == var8) && var2 != ' ') ||
                    ((var3 == var6) && (var6 == var9) && var3 != ' ')) {
                /*Alguien ha ganado o estaban vacías*/
                System.out.println("El jugador " + varJugador + " ha ganado.");
                break;
            }

            /*Cambio de jugador*/
            if (varJugador == 'x') {
                varJugador = 'o';
            } else {
                varJugador = 'x';
            }
        }
        /*Representación del tablero final*/
        System.out.println("Así ha quedado el tablero.");
        System.out.println("|" + var1 + "|" + var2 + "|" + var3 + "|");
        System.out.println("|" + var4 + "|" + var5 + "|" + var6 + "|");
        System.out.println("|" + var7 + "|" + var8 + "|" + var9 + "|");

    }
}