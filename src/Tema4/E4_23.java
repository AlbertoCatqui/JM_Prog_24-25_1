package Tema4;

public class E4_23 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int random = 0; // (int) (Math.floor(Math.random() * (9 - 1 + 1) + 1));
                boolean repetir = true;
                while (repetir) {
                    for (int k = 0; k < matriz.length; k++) {
                        for (int l = 0; l < matriz[k].length; l++) {
                            if (matriz[k][l] == random) {
                                repetir = false;
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
