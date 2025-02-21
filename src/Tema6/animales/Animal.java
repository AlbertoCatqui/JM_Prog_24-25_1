package Tema6.animales;

public class Animal {
    private String nombre;
    private int edad;
    private int peso;

    public Animal(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public void andar() {
        System.out.println(nombre + " procede a andar");
    }

    public void comer() {
        System.out.println(nombre + " procede a comer");
    }

    public void dormir() {
        System.out.println(nombre + " procede a dormir");
    }


    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
