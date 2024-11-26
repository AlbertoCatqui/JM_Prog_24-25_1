package examen1Ev;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej1AlbertoCatalina {
    public static void main(String[] args) {
        /* Programa para darse de alta en un banco */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la plataforma de Dinero S.L.");
        System.out.println("Introduzca su año de nacimiento:");
        String trabajo = "";
        String nombreTutor = "Default";
        int año = sc.nextInt();
        sc.nextLine();  //sino entra el intro
        int edad = 2024 - año; //Variable para no tener que restar los años para sacar la edad
        if (año > 2006) {   //if para sacar menor de edad
            System.out.println("Se deben tener como mínimo 18 años para darse de alta.");
            System.out.println("No se le ha dado de alta.");
        } else if (año <= 2006) {   //mayor de edad
            if (edad < 25) {    //tutor/trabajo
                System.out.println("Necesita ingresar el nombre de su tutor legal:");
                nombreTutor = sc.nextLine();
            } else if (edad >= 24) {
                System.out.println("De que trabaja:");
                trabajo = sc.nextLine();
                if (trabajo == "") {
                    System.out.println("Necesita ingresar el nombre de su tutor legal:");
                    nombreTutor = sc.nextLine();
                }
            }
            System.out.println("Ingrese la provincia donde reside");
            String provincia = sc.nextLine();
            if (provincia.compareTo("Valladolid") < 0 || provincia.compareTo("Valladolid") > 0) {
                provincia = "Palencia";
            }
            System.out.println("Sus datos son los siguientes:");
            System.out.println("Año de nacimiento: " + año);
            if (nombreTutor != "Default") {
                System.out.println("Nombre de tutor legar: " + nombreTutor);
            }
            if (trabajo != "") {
                System.out.println("Trabajo: " + trabajo);
            }
            System.out.println("Provincia: " + provincia);
        }
        System.out.println("¿Son los datos correctos? (S/N)");
        char confirmacion = sc.next().charAt(0);
        if (confirmacion == 'S' || confirmacion == 's') {
            System.out.println("Se le ha dado de alta");
        } else if (confirmacion == 'N' || confirmacion == 'n') {
            System.out.println("No se le ha dado de alta");
        } else {
            System.out.println("Opcion para confirmación no válida. No se le ha dado de alta");
        }
    }
}
