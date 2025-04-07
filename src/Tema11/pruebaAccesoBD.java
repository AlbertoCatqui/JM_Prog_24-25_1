package Tema11;

import java.sql.*;

public class pruebaAccesoBD {
    public static void main(String[] args) {
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Cargamos la clase que implementa el Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Creamos una nueva conexión a la base de datos "bdpruebas"
            String url = "jdbc:mysql://localhost:3306/prueba1";
            // Abrimos la conexión con el usuario y la clave correspondiente
            Connection conn = DriverManager.getConnection(url, "root", "");
            // Otra opción de apertura de la conexión
            //Connection conn = DriverManager.getConnection(url + "?user=root&password=1234");
            // Obtenemos un Statement de la conexión
            stmt = conn.createStatement();

            // Creamos y ejecutamos la consulta SELECT sobre la "tablapruebas"
            String sql = "SELECT * FROM tablapruebas";
            rs = stmt.executeQuery(sql);
            // También se puede comprobar la sentencia y luego recoger el resultado
            // if (stmt.execute(sql)) { rs = stmt.getResultSet(); }
            // Como deberíamos obtener resultados, recorremos el ResultSet y mostramos sus datos
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("campo1");
                Date fecha = rs.getDate("campo2");
                System.out.println(id + " " + nombre + " " + fecha);
            }

            rs.close(); // Cerramos el ResultSet, el Statement y la conexión
            stmt.close();
            conn.close();

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Una mejor forma sería cerrar el ResultSet y el Statement en el finally si queremos
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                    System.out.println("Error al cerrar el ResultSet.");
                }
                rs = null; // Vaciamos la variable para liberarla
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                    System.out.println("Error al cerrar el Statement.");
                }
                stmt = null; // Vaciamos la variable para liberarla
            }
        }
    }
}