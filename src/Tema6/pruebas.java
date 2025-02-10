package Tema6;

public class pruebas {
    public static void main(String[] args) {
        int ranPok = 0;
        for (int i = 0; i < 10; i++) {
            ranPok = (int) (Math.floor(Math.random() * (5 - 1 + 1) + 1));
            System.out.println( ranPok );
        }
    }
}
