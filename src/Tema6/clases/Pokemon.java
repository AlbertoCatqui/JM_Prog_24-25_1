package Tema6.clases;

public class Pokemon {
    /* Atributos */
    private String nombre;
    private String mote;
    private String tipo;
    private int posicion;
    private int vida;
    private int ataque;
    private boolean debilitado;
    private static int contador = 0;

    /* Constructor */
    public Pokemon() {
        int ranPok = (int) (Math.floor(Math.random() * (5 - 1 + 1) + 1));
        switch (ranPok) {
            case 1:
                this.nombre = "Pidgey";
                this.tipo = "Volador";
                this.posicion = 1;
                this.vida = 10;
                this.ataque = 4;
                this.debilitado = false;
                break;
            case 2:
                this.nombre = "Geodude";
                this.tipo = "Roca";
                this.posicion = 3;
                this.vida = 30;
                this.ataque = 3;
                this.debilitado = false;
                break;
            case 3:
                this.nombre = "Dratini";
                this.tipo = "Dragón";
                this.posicion = 2;
                this.vida = 15;
                this.ataque = 7;
                this.debilitado = false;
                break;
            case 4:
                this.nombre = "Jinx";
                this.tipo = "Hielo";
                this.posicion = 4;
                this.vida = 20;
                this.ataque = 4;
                this.debilitado = false;
                break;
            case 5:
                this.nombre = "Zubat";
                this.tipo = "Veneno";
                this.posicion = 5;
                this.vida = 12;
                this.ataque = 4;
                this.debilitado = false;
                break;
        }
        System.out.println("Un " + this.nombre + " salvaje apareció en la posición " + this.posicion);
    }

    /* Constructor primer bixo */
    public Pokemon(String nombre, String mote, String tipo, int vida, int ataque) {
        this.nombre = nombre;
        this.mote = mote;
        this.tipo = tipo;
        this.posicion = 0;
        this.vida = vida;
        this.ataque = ataque;
        this.debilitado = false;
        System.out.println("Has creado a " + mote + ", un " + nombre + " de tipo " + tipo + " y esta en la posición " + posicion);
    }


    /* Metodos */
    // Se mueve el pokemon
    public void moverPositivo(Pokemon Pokemon) {
        if (Pokemon.isDebilitado() == false) {
            posicion++;
            System.out.println(Pokemon.getNombre() + " se ha movido hasta la posición " + Pokemon.getPosicion());
        } else {
            System.out.println("No puede moverse porque esta debilitado.");
        }
    }

    public void moverNegativo(Pokemon Pokemon) {
        if (Pokemon.isDebilitado() == false) {
            posicion--;
            System.out.println(Pokemon.getNombre() + " se ha movido hasta la posición " + Pokemon.getPosicion());
        } else {
            System.out.println("No puede moverse porque esta debilitado.");
        }
    }

    //Un pokemon ataca
    public void atacarPokemon(Pokemon victima, Pokemon atacante) {
        if (atacante.isDebilitado() == false && atacante.getPosicion() == victima.getPosicion()) {
            System.out.println(atacante.getMote() + " ha atacado al " + victima.getNombre() + " enemigo.");
            victima.setVida(victima.getVida() - atacante.getAtaque());
            if (victima.getVida() < 0) {
                victima.setVida(0);
                System.out.println("El " + victima.getNombre() + " se ha debilitado");
            } else {
                System.out.println("El " + victima.getNombre() + " tiene " + victima.getVida() + " vidas");
            }
        } else if (atacante.isDebilitado() == true) {
            System.out.println("Tu pokémon no puede atacar porque esta debilitado");
        } else if (atacante.getPosicion() != victima.getPosicion()) {
            System.out.println("Tu pokémon no puede atacar porque no esta en la misma posición que el pokemon salvaje");
        }
    }

    public void atacarSalvaje(Pokemon victima, Pokemon atacante) {
        if (atacante.getPosicion() == victima.getPosicion()) {
            System.out.println("El " + atacante.getNombre() + " ha atacado a " + victima.getMote());
            victima.setVida(victima.getVida() - atacante.getAtaque());
            if (victima.getVida() <= 0) {
                victima.setVida(0);
                victima.setDebilitado(true);
                System.out.println(victima.getMote() + " se ha debilitado");
            } else {
                System.out.println(victima.getMote() + " tiene " + victima.getVida() + " vidas");
            }
        } else {
            System.out.println("El pokémon salvaje no puede atacar porque no esta en la misma posición que tu pokémon");
        }
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + '/' + "tipo1=" + tipo + '/' + "posicion=" + posicion + '/' + "vida=" + vida + '}';
    }
    /* Métodos get y set*/

    public String getNombre() {
        return nombre;
    }



    public String getMote() {
        return mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public String getTipo() {
        return tipo;
    }


    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pokemon.contador = contador;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public boolean isDebilitado() {
        return debilitado;
    }

    public void setDebilitado(boolean debilitado) {
        this.debilitado = debilitado;
    }
}


