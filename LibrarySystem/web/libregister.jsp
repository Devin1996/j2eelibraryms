<%@page contentType="text/html" pageEncoding="UTF-8"%>

 
<!DOCTYPE html>


<html>
	<head>
		<title>Register</title>
	</head>

	<body>

             
		<h1 align="center">Register</h1>
			
			<form action="regservlet" method="post" >
	
			 Name:	<input type="text" name="name" placeholder="Enter your name"> <br>

			 ID no:	<input type="text" name="id" placeholder="Enter your ID number"> <br>

			 Address:	<input type="text" name="address" placeholder="Enter your Address"> <br>

			 User name :	<input type="text" name="uname" placeholder="Enter your User name"> <br>

			Password :	<input type="password" name="lpassword" placeholder="Enter Your password"><br>
	
                        <input type="submit" value="Create Account" />
                        
			</form>
	</body>

	</html>
