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
<br><br>
<center>
		<font >Journalist Login
	</center>
	<form action="formvalidationjournalist" method="post">
<table>
<tr><td><b>Journalist Name:</b></td>
<td><input type="text" name="journalistname"></td></tr>

<tr><td><b>Password:</b></td>
<td><input type="password" name="password"></td></tr></table>

<br>
<input type="submit" value="Login"> <br><br>
</form></center><br>
<a href="registrationjournalist"><font>New User? Click here to register</font></a>

</font>
</body>
</html>