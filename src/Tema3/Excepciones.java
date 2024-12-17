package Tema3;

public class Excepciones {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        try {
            int div = x / y;
            System.out.println("División =" + div);
        } catch (ArithmeticException e) {
            System.out.println("tal noseque" + e);
        } catch (Exception e) {
            System.out.println("e");
        } finally {
            System.out.println("Fin");
        }
    }
}
