package Tema4;

public class E4_ejercicioPag144 {
    public static void main(String[] args) {
        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
