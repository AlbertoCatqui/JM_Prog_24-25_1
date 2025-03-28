package Tema9;

import java.util.ArrayList;
import java.util.Iterator;

public class pruebas {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            al.add("E " + i);
        }
        al.add(2, "E nuevo");
        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            String elemento = it.next();
            System.out.print(elemento + "/");
        }
    }
}
