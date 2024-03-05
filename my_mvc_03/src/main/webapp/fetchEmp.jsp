<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored ="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		<table>
			<tr>
			<th>Name</th>
			<th>Salary</th>
			</tr>	
			
			
			<c:forEach var="i" items="${list}">
			<tr>
			<td>${i.getName()}</td>
			<td>${i.getSalary()}</td>
			</tr>
			
			</c:forEach>	
		
		</table>
</body>
</html>