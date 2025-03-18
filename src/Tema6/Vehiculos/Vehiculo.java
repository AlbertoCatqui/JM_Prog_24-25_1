package Tema6.Vehiculos;

public class Vehiculo {
    protected String marca;
    protected String color;
    protected int KilometrosRecorridos;
    protected static int kilometrosTotales;
    protected static int vehiculosCreados;

    Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
        vehiculosCreados++;
    }

    public void moverse() {
        System.out.println("El vehiculo se mueve");
        kilometrosTotales = kilometrosTotales + 10;
        KilometrosRecorridos = KilometrosRecorridos + 10;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static void setKilometrosTotales(int kilometrosTotales) {
        Vehiculo.kilometrosTotales = kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return KilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        KilometrosRecorridos = kilometrosRecorridos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
