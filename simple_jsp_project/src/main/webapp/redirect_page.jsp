<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Redirect page</title>
</head>
<body style="background-color: red; color: green;text-decoration: italic">
<div>
<h4>this is redirection page.which is using response.sendredirect method to redirect on next page</h4>
<% response.sendRedirect("https://www.youtube.com/watch?v=DrUOSJrDumo&list=PL0zysOflRCel5BSXoslpfDawe8FyyOSZb&index=37&ab_channel=LearnCodeWithDurgesh");%>
</div>
</body>
</html>