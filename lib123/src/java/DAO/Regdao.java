package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Regdao {
    String url = "jdbc:mysql://localhost:3306/library";
    String username = "root";
    String password = "";

    public void input2(String fname,String idno,String addr,String unames,String passw) throws Exception
    {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username, password);
            Statement st = conn.createStatement();
            int cha = st.executeUpdate("insert into userdata(name,id, address, uname, password) values ('" + fname + "','" + idno + "','" + addr + "','" + unames + "','" + passw + "')");
            
    }    
}