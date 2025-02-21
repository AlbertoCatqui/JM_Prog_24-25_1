package Tema6.Vehiculos;

public class Coche extends Vehiculo {
    private boolean luces;

    Coche(String marca, String color) {
        super(marca, color);
        this.luces = false;
    }

    public void quemarRueda() {
        System.out.println("*Quema rueda*");
    }

    public void encenderLuces() {
        System.out.println("Enciende las luces");
        this.luces = true;
    }

    public void apagarLuces() {
        System.out.println("Apaga las luces");
        this.luces = false;
    }

    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }
}
