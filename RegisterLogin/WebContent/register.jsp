<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form action="LoginRegister" method="post">
		<table>
			<tr align="center">
				<td colspan="2">Registration Site: </td>
			</tr>
			<tr align="center">
				<td colspan="2">${smsg} </td>
			</tr>
			<tr>
				<td>User name: </td>
				<td> <input type="text" name="user" required="required"> </td>
			</tr>
			<tr>
				<td>Email: </td>
				<td> <input type="email" name="email" required="required"> </td>
			</tr>
			<tr>
				<td>Password: </td>
				<td> <input type="password" name="pass" required="required"> </td>
			</tr>
			<tr>
				<td>Phone No: </td>
				<td> <input type="tel" name="phone" required="required"> </td>
			</tr>
			<tr>
				<td> <input type="submit" name="submit" value="REGISTER"> </td>
				<td> <a href="login.jsp">Move to Login</a></td>
			</tr>
		</table>
	</form>
</body>
</html>