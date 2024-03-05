<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		${success}
		<form:form action="updateEmp" modelAttribute="employee" >
		<form:input path="name"/><br>
		<form:input path="salary"/><br>
		<button>submit</button>
		
		
		
		</form:form>
</body>
</html>