package Tema4;

public class E4_8 {
    public static void main(String[] args) {
        int numeros[] = new int[20];
        int finale[] = new int[20];
        for (int i = 0; i < 20; i++) {
            int ran = (int) Math.floor(Math.random() * (20 - 0 + 1) + 0);
            numeros[i] = ran;
        }
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                finale[i] = numeros[i];
            }
        }
    }
}
