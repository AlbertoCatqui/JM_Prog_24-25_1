package Tema6.animales;

public class Mamifero extends Animal {
    private String colorPelo;
    private boolean esCarnivoro;
    private boolean esHerbivoro;

    public Mamifero(String nombre, int edad, int peso, boolean esHerbivoro, boolean esCarnivoro, String colorPelo) {
        super(nombre, edad, peso);
        this.esHerbivoro = esHerbivoro;
        this.esCarnivoro = esCarnivoro;
        this.colorPelo = colorPelo;
    }

    public boolean isEsHerbivoro() {
        return esHerbivoro;
    }

    public void setEsHerbivoro(boolean esHerbivoro) {
        this.esHerbivoro = esHerbivoro;
    }

    public boolean isEsCarnivoro() {
        return esCarnivoro;
    }

    public void setEsCarnivoro(boolean esCarnivoro) {
        this.esCarnivoro = esCarnivoro;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
}
