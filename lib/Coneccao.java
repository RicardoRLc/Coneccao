import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coneccao {

    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://Localhost:3306/teste";
        String user ="root";
        String password="";

        Connection connectio = DriverManager
            .getConnection(url, user,password);
    }
}