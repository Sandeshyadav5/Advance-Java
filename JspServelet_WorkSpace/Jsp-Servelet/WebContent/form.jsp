<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FORM</title>
</head>
<body>
	<div align="center">
		<form action=HelloServlet method="post">
			<table>
				<h1>FORM</h1>
				<tr>
					<th>First Name</th>
					<td><input type="text" name="firstName" value=""
						placeholder="Enter first name"></td>
				</tr>
				<tr>
					<th>Last Name</th>
					<td><input type="text" name="lastName" value=""
						placeholder="Enter Last Name"></td>
				</tr>
				<tr>
					<th>Login</th>
					<td><input type="email" name="login" value=""
						placeholder="Enter your email"></td>
				</tr>
				<tr>
					<th>Password</th>
					<td><input type="password" name="password" value=""
						placeholder="Enter your password"></td>
				</tr>
				<tr>
					<th>DOB</th>
					<td><input type="date" name="dob" value=""
						placeholder="Enter your date of birth"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" name="operation" value="SUBMIT"
						placeholder="pointer"></td>
				</tr>
			</table>

		</form>
	</div>
</body>
</html>