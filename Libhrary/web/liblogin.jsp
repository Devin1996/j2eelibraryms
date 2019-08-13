<%-- 
    Document   : liblogin
    Created on : Nov 9, 2018, 10:01:41 AM
    Author     : Devin Chandula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        </head>
        
    <body>
        <script type="text/javascript">
            function validateUsername() {
                var text = document.getElementById("username").value;
                if(text === ""){
                document.getElementById("errorusername").innerHTML = "Provide userName";
                document.getElementById("errorusername").style.color = "red";
        }
        else{
                document.getElementById("errorusername").innerHTML = "OK";
                document.getElementById("errorusername").style.color = "green";
   
        }
            }
            
            function validatePassword() {
                var text = document.getElementById("pass").value;
                if(text === ""){
                document.getElementById("errorpassword").innerHTML = "Provide password";
                document.getElementById("errorpassword").style.color = "red";
        }
        else{
                document.getElementById("errorpassword").innerHTML = "OK";
                document.getElementById("errorpassword").style.color = "green";
   
        }
            }
            </script>
            
            
            <form action="ValidateLogin" method="POST" name="AdminLogin">
                <table>
                    <tr>
                        <td>Username :</td>
                        <td><input type="text" id="username" onblur="validateUsername()"></tr>
                        <td><label id="errorusername"></label></td>
                        </tr>
                    
                    <tr>
                        <td>Password :</td>
                        <td><input type="password" id="pass" onblur="validatePassword()"></tr>
                        <td><label id="errorpassword"></label></td>
                        </tr>
                        
                     <tr>
                        <td></td>
                        <td><input type="submit" value="Login"></tr>
                        
                        <td></td>
                        </tr>
                        
                </table>
            </form>
            <a href="libregister.jsp">Register</a>
    </body>
</html>
