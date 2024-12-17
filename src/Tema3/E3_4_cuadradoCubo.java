package Tema3;

public class E3_4_cuadradoCubo {
    public static void main(String[] args) {
        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
        }
        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = numero[i] * numero[i];
        }
        for (int i = 0; i < cubo.length; i++) {
            cubo[i] = numero[i] * numero[i] * numero[i];
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i] + " | " + cuadrado[i] + " | " + cubo[i]);
        }

    }
}
