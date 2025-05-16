package Tema11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fixeros {
    public static void main(String[] args) {
        File f = new File("fich.txt");
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                String a =sc.nextLine();
                System.out.println("Dato leido: " + a);
            }
            sc.close();
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
