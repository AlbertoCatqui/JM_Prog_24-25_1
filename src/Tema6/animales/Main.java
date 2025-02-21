package Tema6.animales;

public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Pepito", 3, 7, false, true, "Negro", "Comun europeo");
        gato1.andar();
        gato1.maullar();
        gato1.saltar();

        System.out.println();

        Perro perro1 = new Perro("Membrillo", 2, 3, false, true, "Marron", "Chiguagua");
        perro1.Ladrar();
        perro1.comer();

        System.out.println();

        Cacatua cacatua1 = new Cacatua("Julian", 15, 1, "Mediano", "Blanco");
        cacatua1.hablar();
        cacatua1.ponerHuevo();
        cacatua1.volar();

        System.out.println();

        Pinguino pinguino1 = new Pinguino("Benito", 2, 6, "Mediano", "Negro y Blanco", "Emperador");
        pinguino1.andar();
        pinguino1.nadar();
        pinguino1.volar();

        System.out.println();

        Lagarto lagartijo1 = new Lagarto("Jovanni", 6, 6, 80, 4);
        lagartijo1.tomarElSol();


    }
}
