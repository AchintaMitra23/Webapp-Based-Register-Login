<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form action="Register" method="post">
		<table>
			<tr>
				<td> UserName : </td>
				<td> <input type="text" name="user"> </td>
			</tr>
			<tr>
				<td> Password : </td>
				<td> <input type="password" name="pass"> </td>
			</tr>
			<tr>
				<td> Email ID : </td>
				<td> <input type="email" name="email"> </td>
			</tr>
			<tr>
				<td> Phone No. : </td>
				<td> <input type="tel" name="phone"> </td>
			</tr>
			<tr>
				<td colspan="2"> <input type="submit" name="submit" value="SUBMIT"> </td>
			</tr>
		</table>
	</form>
</body>
</html>