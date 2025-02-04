package Tema6.clases;

public class Pokemon {
    /* Atributos */
    private String nombre;
    private String color;
    private String tipo;
    private int posicion;

    /* Constructor */

    public Pokemon(String nombre ,String color, String tipo) {
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;
        this.posicion = 0;
        System.out.println("Has creado un pokamion de tipo " + tipo);
    }

    /* Metodos */
    public void mover() {
        posicion++;
    }

    private void atacar(Pokemon victima) {
        /*TAL NOSEQUE*/
    }
    /* Métodos get y set*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}


