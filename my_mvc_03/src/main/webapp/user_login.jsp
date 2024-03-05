<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			${fail}
	<form action="login_user" method="post">
		<input type="text" name="email" placeholder="Enter your email : "><br><br>
		<input type="text" name="password" placeholder="Enter your password : "><br><br>
		<input type="submit" value="Login"><br><br>
		New User ?<a href="dummy1">Register</a>
		
		</form>
		
</body>
</html>