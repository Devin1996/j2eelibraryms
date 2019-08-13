
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class logdao {
    String url = "jdbc:mysql://localhost:3306/library";
    String username = "root";
    String password = "";
    String query = "select * from userdata where uname= ? and password= ? ";

    public boolean check(String uname, String pass) throws Exception
    {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username, password);
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1,uname);
            pst.setString(2,pass);
            ResultSet rs = pst.executeQuery();
        
            if(rs.next())
                return true;
            
            
    
        return false;
    }
}