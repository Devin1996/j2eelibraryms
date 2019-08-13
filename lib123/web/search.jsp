

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body>
            <form method="post" action="searchservlet">
                <center>
                    <table  width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Search a Books Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Search Book by name :</td>
                        <td><input type="text" name="bname" value="" /></td>
                    </tr>
                    
                        <td><input type="submit" value="Search" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Already viewed ? Get it! <a href="view.jsp">See It here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>
