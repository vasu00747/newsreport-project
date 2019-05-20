<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>User login</title>
</head>
<body>
<%@ include file="index.jsp" %>
<center>
		<font >User Login
	</center>
	<form action="formvalidationuser" method="post">
<table>
<tr><td><b>User Name:</b></td>
<td><input type="text" name="username"></td></tr>

<tr><td><b>Password:</b></td>
<td><input type="password" name="password"></td></tr></table>

<br>
<input type="submit" value="Login"> <br><br>
</form></center><br>
<a href="registrationuser"><font >New User? Click here to register</font></a>

</font>
</body>
</html>