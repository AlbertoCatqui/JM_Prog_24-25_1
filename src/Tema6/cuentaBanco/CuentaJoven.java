package Tema6.cuentaBanco;

public class CuentaJoven extends Cuenta {
    private double bonificacion;

    public CuentaJoven(double saldo, String nombreCliente, String numeroCuenta, double tipoInteres, int edad, double bonificacion) {
        super(saldo, nombreCliente, numeroCuenta, tipoInteres, edad);
        this.bonificacion = bonificacion;
        this.esTitularValido();
    }

    public boolean esTitularValido() {
        if (this.getEdad() < 18) {
            System.out.println("Edad no válida para la creación de la cuenta.");
            return false;
        } else {
            return true;
        }
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }
}
