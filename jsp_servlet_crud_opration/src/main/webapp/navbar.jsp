<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>navbar</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-success bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="home.jsp">Product-Management</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="insert.jsp" target="blank_">Insert</a>
        </li>
 <!--        <li class="nav-item">
          <a class="nav-link" href="update.jsp" target="blank_" >Update</a>
        </li> -->
        <li class="nav-item">
          <a class="nav-link" href="deletebyId.jsp"  target="blank_">DeleteById</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
</body>
</html>