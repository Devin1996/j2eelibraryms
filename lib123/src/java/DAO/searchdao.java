
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class searchdao {
    String url = "jdbc:mysql://localhost:3306/library";
    String username = "root";
    String password = "";
    String query = "select * from books where bkname= ? ";

    public boolean check1(String bname) throws Exception
    {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username, password);
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1,bname);
            ResultSet rs = pst.executeQuery();
        
            if(rs.next())
                return true;
            
            
    
        return false;
    }
}