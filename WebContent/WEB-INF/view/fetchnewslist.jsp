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
	<h4><u>News list</u></h4>
	<c:if test="${not empty userList}">
		<table border="1">
			<tr>
			<th> <h4 >Category</h4></th>
				<th><h4 >Post Name</h4></th>
				<th><h4 >Description</h4></th>
				<th><h4 >Location</h4></th>
				<th><h4 >Image</h4></th>
				
			
				<c:forEach var="listValue" items="${userList}">
<tr>
					<td><h4 > <c:out value="${listValue.category}" /> <br></h4></td>
					<td><h4 ><c:out value="${listValue.postname}" /><br></h4></td>
					<td><h4 ><c:out value="${listValue.description}" /><br></h4></td>
					<td><h4 ><c:out value="${listValue.location}" /><br></h4></td>
				<td><h4 ><a href="file:///C:/Users/rajue/NewsReport/WebContent/WEB-INF/view/Capture.JPG"><c:out value="${listValue.image}" /></a><br></h4></td>
									
					</tr>
			</c:forEach>
			
		</table>
	</c:if>
	<br>
	<br>
	</font>
</body>
</html>