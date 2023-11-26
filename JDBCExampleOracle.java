package CoreJavaHandsOn;

import java.sql.DriverManager;
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

public class JDBCExampleOracle {

    public static void main(String[] args) throws SQLException {

        // Create Connection
        java.sql.Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/gautam", "root",
                "MyN3wP4ssw0rd");

        // Create a Query/statement
        java.sql.Statement stmt = con.createStatement();
        String s = "insert into stud1 values ('Tom','tom12@gmail.com');";
        // String s = "update account set name='Don' where aid= 101;";
        // String s="delete account where aid=104;";

        // Important points...
        /*
         * 1. Insert, update and delete commands are one way commands, it will go to the
         * DB and execute that command there in DB and do not retrieive any data from DB
         * 2. Select command is two way command, it will go to the DB, execute the
         * command and retrieve the data from DB and give it to the client
         */

        // Execute Statement / Query
        stmt.executeQuery(s);

        // Close the connection
        con.close();

        System.out.println("Program is completed...");

        // Output: this is not executing because Oracle database is not available in my
        // system

    }

}
