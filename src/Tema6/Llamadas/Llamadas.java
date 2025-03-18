package Tema6.Llamadas;

public abstract class Llamadas {
    protected int numeroOrigen;
    protected int numeroDestino;
    protected double duracion;

    public abstract double coste();

    public Llamadas(int numeroOrigen, int numeroDestino, double duracion) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Llamadas{" +
                "numeroOrigen=" + numeroOrigen +
                ", numeroDestino=" + numeroDestino +
                ", duracion=" + duracion +
                '}';
    }
}

