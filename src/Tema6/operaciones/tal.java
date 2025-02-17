package Tema6.operaciones;

public class tal implements interfazMetodo {

    @Override
    public int multiplicacion(int a, int b) {
        return a*b;
    }

    @Override
    public int division(double a, double b) {
        return (int) (a/b);
    }

    @Override
    public void mostrarDatos(String info) {

    }
}
