<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body {
	background: url("file:///C:/Users/rajue/E-Learning/WebContent/WEB-INF/view/Capture.JPG") no-repeat fixed center;
	font-family: inherit;
	font-weight: bold;
}

</style>
<script type="text/javascript">
	function myfunction() {
		alert("Successfully Test details are added!");
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Test Page</title>
</head>
<body>
<%@ include file="index.jsp" %>
<center>
		<font color="white"><h2>Welcome Admin</h2></font>
	</center>
	<form action="registersavetest" method="post">
		<font color="white"><b>
				<table>
					<tr>
						<td><b>Subject Name:<b></td>
						<td><input type="text" name="subjectname" placeholder="SubjectName"></td>
					</tr>

					<tr>
						<td><b>Question:<b></td>
						<td><textarea rows="4" cols="50" name="question"></textarea></td>
					</tr>

					<tr>
						<td><b>Option A:<b></td>
						<td><input type="text" name="optionA"></td>
					</tr>
					<tr>
						<td><b>Option B:<b></td>
						<td><input type="text" name="optionB"></td>
					</tr>
					<tr>
						<td><b>Option C:<b></td>
						<td><input type="text" name="optionC"></td>
					</tr>
					<tr>
						<td><b>Option D:<b></td>
						<td><input type="text" name="optionD"></td>
					</tr>
					<tr>
						<td><b>Answer:<b></td>
						<td><input type="text" name="answer"></td>
					</tr>
					<br>
					<br>
					<input type="submit" onclick="myfunction()" value="Submit">
				</table>
		</b></font>
	</form>
	
</body>
</html>