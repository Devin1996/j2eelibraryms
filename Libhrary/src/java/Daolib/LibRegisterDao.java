
package Daolib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class LibRegisterDao {
        String url = "jdbc:mysql://localhost:3306/library123";
        String username = "root";
        String password = "";
    
    public void input(String fname, String id, String add, String unames, String pwd) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username, password);
            Statement st = conn.createStatement();
            String quary="INSERT INTO admin(fullname,idno,address,usrname,password) VALUES ('" + fname + "','" + id + "','" + add + "','" + unames + "','" + pwd + "')";
            st.executeUpdate(quary);
    }

    

    
    
}