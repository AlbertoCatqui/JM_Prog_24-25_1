package Tema6.animales;

public class Perro extends Mamifero {

    private String raza;

    public Perro(String nombre, int edad, int peso, boolean esHerbivoro, boolean esCarnivoro, String colorPelo, String raza) {
        super(nombre, edad, peso, esHerbivoro, esCarnivoro, colorPelo);
        this.raza = raza;
        System.out.println("Este perro se llama " + nombre + ", tiene " + edad + " años y es de raza " + raza);
    }

    public void Ladrar() {
        System.out.println("*sonido de ladrido*");
        System.out.println("Recórcholis que susto ma dao el perro");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}

