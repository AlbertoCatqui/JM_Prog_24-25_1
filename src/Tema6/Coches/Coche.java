package Tema6.Coches;

public class Coche {

    private int velocidad;

    public Coche() {
        this.velocidad = 0;
    }

    public void acelera(int i) {
        this.velocidad = this.velocidad + i;
    }

    public void frena(int i) {
        this.velocidad = this.velocidad - i;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
