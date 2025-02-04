package Tema6.clases;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemonPropio = new Pokemon("Butifarra", "Amarillo", "Eléctrico");
        Pokemon pokemonVictima1 = new Pokemon("Membrillo", "Gris", "Acero");
        Pokemon pokemonVictima2 = new Pokemon("Bujía", "Morado", "Psiquico");
        System.out.println("Mi pokemon: " + pokemonPropio.getNombre());
        System.out.println(" -Tipo: " + pokemonPropio.getTipo());
        System.out.println(" -Color: " + pokemonPropio.getColor());
        System.out.println(" -Posicion: " + pokemonPropio.getPosicion());


        for (int i = 0; i < 10; i++) {
            pokemonPropio.mover();
        }

        pokemonPropio.setColor("Naranja");

        System.out.println("Mi pokemon: " + pokemonPropio.getNombre());
        System.out.println(" -Tipo: " + pokemonPropio.getTipo());
        System.out.println(" -Color: " + pokemonPropio.getColor());
        System.out.println(" -Posicion: " + pokemonPropio.getPosicion());
    }
}
