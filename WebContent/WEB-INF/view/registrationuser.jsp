<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Registration Login</title>
</head>
<body>
	<%@ include file="index.jsp" %>
	<br>
	<br>
	<center>
		<h>
		<font> Registration</font></h>
	</center>
	<form action="registersaveuser" method="post">
<font>
		<table>
			<tr>
				<td><b>User Name:<b></td>
				<td><input type="text" name="username" placeholder="Name"></td>
			</tr>

			<tr>
				<td><b>Password:<b></td>
				<td><input type="password" name="password" placeholder="password"></td>
			</tr>

			<tr>
				<td><b>Email ID:<b></td>
				<td><input type="text" name="emailId" placeholder="email"></td>
			</tr>
			<tr>
				<td><b>Date Of Birth:<b></td>
				<td><input type="date" id="start" name="dob"
					placeholder="dd/mm/yyyy"></td>
			</tr>


			<tr>
				<td><b>Select Gender:<b></td>
				<td><select name="gender">
						<option value="Male">Male</option>
						<option value="Female">Female</option>
				</select></td>
			</tr>

			<tr>
				<td><b>Address:</b></td>
				<td><input type="text" name="address"
					style="height: 50px; width: 300px;"></td>
			</tr>

			<tr>
				<td><b>Mobile Number:</b></td>
				<td><input type="text" name="mobileno" placeholder="Mobile Number"></td>
			</tr>

		</table></font>
		<br>
		<br>
		<br>
		
			<input type="submit" value="Submit">
		
	</form>

</body>
</html>