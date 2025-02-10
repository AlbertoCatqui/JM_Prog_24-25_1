package Tema6.Persona;

public class Persona {
    String nombre;
    String apellido;
    String locNacimiento;
    int edad;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    void saludar(){}
    boolean decirMayorEdad(){return false;}

}
