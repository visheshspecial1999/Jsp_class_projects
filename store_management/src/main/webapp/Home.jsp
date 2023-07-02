<%@page import="store_management.dto.Store"%>
<%@page import="java.util.List"%>
<%@page import="store_management.service.StoreService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.table{
margin:2px 0px 0px 2px;
}
</style>
</head>
<body>
<%@include file="nav.jsp" %>
	<%
	StoreService s = new StoreService();
	List<Store> list = s.displayAll();
	%>

	<div class="table">
		<table border="2px" cellspacing="5px" cellpadding="2px" style="text-align: center; background-color: aqua;">
			<thead>
				<tr>
					<td>productId</td>
					<td>productName</td>
					<td>productPrice</td>
					<td colspan="2" style="text-align:center">Action</td>
					
					</tr>
			</thead>
		<%for(Store li:list) {%>
		<tbody>
		<tr>
		<td><%=li.getProductId() %></td>
		<td><%=li.getProductName() %></td>
		<td><%=li.getProductPrice() %></td>
		<td><button style="background-color:green;"><a style="color:white; " href="update.jsp?productId=<%=li.getProductId() %>">update</a></button></td>
		<td><button style="background-color:red;" ><a style="color:white; " href="delete?productId=<%=li.getProductId() %>">delete</a></button></td>
		</tr>
		</tbody>
		<%} %>
	</div>
</table>
</body>
</html>