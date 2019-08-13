package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class adddao {
    String url = "jdbc:mysql://localhost:3306/library";
    String username = "root";
    String password = "";

    public void input3(String bname,String bauthor,String blocation,String bcategory) throws Exception
    {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username, password);
            Statement st = conn.createStatement();
            int cha = st.executeUpdate("insert into books(bkname, bkauthor, bklocation, bkcategory) values ('" + bname + "','" + bauthor + "','" + blocation + "','" + bcategory + "')");
            
    }    
}
