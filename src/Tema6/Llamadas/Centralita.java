package Tema6.Llamadas;

public class Centralita {
    int numLlamadas;
    double costeTotal;
    Llamadas[] llamada = new Llamadas[100];
    int contLlamadas = 0;

    public Centralita(Centralita cen) {
        this.numLlamadas = cen.numLlamadas;
        this.costeTotal = cen.costeTotal;
        this.llamada = cen.llamada;
        this.contLlamadas = cen.contLlamadas;
    }
    public Centralita() {
        this.numLlamadas = 20;
        this.costeTotal = 100;
        this.llamada = new Llamadas[100];
        this.contLlamadas = 0;
    }

    public Centralita(int numLlamadas, double costeTotal, Llamadas[] llamada, int contLlamadas) {
        this.numLlamadas = numLlamadas;
        this.costeTotal = costeTotal;
        this.llamada = llamada;
        this.contLlamadas = contLlamadas;
    }

    public void alta(Llamadas ll) {
        numLlamadas++;
        costeTotal += ll.coste();
        if (contLlamadas < 100) {
            llamada[contLlamadas] = ll;
            contLlamadas++;
        } else {
            System.out.println("El array ya esta lleno");
        }
        listar();
    }

    protected void listar() {
        System.out.println("Numero de llamadas: " + numLlamadas);
        System.out.println("Coste total: " + costeTotal);
        for (int i = 0; i < llamada.length; i++) {
            System.out.println("Llamada" + (i + 1) + ": " + llamada[i]);
        }
    }
}
