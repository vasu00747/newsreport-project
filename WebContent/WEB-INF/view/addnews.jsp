<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript">

function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#blah')
                .attr('src', e.target.result)
                .width(150)
                .height(200);
        };

        reader.readAsDataURL(input.files[0]);
    }
}

</script>
<style type="text/css">
body {
	background:
		url("file:///C:/Users/rajue/E-Learning/WebContent/WEB-INF/view/Capture.JPG")
		no-repeat fixed center;
	font-family: inherit;
	font-weight: bold;
}
</style>
<script type="text/javascript">
	function myfunction() {
		alert("Successfully News details are added!");
	}
</script>
<title>Add Content</title>
</head>
<body>
<%@ include file="index.jsp" %>
	
	<form action="registersavenews" method="post">
		<font><b>
				<table>
					<tr>
						<td><b>Category Name:<b></td>
						<td>
						 <select name="category">
        <option value="sports">Sports</option>
        <option value="crime">Crime</option>
        <option value="politics">Politics</option>
        <option value="movies">Movies</option>
      
      </select></td></tr>

					<tr>
						<td><b>Postname:<b></td>
						<td><input type="text" name="postname"
							placeholder="postname"></td>
					</tr>

					<tr>
						<td><b>Description:<b></td>
						<td><textarea rows="4" cols="50" name="description"></textarea></td>
					</tr>
					
					<tr>
						<td><b>Location:<b></td>
						<td><input type="text" name="location"
							placeholder="location"></td>
					</tr>
					<tr>
						<td><b>Image:<b></td>
						<td><input type="file" onchange="readURL(this);"name="image" value="Choose image"
							placeholder="Upload Image"></td>
					</tr>
					<br>
					<br>
					<input type="submit" onclick="myfunction()" value="Submit">
				</table>
		</b></font>
	</form>


</body>
</html>