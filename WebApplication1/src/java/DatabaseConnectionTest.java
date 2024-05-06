import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {
    private static final String DB_URL = "jdbc:sqlserver://LAPTOP-FBBG2CEA;databaseName=ArtGallery";
    private static final String USER = "sa";
    private static final String PASS = "sa";

    public static void main(String[] args) {
        try {
            // Load SQL Server JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Get connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Check connection
            if (conn != null && conn.isValid(2)) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
