<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sorry!! something went wrong</title>
<style>
* {
	margin: 0px;
	padding: 0px;
}
</style>
</head>
<body>
	<div>
		<h3 style="padding: 20px; background-color: red; color: white">sorry
			you have passed invalid input please check again!!!</h3>
			<br>
			<p>this is <%=exception %></p>
	</div>
</body>
</html>