<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form >
		Enter First Number : <br>
		<input type="text" name="num1"><br><br>
		Enter Second Number : <br>
		<input type="text" name="num2"><br><br>
		<input type="submit" value="Addition" onclick="form.action='add'">
		<input type="submit" value="Substraction" onclick="form.action='sub'">
		<input type="submit" value="Multiplication" onclick="form.action='mul'">
		<input type="submit" value="Division" onclick="form.action='div'">
		</form>
</body>
</html>