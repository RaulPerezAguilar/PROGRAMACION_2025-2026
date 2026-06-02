package EJ9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EJ9 {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false",
                    "fran",
                    "Fr4n");

            System.out.println("Conexion exitosa");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM producto ORDER BY precio DESC");

            System.out.println("Listado de todos los productos:");

            while (rs.next()) {
                System.out.println("Producto " + rs.getString("nombre"));
            }

            con.close();

        } catch (SQLException e) {
            System.out.println("No se pudo conectar");
            e.printStackTrace();
        }
    }
}