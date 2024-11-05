package Tema2;

import java.util.Scanner;

public class E2_2_Horas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora en el formato HH:MM:SS");
        String horaInicial = sc.nextLine();
        String horasString = horaInicial.substring(0, 2);
        String minutosString = horaInicial.substring(3, 5);
        String segundosString = horaInicial.substring(6, 8);
        int horas = Integer.parseInt(horasString);
        int minutos = Integer.parseInt(minutosString);
        int segundos = Integer.parseInt(segundosString);
        segundos = segundos + 1;
        if (segundos >= 60) {
            minutos = minutos + 1;
            segundos = 0;
        }
        if (minutos >= 60) {
            horas = horas + 1;
            minutos = 0;
        }
        if (horas >= 24) {
            segundos = Integer.parseInt("00");
            minutos = Integer.parseInt("00");
            horas = Integer.parseInt("00");
        }
        System.out.println("La hora final es: " + horas + ":" + minutos + ":" + segundos);
    }
}
