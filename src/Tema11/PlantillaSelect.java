package Tema11;


import java.sql.*;

public class PlantillaSelect {
    public static void main(String[] args) {
        Statement stmt = null;
        ResultSet rs = null;
        String bd = "bdpruebas";
        String url = "jdbc:mysql://localhost:3306/"+bd;
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();

            /*Consulta*/
            String sql = "SELECT * FROM tablapruebas";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                /*Acceso a los campos de la tabla*/
                int id = rs.getInt("id");
                String nombre = rs.getString("campo1");
                Date fecha = rs.getDate("campo2");
                System.out.println(id + " " + nombre + " " + fecha);
            }



            rs.close();    // Cerramos el ResultSet, el Statement y la conexión
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {    //Una mejor forma sería cerrar el ResultSet y el Statement en el finally si queremos
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                    System.out.println("Error al cerrar el ResultSet.");
                }
                rs = null;    //Vaciamos la variable para liberarla
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (
                        SQLException sqlEx) {
                    System.out.println("Error al cerrar el Statement.");
                }
                stmt = null;    //Vaciamos la variable para liberarla
            }
        }
    }
}
