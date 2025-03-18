public class examenEntornos {

    public static void main(String[] args) {
        double horaInicial = System.currentTimeMillis();
        int j = 0;
        for (int i = 0; i < 1000000; i++) {
            do {
                j++;
            } while (j < 100);

        }
        System.out.println("tiempo = " + (System.currentTimeMillis() - horaInicial));
    }

/*
        do {
                j++;
            } while (j < 100);
            */
    /*
    while (j < 100) {
                j++;
            }
     */
}
