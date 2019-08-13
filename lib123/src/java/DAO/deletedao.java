
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class deletedao {
    String url = "jdbc:mysql://localhost:3306/library";
    String username = "root";
    String password = "";
    String query1 = "Delete * FROM books WHERE bkname = ? ";

    public void delete(String bname) throws Exception
    {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username, password);
            PreparedStatement pst1 = conn.prepareStatement(query1);

            pst1.setString(1,bname);

            pst1.executeUpdate();
         
    }
       
}