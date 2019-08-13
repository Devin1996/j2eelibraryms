

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete</title>
    </head>
    <body>
                   <form method="post" action="delteservlet">
                <center>
                    <table  width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Delete a Books Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Enter Book name :</td>
                        <td><input type="text" name="bname" value="" /></td>
                    </tr>
                    
                        <td><input type="submit" value="DELETE" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>

                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>
