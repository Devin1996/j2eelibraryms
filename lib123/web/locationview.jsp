

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
        <h1>
							<%
                                                            
            String url="jdbc:mysql://localhost:3306/library";
            String name = (String) session.getAttribute("bname");
            String location = (String) session.getAttribute("locations");
            Class.forName("com.mysql.jdbc.Driver");
            String sql="update books set bklocation='"+location+"' where bkname='"+name+"'" ;
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
                   
						</h1>
    </body>
</html>
