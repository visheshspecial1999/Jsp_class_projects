<%@page import="store_management.dto.Store"%>
<%@page import="store_management.service.StoreService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<%@include file="nav.jsp" %>
<div>
<% int productId=Integer.parseInt(request.getParameter("productId")); 
StoreService s=new StoreService();
Store store=s.getById(productId);
%>
</div>
<fieldset><legend>Product Update</legend>
<form action="updatedata" method="post">
<label>productId</label>
<input type="number" name="productId" placeholder="enter productId" value="<%=store.getProductId()%>"><br><br>
<label>productName</label>
<input type="text" name="productName" placeholder="enter productName"  value="<%=store.getProductName()%>"><br><br>
<label>productPrice</label>
<input type="number" name="productPrice" placeholder="enter productPrice"  value="<%=store.getProductPrice()%>"><br><br>
<input type="submit" value="save">&nbsp;&nbsp;
<input type="reset" value="reset">
</form>
</fieldset>
</body>
</html>