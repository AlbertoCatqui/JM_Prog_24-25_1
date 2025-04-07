package AceptaElReto;

public class ej2 {
    static java.util.Scanner in;

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.next();
        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }
    }

    public static void casoDePrueba() {
        boolean letraMin = false;
        boolean letraMay = false;
        boolean digito = false;
        boolean simbolo = false;
        boolean longitud = false;
        String Simbolos = "+_)(*&^%$#@!./,;{}";

        String cadena = in.nextLine();
        char[] cadenaCaracteres = cadena.toCharArray();
        if (cadenaCaracteres.length >= 12) {
            longitud = true;
            for (int i = 0; i < cadenaCaracteres.length; i++) {
                if (Character.isLowerCase(cadenaCaracteres[i])) {
                    letraMin = true;
                }
                if (Character.isUpperCase(cadenaCaracteres[i])) {
                    letraMay = true;
                }
                if (Character.isDigit(cadenaCaracteres[i])) {
                    digito = true;
                }
                if (Simbolos.indexOf(cadenaCaracteres[i]) != -1) {
                    simbolo = true;
                }
            }
        } else {
            longitud = false;
        }
        if (letraMin == true && letraMay == true && digito == true && simbolo == true) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }


}