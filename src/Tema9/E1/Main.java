package Tema9.E1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList Lista = new ArrayList();
        Producto p1 = new Producto("tal", 5);
        Producto p2 = new Producto("tal2", 5);
        Producto p3 = new Producto("tal3", 5);
        Producto p4 = new Producto("tal4", 5);
        Producto p5 = new Producto("tal5", 5);
        Producto p6 = new Producto("tal6", 5);
        Lista.add(p1);
        Lista.add(p2);
        Lista.add(p3);
        Lista.add(p4);
        Lista.add(p5);
        Iterator iter = Lista.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        Lista.remove(p2);
        Lista.remove(p3);
        Lista.add(p6);
        Iterator iter2 = Lista.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
        Lista.clear();
    }
}
