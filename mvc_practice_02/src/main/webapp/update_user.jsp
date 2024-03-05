<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib prefix="aditya" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<aditya:form action="updateUser" modelAttribute="user">
		
			<aditya:input path="name"/><br>
			<aditya:input path="age"/><br>
			<aditya:input path="mobile"/><br>
			<aditya:input path="email"/><br>
			<aditya:input path="password"/><br>
			<aditya:button>submit</aditya:button>
		</aditya:form>
		
</body>
</html>