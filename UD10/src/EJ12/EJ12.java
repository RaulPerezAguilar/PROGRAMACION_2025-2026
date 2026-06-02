package EJ12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EJ12 {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false",
                    "fran",
                    "Fr4n");

            System.out.println("Conexión exitosa\n");

            DatabaseMetaData meta = con.getMetaData();

            // Tablas de la base de datos
            System.out.println("=== TABLAS DE LA BBDD ===");
            ResultSet tablas = meta.getTables(null, null, "%", new String[]{"TABLE"});

            while (tablas.next()) {
                System.out.println(tablas.getString("TABLE_NAME"));
            }

            // Columnas de la tabla producto
            System.out.println("\n=== COLUMNAS DE LA TABLA PRODUCTO ===");
            ResultSet columnas = meta.getColumns(null, null, "producto", "%");

            while (columnas.next()) {
                System.out.println(
                        columnas.getString("COLUMN_NAME")
                        + " (" +
                        columnas.getString("TYPE_NAME")
                        + ")");
            }

            // Usuario conectado
            System.out.println("\n=== USUARIO ===");
            System.out.println(meta.getUserName());

            // URL de conexión
            System.out.println("\n=== URL ===");
            System.out.println(meta.getURL());

            // Driver JDBC
            System.out.println("\n=== DRIVER ===");
            System.out.println("Nombre: " + meta.getDriverName());
            System.out.println("Versión: " + meta.getDriverVersion());

            // SGBD
            System.out.println("\n=== SGBD ===");
            System.out.println("Nombre: " + meta.getDatabaseProductName());
            System.out.println("Versión: " + meta.getDatabaseProductVersion());

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}