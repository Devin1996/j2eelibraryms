<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title> Login Page</title>
    </head>
            <script type="text/javascript">
            function validateUsername() {
                var text = document.getElementById("uname").value;
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
    <body>
             <form action="loginservlert" method="POST">
        <center>
            <table  width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td> Enter Username : </td>
                        <td><input type="text" name="uname" id="uname"  value="" onblur="validateUsername()"/></td>
                        <td><label id="errorusername"></label></td>
                    </tr>
                    <tr>
                        <td>Enter Password :</td>
                        <td><input type="password" name="pass" id="pass" value="" onblur="validatePassword()"/></td>
                        <td><label id="errorpassword"></label></td>
                    </tr>
                    
                    <tr>
                      
                        <td><input type="Submit"  value="Log in" /></td>
                    </tr>

                </tbody>
            </table>
            </center>
   
           
        </form>
       <h2>${errorMessage}</h2>
       <% 
           HttpSession session2 = request.getSession();
                session2.removeAttribute("errorMessage");
                session2.invalidate();
       %>
       
       <h3><a href="menu.jsp">Home</a> </h3>
    </body>
    
</html>
