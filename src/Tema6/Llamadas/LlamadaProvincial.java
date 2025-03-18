package Tema6.Llamadas;

public class LlamadaProvincial extends Llamadas{
    private static int costeMinutoFranja1=20;
    private static int costeMinutoFranja2=25;
    private static int costeMinutoFranja3=30;

    public LlamadaProvincial(int numeroOrigen, int numeroDestino, double duracion) {
        super(numeroOrigen, numeroDestino, duracion);
    }

    @Override
    public double coste() {
        double aleatorio = Math.random()*4;
        if(aleatorio<1)
            return duracion*costeMinutoFranja1;
        else if (aleatorio<2)
            return duracion*costeMinutoFranja2;
        else
            return duracion*costeMinutoFranja3;
    }
}

