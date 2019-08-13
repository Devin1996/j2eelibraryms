<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Details </title>
    </head>
    <body>
        <h4>
							<%
                                                            
            String url="jdbc:mysql://localhost:3306/library";
            
            Class.forName("com.mysql.jdbc.Driver");
            String sql="SELECT * From books" ;
            Connection con = DriverManager.getConnection(url,"root","");
            Statement pst = con.createStatement();
            ResultSet rs = pst.executeQuery(sql);
            while(rs.next()){
            %>
            
            <tr>
            
             Name :<%=rs.getString("bkname") %><br>
             Author :<%=rs.getString("bkauthor") %><br>
             Book location :<%=rs.getString("bklocation") %><br>
             Category :<%=rs.getString("bkcategory") %><br>
            </tr>
            <% }
                   %>
                   
						</h4>
    </body>
</html>

