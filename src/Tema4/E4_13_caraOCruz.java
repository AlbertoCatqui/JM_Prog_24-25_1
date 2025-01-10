package Tema4;

public class E4_13_caraOCruz {
    public static void main(String[] args) {
        int tiradas[] = new int[50];
        int contCara = 0;
        int contCruz = 0;
        System.out.println("Si sale 1 es cara si sale 2 es cruz");
        for (int i = 0; i < 50; i++) {
            int coin = (int) (Math.round(Math.random() + 1));
            System.out.println(coin + " ");

            tiradas[i] = coin;
        }
        for (int i = 0; i < 50; i++) {
            if (tiradas[i] == 1) {
                contCara++;
            }
            if (tiradas[i] == 2) {
                contCruz++;
            }
        }
        int porcentajeCruz = (contCruz * 100) / 50;
        int porcentajeCara = (contCara * 100) / 50;
        System.out.println("Hay " + contCara + " caras");
        System.out.println("Hay " + contCruz + " cruces");
        System.out.println("Hay un " + porcentajeCara + "% de caras");
        System.out.println("Hay un " + porcentajeCruz + "% de cruces");
    }
}
