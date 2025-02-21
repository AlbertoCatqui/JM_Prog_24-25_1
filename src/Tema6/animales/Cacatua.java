package Tema6.animales;

public class Cacatua extends Ave {
    public Cacatua(String nombre, int edad, int peso, String tamañoPico, String colorPlumas) {
        super(nombre, edad, peso, tamañoPico, colorPlumas);
        System.out.println("Esta cacatúa se llama " + nombre + ", tiene " + edad + " años y es de color " + colorPlumas);
    }

    public void hablar() {
        System.out.println("Buenas tardes, soy una cacatúa");
    }

    public void ponerHuevo() {
        System.out.println("Puso un huevo efectivamente");
    }
}
