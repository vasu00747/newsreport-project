<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">body {
	background: url("file:///C:/Users/rajue/E-Learning/WebContent/WEB-INF/view/Capture.JPG") no-repeat fixed center;
	font-family: inherit;
	font-weight: bold;
}
</style>
<title>EditorLoginPage</title>
</head>
<body >
<%@ include file="index.jsp" %>
<br><br>
<center>
		<font >Editor Login
	</center>
	<form action="formvalidationadmin" method="post">
<table>
 <tr><td><b>User Name:</b></td>
<td><input type="text" name="username"></td></tr>

<tr><td><b>Password:</b></td>
<td><input type="password" name="password"></td></tr></table>

<br><br>
<input type="submit" value="Login"> <br><br>
</form></center><br>

</font>

</body>
</html>