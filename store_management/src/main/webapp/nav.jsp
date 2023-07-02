<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>header</title>
<style type="text/css">
*{
margin: 0px;
padding: 0px;
}
.header1{
height:30px;
width:100%;
margin:0px;
padding:5px;
border:1px solid red;
background: green;
}
header section div ol li{
display: inline-block;
margin: 5px 10px 10px 10px;
box-sizing: border-box;
position: relative;
}
</style>
</head>
<body>
	<header class="header1">
		<section class="section1">
			<div class="div1">
				<ol class="list">
					<a href="Home.jsp" ><li class="item1">Home</li></a>
					<a href="insert.jsp" target="_blank" ><li class="item2">Insert</li></a>
					<a href="delete.jsp" ><li class="item3">DeleteById</li></a>
				</ol>
			</div>
		</section>
	</header>
</body>
</html>