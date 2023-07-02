<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="nav.jsp"%>
	<div class="div1">
		<fieldset><legend>Delete Form</legend>
		<form action="delete" method="get" >
		<label>ProductId </label>&nbsp;
		<input type="number" name="productId" placeholder="enter productId: ">
		<input type="submit" value="delete">&nbsp;
		</form></fieldset>
	</div>
</body>
</html>