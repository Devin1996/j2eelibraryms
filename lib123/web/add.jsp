<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Books</title>
    </head>
    <body>
        <form method="post" action="addservlet">
            <center>
            <table  width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Enter New Books Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Book Name :</td>
                        <td><input type="text" name="bname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Author :</td>
                        <td><input type="text" name="author" value="" /></td>
                    </tr>
                    <tr>
                        <td>Book Location :</td>
                        <td><input type="text" name="location" value="" /></td>
                    </tr>
                    <tr>
                        <td>Category :</td>
                        <td><input type="text" name="category" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Add Book" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Already added Get it! <a href="view.jsp">See It here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
        
    </body>
</html>

