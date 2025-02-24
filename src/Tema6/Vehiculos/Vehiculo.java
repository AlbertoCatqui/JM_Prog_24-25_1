package Tema6.Vehiculos;

public class Vehiculo {
    private String marca;
    private String color;
    private int KilometrosRecorridos;
    private static int kilometrosTotales;
    private static int vehiculosCreados;

    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
        vehiculosCreados++;
    }

    public void moverse() {
        System.out.println("El vehiculo se mueve");
        KilometrosRecorridos = KilometrosRecorridos + 10;
        this.moverseTotal();
    }

    public static void moverseTotal() {
        kilometrosTotales = kilometrosTotales + 10;
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
