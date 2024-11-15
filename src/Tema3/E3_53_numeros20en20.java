package Tema3;

public class E3_53_numeros20en20 {
    public static void main(String[] args) {
        System.out.println("Los numeros del 320 al 160 de 20 en 20 hacia atras");
        int num = 320;
        while (num >= 160) {
            System.out.println(num);
            num = num - 20;
        }
    }
}
