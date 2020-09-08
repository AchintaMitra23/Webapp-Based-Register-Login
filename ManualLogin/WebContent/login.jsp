<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Site</title>
</head>
<body>
	<form action="Login" method="post">
		<table>
			<tr>
				<td> UserName : </td>
				<td> <input type="text" name="user" required> </td>
			</tr>
			<tr>
				<td> Password : </td>
				<td> <input type="password" name="pass" required> </td>
			</tr>
			<tr>
				<td colspan="2"> <input type="submit" name="submit" value="LOGIN"> </td>
			</tr>
		</table>
	</form>
</body>
</html>