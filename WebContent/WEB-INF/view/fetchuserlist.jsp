<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
</head>
<body >
<%@ include file="index.jsp" %>
	<font >
	<h4><u>User's list</u></h4>
	<c:if test="${not empty userList}">
		<table border="1">
			<tr>
			<th> <h4 >User name </h4></th>
				<th><h4 >Email-Id</h4></th>
				<th><h4 >Gender</h4></th>
				<th><h4 >Mobile No</h4></th>
				<th><h4 >Address</h4></th>
				<th><h4 >DOB</h4></th>
				
			
				<c:forEach var="listValue" items="${userList}">
<tr>
					<td><h4 > <c:out value="${listValue.username}" /> <br></h4></td>
					<td><h4 ><c:out value="${listValue.emailId}" /><br></h4></td>
					<td><h4 ><c:out value="${listValue.gender}" /><br></h4></td>
					<td><h4 ><c:out value="${listValue.mobileno}" /><br></h4></td>
					<td><h4 ><c:out value="${listValue.address}" /><br></h4></td>
					<td><h4 ><c:out value="${listValue.dob}" /><br></h4></td>
					
					</tr>
			</c:forEach>
			
		</table>
	</c:if>
	<br>
	<br>
	</font>
</body>
</html>