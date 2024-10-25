import java.util.Scanner;

public class E2_0_HolaMundo {
    public static void main(String[] args) {
        /*
        System.out.println("Hola Mundo actualización");
        byte entero1 = 1 ;
        short entero2 = 2;
        int entero3 = 3;
        long entero4 = 4;
        float decimalSimple = 5;
        double decimalDoble = 6;
        char caracter = 'a';
        String cadena = "tal";
        boolean truefalse = true;


        System.out.println(entero1);
        System.out.println(entero2);
        System.out.println(entero3);
        System.out.println(entero4);
        System.out.println(decimalSimple);
        System.out.println(decimalDoble);
        System.out.println(caracter);
        System.out.println(cadena);
        System.out.println(truefalse);

        String c1="Hola";
        String c2="buenas";
        String c3="tardes";
        String c4="tal";
        String c5="noseque";
        System.out.println(c1+" "+c2+" "+c3+" "+c4+" "+c5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();
        System.out.println(numero);
         */
        //Iguales
        String cadena1 = "Comparar cadena";
        String cadena2 = "Comparar cadena";
        int compara = cadena1.compareTo(cadena2);
        System.out.println(compara);

        //diferentes
        String cadena3 = "Comparar cadena";
        String cadena4 = "COMPARAR";
        int compara2 = cadena3.compareTo(cadena4);
        System.out.println(compara2);

        //Iguales ignorecase
        String cadena5 = "COMPARAR CADENA";
        String cadena6 = "Comparar cadena";
        int compara3 = cadena5.compareToIgnoreCase(cadena6);
        System.out.println(compara3);
    }
}
