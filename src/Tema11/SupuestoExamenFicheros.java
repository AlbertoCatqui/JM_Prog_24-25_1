package Tema11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SupuestoExamenFicheros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        File fich = new File("conversiones.txt");

        do{
            System.out.print("Dame una cadena: ");
            cadena = sc.nextLine();

            /*Escribir en el fichero*/
            try {
                FileWriter fw = new FileWriter(fich, true);
                fw.write(cadena + "\n");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


            /*Lectura Fichero*/
            try {
                Scanner scFich = new Scanner(fich);
                while(scFich.hasNext()){
                    String algo = scFich.nextLine();
                    System.out.println(algo);
                }
                scFich.close();
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }

        }while(cadena.length() != 0);
    }
}
