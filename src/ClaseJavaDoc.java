/**
 * @author Alberto
 * @version 1
 */
public class ClaseJavaDoc {

    private String nombre;
    private int edad;
    private static boolean activo;

    /**
     * @param edad
     * @param nombre
     */
    public ClaseJavaDoc(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    /**
     * Main para crear el objeto
     *
     * @param args
     */
    public static void main(String[] args) {
        ClaseJavaDoc cjd = new ClaseJavaDoc(1, "Luis");
    }

    /**
     * Devuelve nuevo
     *
     * @param edad Edad del objeto
     * @return Devuelve la edad
     */
    public ClaseJavaDoc devolverNuevo(int edad) {
        return new ClaseJavaDoc(edad, "Nuevo");
    }

    /**
     * Getter nombre
     *
     * @return devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter Edad
     *
     * @return Devuelve la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter edad
     *
     * @param edad edad objheto
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Is activo
     * @return Devuelve booleano de si esta o no activo
     */
    public static boolean isActivo() {
        return activo;
    }

    /**
     * Setter de si esta activo
     * @param activo Si el objeto esta o no activo
     */
    public static void setActivo(boolean activo) {
        ClaseJavaDoc.activo = activo;
    }
}

