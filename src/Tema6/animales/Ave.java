package Tema6.animales;

public class Ave extends Animal {
    private String colorPlumas;

    private String tamañoPico;

    public Ave(String nombre, int edad, int peso, String tamañoPico, String colorPlumas) {
        super(nombre, edad, peso);
        this.tamañoPico = tamañoPico;
        this.colorPlumas = colorPlumas;
    }

    public void volar() {
        System.out.println("Caramba, si está volando");
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public String getTamañoPico() {
        return tamañoPico;
    }

    public void setTamañoPico(String tamañoPico) {
        this.tamañoPico = tamañoPico;
    }
}

