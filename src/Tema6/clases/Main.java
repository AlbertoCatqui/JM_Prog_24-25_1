package Tema6.clases;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pokemon Pokemon1 = new Pokemon("Weepinbell", "Butifarra", "Planta", 20, 8);
        System.out.println("Que quieres hacer?. 1 mover pokemon positivo|2 mover pokemon negativo |3 pelear pokemon salvaje|4 Terminar");
        boolean tal = true;
        boolean terminar = true;
        while (terminar == true) {
            Pokemon Salvaje1 = new Pokemon();
            while (terminar == true) {
                int opcion = sc.nextInt();
                if (opcion == 1) {
                    Pokemon1.moverPositivo(Pokemon1);
                    System.out.println("Que quieres hacer ahora? 1 mover pokemon positivo|2 mover pokemon negativo |3 pelear pokemon salvaje|4 Terminar");
                } else if (opcion == 2) {
                    Pokemon1.moverNegativo(Pokemon1);
                    System.out.println("Que quieres hacer ahora? 1 mover pokemon positivo|2 mover pokemon negativo |3 pelear pokemon salvaje|4 Terminar");
                } else if (opcion == 3) {
                    System.out.println("Preparate para el combate");
                    while (true) {
                        if (Pokemon1.isDebilitado() == false) {
                            if (Salvaje1.getVida() > 0 && Pokemon1.getVida() > 0 && Salvaje1.getPosicion() == Pokemon1.getPosicion()) {
                                Pokemon1.atacarPokemon(Salvaje1, Pokemon1);
                            } else if (Salvaje1.getVida() <= 0 || Pokemon1.getVida() <= 0) {
                                break;
                            }
                            if (Salvaje1.getVida() > 0 && Pokemon1.getVida() > 0 && Salvaje1.getPosicion() == Pokemon1.getPosicion()) {
                                Salvaje1.atacarSalvaje(Pokemon1, Salvaje1);
                            } else if (Salvaje1.getVida() <= 0 || Pokemon1.getVida() <= 0) {
                                break;
                            } else {
                                System.out.println("No estan en la misma posición, no pueden pelear.");
                                break;
                            }
                        } else {
                            Pokemon1.atacarPokemon(Salvaje1, Pokemon1);
                            break;
                        }
                    }
                    System.out.println("Que quieres hacer ahora? 1 mover pokemon positivo|2 mover pokemon negativo |3 pelear pokemon salvaje|4 Terminar");
                    break;
                } else {
                    terminar = false;
                }

            }
        }
    }
}
