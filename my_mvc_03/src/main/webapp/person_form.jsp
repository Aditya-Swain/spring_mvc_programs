<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		${success}
	<form action="register_person" method="post">
		<input type="text" name="name" placeholder="Enter your name : "><br><br>
		<input type="text" name="age" placeholder="Enter your age : "><br><br>
		<input type="text" name="mobile" placeholder="Enter your mobile : "><br><br>
		<input type="text" name="email" placeholder="Enter your email : "><br><br>
		<input type="text" name="password" placeholder="Enter your password : "><br><br>
		<input type="submit" value="Register">
		
		</form>
		
</body>
</html>