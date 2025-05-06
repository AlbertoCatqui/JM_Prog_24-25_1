package Tema11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;

public class PreparedStatementt {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/prueba1";
        String usuario = "root";
        String clave = "";
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, clave);
            st = con.createStatement();
            // Creamos y ejecutamos la consulta SELECT sobre la "tablapruebas"
            String sql = "SELECT * FROM tablapruebas";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre1 = rs.getString("campo1");
                String nombre2 = rs.getString("campo2");
                System.out.println(id + " " + nombre1 + " " + nombre2);
            }
            /*Prueba con Prepared Statement*/
            String consulta = "select * from tablapruebas where id = ? OR id=? ";
            PreparedStatement ps = con.prepareStatement(consulta);
            int id1=0;
            do {
                System.out.print("Dame identificador: ");
                Scanner sc = new Scanner(System.in);
                id1 = sc.nextInt();
                sc.nextLine();

                ps.setInt(1, id1);
                ps.setInt(2, id1);
                System.out.println(ps);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre1 = rs.getString("campo1");
                    String nombre2 = rs.getString("campo2");
                    System.out.println(id + " " + nombre1 + " " + nombre2);
                }
            } while (id1!=-1);


            rs.close();    // Cerramos el ResultSet, el Statement y la conexión
            st.close();
            con.close();


        } catch (Exception e) {
            // manejamos el error
            System.out.println(e.getMessage() + ", " + e.getLocalizedMessage());
        }

    }
}

