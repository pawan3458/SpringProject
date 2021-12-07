<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2 style="color: green">${msg}</h2>
		<table border="1">
			<tr>
				<td>ID</td>
				<td>Student Name</td>
				<td>Age</td>
				<td>City</td>
				<td>Photo</td>
				<td>Edit</td>
				<td>Delete</td>
			</tr>
			
			<c:forEach items="${student}" var="u">
				<tr>
					<td>${u.id}</td>
					<td>${u.userName}</td>
					<td>${u.userAge}</td>
					<td>${u.userCity}</td>
					<td><img alt="No Photo" width="100 height=300" src="data:image/jpg;base64,${u.userPicture}"></img></td>
					<td><a href="updateuser/${u.id}">Edit</a></td>
					<td><a href="deleteuser/${u.id}">Delete</a></td>
				</tr>
			</c:forEach>



		</table>
		<a href="home">Home Page</a>
	</div>
</body>
</html>