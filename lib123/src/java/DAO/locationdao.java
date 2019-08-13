
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class locationdao {
    String url = "jdbc:mysql://localhost:3306/library";
    String username = "root";
    String password = "";
    String query = "update books set bklocation=? where bkname=?" ;

    public boolean check3(String bname) throws Exception
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