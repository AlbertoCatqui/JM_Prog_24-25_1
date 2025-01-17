package Tema4;

public class PruebasEntornos {
    public static void main(String[] args) {
        int vueltas = 5000000; //Un número suficientemente grande
        
        long horaInicio = System.currentTimeMillis();
        for (int i = 0; i < vueltas; i++) {
            long x = 5.1 / 3.2;
        }
        System.out.println("tiempo: " + (System.currentTimeMillis() - horaInicio));
    }
}
