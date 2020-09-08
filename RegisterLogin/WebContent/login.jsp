<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="LoginRegister" method="post">
		<table>
			<tr align="center">
				<td colspan="2">Login Site: </td>
			</tr>
			<tr align="center">
				<td colspan="2">${msg} </td>
			</tr>
			<tr>
				<td>User name: </td>
				<td> <input type="text" name="user" required="required"> </td>
			</tr>
			<tr>
				<td>Password: </td>
				<td> <input type="password" name="pass" required="required"> </td>
			</tr>
			<tr>
				<td> <input type="submit" name="submit" value="LOGIN"> </td>
				<td> <a href="register.jsp">Move to Register</a></td>
			</tr>
		</table>
	</form>
</body>
</html>