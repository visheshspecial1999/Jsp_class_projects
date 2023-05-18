<%@page import="com.jsp.jsp_servlet_crud_opration.dto.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.jsp_servlet_crud_opration.service.ProductService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<%
	ProductService productService = new ProductService();

	List<Product> products=productService.displayProducts();
%>
<div>
<table class="table">
  <thead>
    <tr class="bg-danger">
      <th scope="col">Product-Id</th>
      <th scope="col">Product-Name</th>
      <th scope="col">Product-Price</th>
      <th scope="col">Expire-Date</th>
      <th scope="col">Deletion</th>
      <th scope="col">Updation</th>
    </tr>
  </thead>
  
  <%for(Product product:products){ %>
  
  <tbody>
    <tr class="table-primary">
      <td><%=product.getProductId()%></td>
      <td><%=product.getProductName()%></td>
      <td><%=product.getProductPrice()%></td>
      <td><%=product.getExpireDate()%></td>
      <td><button class="bg-danger"><a href="delete?productId=<%=product.getProductId()%>" class="text-white">DELETE</a></button></td>
      <td><button><a href="update.jsp?productId=<%=product.getProductId()%>">UPDATE</a></button></td>
    </tr>
  </tbody>
  <%} %>  
</table>
</div>
</body>
</html>