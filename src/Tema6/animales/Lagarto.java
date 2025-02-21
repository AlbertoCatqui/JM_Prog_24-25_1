package Tema6.animales;

public class Lagarto extends Animal {
    private int largo;
    private int numeroDePatas;

    public Lagarto(String nombre, int edad, int peso, int largo, int numeroDePatas) {
        super(nombre, edad, peso);
        this.largo = largo;
        this.numeroDePatas = numeroDePatas;
        System.out.println("Este lagarto se llama " + nombre + ", tiene " + edad + " años y tiene " + numeroDePatas + " patas");

    }

    public void tomarElSol() {
        System.out.println("Lagarto tomando el sol.");
        System.out.println("Lagartijo Iguana.Lagarto");
    }
}
