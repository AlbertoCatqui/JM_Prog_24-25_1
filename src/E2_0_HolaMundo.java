import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E2_0_HolaMundo {
    public static void main(String[] args) {
        /*JOptionPane.showMessageDialog(null, "holabuena tarde");
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero"));
        JOptionPane.showMessageDialog(null, num);*/
        Pattern pat = Pattern.compile( "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String cadena;
        Scanner sc = new Scanner(System.in);
        cadena = sc.nextLine();
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
