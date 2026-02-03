<%@page import="org.apache.jasper.compiler.Node.IncludeAction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
	String msg = (String) request.getAttribute("msg");
	String smsg = (String) request.getAttribute("successMsg");
	String errorMsg = (String) request.getAttribute("errorMsg");
	%>
	<%@ include file="header.jsp"%>
	<div align="center">
		<h1>Login</h1>
		<h2><%=msg != null ? msg : ""%></h2>
		<form action="LoginCtl" method="post">

			<table>
				<tr>
					<th>Login:</th>
					<td><input type="email" name="login" value=""
						placeholder="enter your login"></td>
				</tr>
				<tr>
					<th>Password:</th>
					<td><input type="password" name="password" value=""
						placeholder="enter your password"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" operation="LogIn" >
						</td>
				</tr>

			</table>

		</form>

	</div>
	<%@ include file="footer.jsp"%>

	</div>
</body>
</html>