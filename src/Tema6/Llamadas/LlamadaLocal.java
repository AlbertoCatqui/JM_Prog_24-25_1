package Tema6.Llamadas;

public class LlamadaLocal extends Llamadas {
    private static int costeMinuto = 15;

    public LlamadaLocal(int numeroOrigen, int numeroDestino, double duracion) {
        super(numeroOrigen, numeroDestino, duracion);
    }


    @Override
    public double coste() {
        return duracion * costeMinuto;
    }

    @Override
    public String toString() {
        return "LlamadaLocal{" +
                "duracion=" + duracion +
                ", numeroDestino=" + numeroDestino +
                ", numeroOrigen=" + numeroOrigen +
                '}';
    }
}
