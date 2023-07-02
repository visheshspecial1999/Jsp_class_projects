<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>
</head>
<body>
<%@include file="nav.jsp" %>
<fieldset><legend>Product Registration</legend>
<form action="savedata" method="post">
<label>productId</label>
<input type="number" name="productId" placeholder="enter productId"><br><br>
<label>productName</label>
<input type="text" name="productName" placeholder="enter productName"><br><br>
<label>productPrice</label>
<input type="number" name="productPrice" placeholder="enter productPrice"><br><br>
<input type="submit" value="save">&nbsp;&nbsp;
<input type="reset" value="reset">
</form>
</fieldset>
</body>
</html>