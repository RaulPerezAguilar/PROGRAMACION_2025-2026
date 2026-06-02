package EJ10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class EJ10 {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false",
                    "fran",
                    "Fr4n");

            System.out.println("Conexión exitosa");

            Statement stmt = con.createStatement();

            // 1. Borrar todos los registros
            stmt.executeUpdate("DELETE FROM producto");

            // 2. Insertar los 3 nuevos registros
            stmt.executeUpdate(
                    "INSERT INTO producto (id, nombre, descripcion, precio, pais) " +
                    "VALUES (1, 'manzana', 'Manzanas golden', 50, 'Francia')");

            stmt.executeUpdate(
                    "INSERT INTO producto (id, nombre, descripcion, precio, pais) " +
                    "VALUES (2, 'pera', 'Peras conferencia', 25, 'Espana')");

            stmt.executeUpdate(
                    "INSERT INTO producto (id, nombre, descripcion, precio, pais) " +
                    "VALUES (3, 'uva', 'Uvas groumet', 30, 'Espana')");

            // 3. Modificar el precio de la pera
            stmt.executeUpdate(
                    "UPDATE producto SET precio = 20 WHERE nombre = 'pera'");

            System.out.println("Operaciones realizadas correctamente");

            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error en la base de datos");
            e.printStackTrace();
        }
    }
}