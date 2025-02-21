package Tema6.Vehiculos;

public class Bicicleta extends Vehiculo {

    Bicicleta(String marca, String color) {
        super(marca, color);
    }

    public void caballito() {
        System.out.println("*Hace un caballito*");
    }

    public void derrapar() {
        System.out.println("*Hace un derrape*");
    }

}
