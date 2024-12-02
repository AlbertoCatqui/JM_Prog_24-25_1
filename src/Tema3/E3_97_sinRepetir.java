package Tema3;

public class E3_97_sinRepetir {
    public static void main(String[] args) {
        Integer[] tal;
        tal = new Integer[5];
        for (int i = 0; i < 5; i++) {
            tal[i] = (int) (Math.random() * 49 + 1);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(tal[i] + " ");
        }
    }
}
