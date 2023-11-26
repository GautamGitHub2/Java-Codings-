package CoreJavaHandsOn;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import com.mysql.cj.xdevapi.SqlStatement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/*
 Steps to write JDBC program…

1. Create a Connection
2. Create a query/statement
3. Execute statement/query
4. Close connection 

*/

public class JDBCExample {

    static java.sql.Connection connection = null;
    // static String databaseName = "gautam";
    static String url = "jdbc:mysql://localhost:3306/gautam";

    static String username = "root";
    static String password = "MyN3wP4ssw0rd";

    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        java.sql.Statement ps = connection.createStatement();

        ResultSet status = ps.executeQuery("select * from account;");

        System.out.println("Database was connected");
        System.out.println("Record was retrieved");

        while (status.next()) {

            System.out.println(status.getString(2));

        }
        connection.close();

        /*
         * Output:
         * 
         * Database was connected
         * Record was retrieved
         * Gautam
         * Gobinda
         * Gaurav
         * Nitoo
         * Puja
         * Pari
         * Futty
         * Appu
         * Manu
         * 
         */
    }
}
