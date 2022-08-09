import java.sql.*;

public class Jdbconnectivity {


    public static void getConnection() throws SQLException, ClassNotFoundException {
        String URL = "jdbc:mysql://localhost:8080/transactions";
        String USER = "root";
        String PASS = "root";

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, USER, PASS);

        Statement statement = conn.createStatement();
        statement.execute("select * from transactions");
        ResultSet resultSet = statement.getResultSet();

        System.out.println(resultSet);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        getConnection();
    }
}
