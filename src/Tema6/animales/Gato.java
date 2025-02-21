package Tema6.animales;

public class Gato extends Mamifero {
    private String raza;

    public Gato(String nombre, int edad, int peso, boolean esHerbivoro, boolean esCarnivoro, String colorPelo, String raza) {
        super(nombre, edad, peso, esHerbivoro, esCarnivoro, colorPelo);
        this.raza = raza;
        System.out.println("Este gato se llama " + nombre + ", tiene " + edad + " años y es de color " + colorPelo);
    }

    public void maullar() {
        System.out.println(this.getNombre()+" procede a emitir maullido");
    }

    public void saltar() {
        System.out.println("Coño, como salta el gato");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
