package Tema6.Persona;

public class Persona {
    private String nombre;
    private String apellido;
    private String locNacimiento;
    private int edad;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    void saludar(){}
    boolean decirMayorEdad(){return false;}

    public boolean decirMayorEdad(int edad){
        if (edad > 18){
            return true;
        }
        return false;
    }

    public String getLocNacimiento() {
        return locNacimiento;
    }

    public void setLocNacimiento(String locNacimiento) {
        this.locNacimiento = locNacimiento;
    }
}
