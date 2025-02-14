package Tema6;

import clasesAnimales.*;

public class zoologico {
    public static void main(String[] args) {
        Animal[] array = new Animal[4];

        Leon l = new Leon();
        Loro lr = new Loro();
        Elefante e = new Elefante();
        Pato p = new Pato();

        array[0] = l;
        array[1] = lr;
        array[2] = e;
        array[3] = p;
        for (int i = 0; i < array.length; i++) {
            array[i].mostrar();
            if (array[i] instanceof Leon) {
                System.out.println("La posicion " + i + " es un leon.");
            }
        }
/*
        lr.mostrar();
        e.mostrar();
        p.mostrar();
        l.mostrar();
*/
    }
}
