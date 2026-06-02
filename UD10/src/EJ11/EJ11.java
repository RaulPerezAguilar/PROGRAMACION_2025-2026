package EJ11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EJ11 {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false",
                    "fran",
                    "Fr4n");

            System.out.println("Conexión exitosa");

            Statement stmt = con.createStatement();

            // Mostrar productos españoles usando execute()
            boolean resultado = stmt.execute(
                    "SELECT * FROM producto WHERE pais='Espana'");

            if (resultado) {
                ResultSet rs = stmt.getResultSet();

                System.out.println("Productos españoles:");

                while (rs.next()) {
                    System.out.println(
                            rs.getInt("id") + " - " +
                            rs.getString("nombre") + " - " +
                            rs.getInt("precio"));
                }
            }

            // Batch con las consultas anteriores
            stmt.addBatch("DELETE FROM producto");

            stmt.addBatch(
                    "INSERT INTO producto VALUES " +
                    "(1,'manzana','Manzanas golden',50,'Francia')");

            stmt.addBatch(
                    "INSERT INTO producto VALUES " +
                    "(2,'pera','Peras conferencia',25,'Espana')");

            stmt.addBatch(
                    "INSERT INTO producto VALUES " +
                    "(3,'uva','Uvas groumet',30,'Espana')");

            stmt.addBatch(
                    "UPDATE producto SET precio=20 WHERE nombre='pera'");

            stmt.executeBatch();

            System.out.println("Primer batch ejecutado");

            // Segundo batch con los nuevos productos
            stmt.clearBatch();

            stmt.addBatch(
                    "INSERT INTO producto VALUES " +
                    "(4,'kiwi','Zespri gold',120,'Nueva Zelanda')");

            stmt.addBatch(
                    "INSERT INTO producto VALUES " +
                    "(5,'perito','Peritos de Tavizna',18,'Espana')");

            stmt.addBatch(
                    "INSERT INTO producto VALUES " +
                    "(6,'platano','Platano canario',40,'Espana')");

            stmt.executeBatch();

            System.out.println("Segundo batch ejecutado");

            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}