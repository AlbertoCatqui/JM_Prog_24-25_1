package Tema6.animales;

public class Pinguino extends Ave {
    private String especie;

    public Pinguino(String nombre, int edad, int peso, String tamañoPico, String colorPlumas, String especie) {
        super(nombre, edad, peso, tamañoPico, colorPlumas);
        this.especie = especie;
        System.out.println("Este pingüino se llama " + nombre + ", tiene " + edad + " años y es de la especie " + especie);

    }

    public void nadar() {
        System.out.println("Mira como nada el bicho madre mia");
    }

    @Override
    public void andar() {
        System.out.println("Que gracioso como anda el pingüino");
    }

    @Override
    public void volar() {
        System.out.println("A ver el pingüino es un ave pero volar lo que es volar pues no vuela");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
