<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <form method="post" action="libregister">
            <center>
            <table  width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Register Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Full Name :</td>
                        <td><input type="text" name="fname" value="" /></td>
                    </tr>
                    <tr>
                        <td>ID number :</td>
                        <td><input type="text" name="id" value="" /></td>
                    </tr>
                    <tr>
                        <td>Address :</td>
                        <td><input type="text" name="add" value="" /></td>
                    </tr>
                    <tr>
                        <td>User Name :</td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password :</td>
                        <td><input type="text" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Request Registration" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Already registered!! <a href="liblogin.jsp">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
        
    </body>
</html>
