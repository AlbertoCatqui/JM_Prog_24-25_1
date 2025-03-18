package Tema6.Llamadas;

public class MainLlamadas {
    static Centralita cen = new Centralita();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int eleccion = (int) (Math.random() * 2);
            int numOri = (int) (Math.random() * 10000000 + 1);
            int numDes = (int) (Math.random() * 10000000 + 1);
            int numSeg = (int) (Math.random() * 100 + 1);
            if (eleccion > 1) {
                LlamadaLocal ll = new LlamadaLocal(numOri, numDes, numSeg);
                cen.alta(ll);
            } else {
                LlamadaProvincial lp = new LlamadaProvincial(numOri, numDes, numSeg);
                cen.alta(lp);
            }
        }
    }
}
