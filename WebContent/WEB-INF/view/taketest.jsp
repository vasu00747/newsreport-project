<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Test Page</title>
</head>
<body>
<%@ include file="index.jsp" %>

 <br><br><br>
Subjects List:<br><br><c:if test="${not empty a}">

<c:forEach var="listValue" items="${a}">
 <a href="testcategory">${listValue.subjectname} </a><br><br> 

		<%--  <button name="${listValue.subjectname}" >${listValue.subjectname}</button>

	<form action="testcategory" method="post"><button name="btn" value="<c:out value="${listValue.subjectname}"/>"><c:out value="${listValue.subjectname}"/></button></form>
  --%>
 
</c:forEach>

</c:if>
</center>
</body>
</html>