<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: teal;">
	<br>
	<br>
	<div align="center">
		<h2 style="color: threedface; height: 30px;">User Registration
			Form</h2>
		<h1 style="color: red">${msg}</h1>
		<form:form action="submitform" modelAttribute="student" enctype="multipart/form-data">
			<table>
				<tr>
					<td>Student Name :</td>
					<td><input path="stuName"/></td>
				</tr>

				<tr>
					<td>Password :</td>
					<td><input path="stuPassword" /></td>
				</tr>

				<tr>
					<td>Student Age:</td>
					<td><input path="stuAge" /></td>
				</tr>

				<tr>
				
					<td><label for="stuClass">Choose your class:</label></td>
					<td><select name="Stuclass" id="class">
						<option value=1>1</option>
						<option value=2>2</option>
						<option value=3>3</option>
						<option value=4>4</option>
						<option value=5>5</option>
						<option value=6>6</option>
						<option value=7>7</option>
						<option value=8>8</option>
					</select>
					<td><form:input path="stuClass" /></td>

				</tr>
				<br>
				<tr>

					<td>City:</td>
					<td><form:input path="stuCity" /></td>
					<td>
					<input type="radio"><label for="Delhi">Delhi</label><br>
					<input type="radio"><label for="Mumbai">Mumbai</label><br>
					<input type="radio"><label for="Bangalore">Bangalore</label><br>
					
				</tr>
				<tr>
					<td>Upload Photo:</td>
					<td><input type="file" name="stuPic"></td>
				</tr>
				<tr>
					<td><p>Do you agree to submit your details</p></td>
					
					<td><form action="/home">
						<input type="checkbox"> <label for="Yes">Yes</label><br>
						<input type="checkbox"> <label for="No">No</label><br>
						<input type="submit">
					</form></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register Student"></td>
					<td><input type="reset" value="Clear"></td>
				</tr>
			</table>
		</form:form>
		
		<a href="home">Home Page</a>

	</div>
</body>
</html>