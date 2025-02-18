package Tema6.cuentaBanco;

public class Cuenta {
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;
    private int edad;

    public Cuenta(double saldo, String nombreCliente, String numeroCuenta, double tipoInteres, int edad) {
        this.saldo = saldo;
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
    }

    public Cuenta() {
    }

    public boolean ingreso(double cantidad) {
        if (cantidad >= 0) {
            this.saldo = cantidad + this.saldo;
            System.out.println("ingreso realizado. el saldo es de " + this.saldo);
            return true;
        } else {
            System.out.println("El movimiento no se ha realizado.");
            return false;
        }
    }

    public boolean reintegro(double cantidad) {
        if (cantidad >= 0) {
            this.saldo = this.saldo - cantidad;
            System.out.println("reintegro realizado. el saldo es de " + this.saldo);
            return true;
        } else {
            System.out.println("El movimiento no se ha realizado.");
            return false;
        }
    }

    public void transferencia(Cuenta destino, double importe) {
        if (this.saldo >= importe) {
            this.saldo = this.saldo - importe;
            destino.setSaldo(destino.getSaldo() + importe);
            System.out.println("La transferencia se ha realizado con éxito.");
            System.out.println("La cuenta de destino ahora tiene " + destino.getSaldo());
            System.out.println("La cuenta de origen ahora tiene " + this.saldo);
        } else {
            System.out.println("La transferencia no se puede realizar, saldo insuficiente.");
        }
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
