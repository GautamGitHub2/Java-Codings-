package CoreJavaHandsOn;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;
import com.mysql.jdbc.Connection;

public class JDBCExample1 {

    public static void main(String args[]) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gautam", "root",
                    "MyN3wP4ssw0rd");
            java.sql.Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from account;");

            // insert into stud1 values ('Tom','tom12@gmail.com')

            System.out
                    .println("Account_ID" + "  |  " + "Account_Name" + "    |       " + "Email_ID"
                            + "      |     " + "BAL");

            while (rs.next())// here i am using while loop because i don't know the how many results would
            // come from this piece of query, if i would be knowing the number of data then
            // for loop would be fine

            {

                int aid = rs.getInt("aid");
                String name = rs.getString("name");
                String email = rs.getString("email");
                int bal = rs.getInt("bal");

                System.out.println(aid + "      |  " + name + "          |   " + email + "          |   " + bal);
            }
            con.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println(e);
        }

    }

}
