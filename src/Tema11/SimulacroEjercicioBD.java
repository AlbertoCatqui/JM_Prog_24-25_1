package Tema11;

import java.sql.*;
import java.util.Scanner;

public class SimulacroEjercicioBD {
    public static void main(String[] args) {
        Statement stmt = null;
        ResultSet rs = null;
        String bd = "pokemonbd";
        String url = "jdbc:mysql://localhost:3306/" + bd;
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();

            programa(stmt, rs);

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

    private static void programa(Statement stmt, ResultSet rs) throws SQLException {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            imprimirMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    mostrarTipos(stmt, rs);
                    break;
                case 2:
                    mostrarPersonajes(stmt, rs);
                    break;
                case 3:
                    mostrarPokemonMasVida(stmt, rs);
                    break;
                case 4:
                    BuscarPokemonTipo(sc, stmt, rs);
                    break;
                case 5:
                    BuscarPokemonNombre(sc, stmt, rs);
                    break;
                case 6:
                    BuscarPokemonVidaIn(sc, stmt, rs);
                    break;
                case 7:
                    agregarPokemon(sc, stmt);
                    break;/*
                case 8:
                    modificarPrecio(sc, stmt);
                    break;
                case 9:
                    actualizarStock(sc, stmt);
                    break;
                case 10:
                    eliminarProducto(sc, stmt);
                    break;
                case 11:
                    eliminarProducto(sc, stmt);
                    break;
                case 12:
                    eliminarProducto(sc, stmt);
                    break;
                case 13:
                    eliminarProducto(sc, stmt);
                    break;
                     */
                case 14:
                    System.out.println("Ha elegido Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        } while (opcion != 14);
    }



    private static void mostrarTipos(Statement stmt, ResultSet rs) throws SQLException {
        /*Consulta*/
        String sql = "select id, nombre from tipospokemon;";
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            /*Acceso a los campos de la tabla*/
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            System.out.println("Tipo: " + id + ", " + nombre);
        }
        rs.close();    // Cerramos el ResultSet, el Statement y la conexión
    }

    private static void mostrarPersonajes(Statement stmt, ResultSet rs) throws SQLException {
        /*Consulta*/
        String sql = "SELECT * from pokemon;";
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            /*Acceso a los campos de la tabla*/
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            int puntosVida = rs.getInt("puntosVida");
            String tipo = rs.getString("tipo");
            System.out.println(">" + id + ", " + nombre + ", " + puntosVida + ", " + tipo + ".");
        }
        rs.close();    // Cerramos el ResultSet, el Statement y la conexión
    }

    private static void mostrarPokemonMasVida(Statement stmt, ResultSet rs) throws SQLException {
        /*Consulta*/
        String sql = "SELECT nombre from pokemon where puntosVida >= (select max(puntosVida) from pokemon);";
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            /*Acceso a los campos de la tabla*/
            String nombre = rs.getString("nombre");
            System.out.println("Pokemon con mas vida: " + nombre + ".");
        }
        rs.close();    // Cerramos el ResultSet, el Statement y la conexión
    }

    private static void BuscarPokemonTipo(Scanner sc, Statement stmt, ResultSet rs) throws SQLException {
        /*Consulta*/
        System.out.println("Introduce el tipo(1-Agua, 2-Fuego, 3-Planta)");
        int tip = sc.nextInt();
        String sql = "SELECT nombre from pokemon where tipo = "+tip+";";
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            /*Acceso a los campos de la tabla*/
            String nombre = rs.getString("nombre");
            System.out.println("Pokemon de tipo " + tip + ": " + nombre + ".");
        }
        rs.close();    // Cerramos el ResultSet, el Statement y la conexión
    }
    private static void BuscarPokemonNombre(Scanner sc, Statement stmt, ResultSet rs) throws SQLException {
        /*Consulta*/
        System.out.println("Introduce el nombre(La primera en mayúsculas)");
        String nom = sc.nextLine();
        String sql = "SELECT * FROM `pokemon` where nombre = '"+nom+"';";
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            /*Acceso a los campos de la tabla*/
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            int puntosVida = rs.getInt("puntosVida");
            String tipo = rs.getString("tipo");
            System.out.println(">" + id + ", " + nombre + ", " + puntosVida + ", " + tipo + ".");
        }

        rs.close();    // Cerramos el ResultSet, el Statement y la conexión
    }
    private static void BuscarPokemonVidaIn(Scanner sc,Statement stmt, ResultSet rs) throws SQLException {
        /*Consulta*/
        System.out.println("Introduce un valor de vida para mostrar los pokemon con mas vida que esa");
        int vid = sc.nextInt();
        String sql = "SELECT * FROM `pokemon` where puntosVida > "+vid+";";
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            /*Acceso a los campos de la tabla*/
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            int puntosVida = rs.getInt("puntosVida");
            String tipo = rs.getString("tipo");
            System.out.println(">" + id + ", " + nombre + ", " + puntosVida + ", " + tipo + ".");
        }
        rs.close();    // Cerramos el ResultSet, el Statement y la conexión
    }
    private static void agregarPokemon(Scanner sc, Statement stmt) throws SQLException {
        /* Creamos y ejecutamos la consulta INSERT */
        System.out.print("Dame el nombre del pokemon: ");
        String nom = sc.nextLine();
        System.out.print("Dame la vida del pokemon: ");
        String vid = sc.nextLine();
        System.out.print("Dame el tipo del pokemon: ");
        int tip = sc.nextInt();
        String sql = "insert into pokemon (nombre, puntosVida, tipo) values ('" + nom + "', '" + vid + "', " + tip+");";
        int numResultados = stmt.executeUpdate(sql);
        if (numResultados > 0) {
            System.out.println("Se han actualizado " + numResultados + " filas de la BD");
        } else {
            System.out.println("No se ha modificado la BD");
        }
    }

    private static void imprimirMenu() {
        System.out.println("Menu de opciones");
        System.out.println("1. Mostrar los tipos existentes.");
        System.out.println("2. Mostrar todos los personajes con su id, nombre, vida y tipo.");
        System.out.println("3. Mostrar el pokémon con la mayor cantidad de vida.");
        System.out.println("4. Buscar pokémon por un tipo indicado");
        System.out.println("5. Buscar pokémon por un nombre indicado");
        System.out.println("6. Buscar pokémon con una vida superior a lo indicado");
        System.out.println("7. Insertar un nuevo tipo con datos pedidos al usuario");
        System.out.println("8. Insertar un nuevo pokémon con datos pedidos al usuario, incluído el tipo");
        System.out.println("9. Modificar el tipo de un pokémon en particular");
        System.out.println("10. Modificar la vida de un pokémon en particular");
        System.out.println("11. Eliminar un pokémon");
        System.out.println("12.  Eliminar un tipo (si no tiene ningún pokémon de dicho tipo).");
        System.out.println("13. Eliminar un tipo (sin importar que algún pokémon tenga dicho tipo).");
        System.out.println("14. Salir");
    }
}
