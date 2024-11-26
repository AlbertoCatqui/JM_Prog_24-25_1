package examen1Ev;

import java.util.Scanner;

public class Ej3AlbertoCatalina {
    public static void main(String[] args) {
        /* Programa de contraseña y meter datos */
        Scanner sc = new Scanner(System.in);
        boolean salida = true;  //salida primer while
        boolean salida2 = true; //Salida segundo whila
        String contraseña1 = "hola";    //Contraseñas correctas
        String contraseña2 = "INFO1JM";
        while (salida == true) {    //Primer while
            System.out.println("Introduce tu contraseña.");
            String contraseñaIn = sc.nextLine();
            if (contraseña1.compareTo(contraseñaIn) == 0 || contraseña2.compareTo(contraseñaIn) == 0) { //comparacion strings
                System.out.println("Contraseña correcta");
                System.out.println("Ahora introduzca los siguientes datos:");
                while (salida2 == true) {   //Segundo while
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Primer apellido:");
                    String apellido1 = sc.nextLine();
                    System.out.print("Segundo apellido:");
                    String apellido2 = sc.nextLine();
                    System.out.println("Has introducido: " + nombre + " " + apellido1 + " " + apellido2);
                    System.out.println("¿Quieres volver a introducir datos? S/N");
                    char continuarDatos = sc.next().charAt(0);  //Leer la opcion
                    sc.nextLine();
                    if (continuarDatos == 'S' || continuarDatos == 's') {   //ignorar si es mayuscula o minuscula
                        continue;
                    } else if (continuarDatos == 'N' || continuarDatos == 'n') {
                        System.out.println("Ha elegido terminar.");
                        salida = false; //Salida de los bucles al no querer meter mas datos.
                        salida2 = false;
                    } else {
                        System.out.println("Opción no válida.");
                        salida = false; //Salida de los bucles al introducir una opción correcta.
                        salida2 = false;
                    }
                }
            } else {
                System.out.println("Contraseña incorrecta");
                continue;
            }
        }
    }

}
