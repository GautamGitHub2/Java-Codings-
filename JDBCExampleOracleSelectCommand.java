package CoreJavaHandsOn;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;
import com.mysql.jdbc.Connection;

/*
     * Steps to write JDBC program…
     * 1. Create a Connection
     * 2. Create a query/statement
     * 3. Execute statement/query
     * 4. Close connection
     */

public class JDBCExampleOracleSelectCommand {

    public static void main(String[] args) throws SQLException {

        // Create Connection
        java.sql.Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/gautam", "root",
                "MyN3wP4ssw0rd");

        // Create a Query/statement
        java.sql.Statement stmt = con.createStatement();
        String s = "select * from account";

        // Important points...
        /*
         * 1. Insert, update and delete commands are one way commands, it will go to the
         * DB and execute that command there in DB and do not retrieive any data from DB
         * 2. Select command is two way command, it will go to the DB, execute the
         * command and retrieve the data from DB and give it to the client
         */

        // Execute Statement / Query
        ResultSet rs = stmt.executeQuery(s);

        while (rs.next())// here i am using while loop because i don't know the how many results would
                         // come from this piece of query, if i would be knowing the number of data then
                         // for loop would be fine
        {
            int aid = rs.getInt("aid");
            String name = rs.getString("name");
            String email = rs.getString("email");
            int bal = rs.getInt("bal");

            System.out.println(aid + " " + name + " " + email + " " + bal);
        }

        // Close the connection
        con.close();

        System.out.println("Program is completed...");

        // Output: this is not executing because Oracle database is not available in my
        // system but i have completed same program in MySQL that is 'JDBCExample.java'
        // and 'JDBCExample1.java'

    }

}
