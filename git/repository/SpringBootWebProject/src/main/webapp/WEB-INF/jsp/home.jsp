<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<img alt="pawan" src="images/p.jpg">
	<div align="center" style="background-color:gray;height:800px; ">
	<br>
	<br>
		<h1 style="color: green">Login Form</h1><br><br>
		<h1 style="color: black; background-color: red">${msg}</h1>
		<form:form action="validate" modelAttribute="student">
			<table>
				<tr>
					<td><h2>Student Name</h2></td>
					<td><form:input path="stuName"></form:input></td>
				</tr>
				<tr>
				<td><h2>Password</h2></td>
				<td><form:password path="stuPassword" /></td>
				</tr>
			
				
				<tr>
				<td><input type="submit" value="Login" style="size:20px; "></td>
				<td><input type="reset" value="Clear"></td>
				</tr>
			</table>
			</form:form>
			<br>
			<br>
			<a href="registration">New Student Registration</a><br>
			<a href="viewStudents">View All Students</a><br>
			<a href="teacherWindow" style="color:navy">Go to Teacher Window</a><br>
	</div>

</body>
</html>