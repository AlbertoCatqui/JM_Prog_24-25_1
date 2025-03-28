package Tema9.E5;

import java.util.HashMap;
import java.util.Scanner;

public class Comunidades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> codigosPostales = new HashMap<>();
        codigosPostales.put(3, "Alicante");
        codigosPostales.put(12, "Castellón");
        codigosPostales.put(46, "Valencia");
        codigosPostales.put(8, "Barcelona");
        codigosPostales.put(17, "Girona");
        codigosPostales.put(25, "Lleida");
        codigosPostales.put(43, "Tarragona");
        codigosPostales.put(22, "Huesca");
        codigosPostales.put(44, "Teruel");
        codigosPostales.put(50, "Zaragoza");
        for (Integer codigo : codigosPostales.keySet()) {
            String nombre = codigosPostales.get(codigo);
            System.out.println(codigo + " - " + nombre);
        }
        System.out.println("Introduce un código postal para saber cual es su provincia");
        int cp = sc.nextInt();
        if (codigosPostales.containsKey(cp)) {
            System.out.println("Provincia: " + codigosPostales.get(cp));
        } else {
            System.out.println("No existe");
        }
        codigosPostales.remove(8);
        codigosPostales.remove(3);
        codigosPostales.remove(50);
        for (Integer codigo : codigosPostales.keySet()) {
            String nombre = codigosPostales.get(codigo);
            System.out.println(codigo + " - " + nombre);
        }
    }
}
