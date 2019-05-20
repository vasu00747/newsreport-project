<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>Test Category</title>
</head>
<body>
<%@ include file="index.jsp" %>
<font >
	<u>Question's list</u>
	<c:if test="${not empty userList}">
				
				<c:forEach var="listValue" items="${userList}">
				 Subject name: ${listValue.subjectname}  <br>
				Question:
					 <c:out value="${listValue.question}" /> <br>
					<input type="radio" > <c:out value="${listValue.optionA}" /><br>
  <input type="radio" ><c:out value="${listValue.optionB}" /><br>
  <input type="radio"> <c:out value="${listValue.optionC}" /><br>
  <input type="radio"> <c:out value="${listValue.optionD}" /><br>
  <script>
function answer() {
  var x = document.getElementById("myDIV");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}
</script>

			<input type="button" value="Answer" onclick="answer()"><br>
			<div id="myDIV">
${listValue.answer}
</div> <br>
			</c:forEach>
	</c:if>
	<br>
	<br>
	
	</font>


</body>
</html>