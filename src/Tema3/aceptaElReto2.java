package Tema3;

import java.util.Scanner;

public class aceptaElReto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayplazas = new int[6];
        int casos = 0;
        int resultado;
        int suma = 0;
        System.out.println("Ingresa el numero de casos de prueba");
        casos = sc.nextInt();
        int[] resultados = new int[casos];
        for (int i = 0; i < casos; i++) {
            System.out.println("Ingresa el número de equipos que participan");
            int equipos = sc.nextInt();
            System.out.println("Ingresa las plazas de cada federación");
            for (int j = 0; j < arrayplazas.length; j++) {
                arrayplazas[j] = sc.nextInt();
                suma = suma + arrayplazas[j];
            }
            resultado = equipos - suma;
            resultados[i] = resultado;
            resultado = 0;
            suma = 0;
        }
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(resultados[i]);
        }

    }
}
