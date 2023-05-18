<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Random_number</title>
</head>
<body>
<%! int n=10; 
Random random=new Random();
int r=random.nextInt(n);
%>
<p style="color:grey;text-decoration:inherit;">the random number between 0 to <%= n%> is <%=r %>
</body>
</html>