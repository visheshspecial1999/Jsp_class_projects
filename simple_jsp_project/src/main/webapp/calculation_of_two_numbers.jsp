<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition</title>
<style>
*{margin: 0px;
padding: 0px;
}
</style>
</head>
<body style="background:yellow">
<%@include file="headers.jsp" %>
	<h3 style="color:green">welcome to first simple JSP project</h3>
	<p style="color:blue">Here we perform addition of two numbers by calling sum()
		method.<br> After that we do subtraction,multiplication,division and modulas
		division</p>
	<%!int a =10;
	int b = 21;
	String st="Good morning ";
	String st1="MOM";
	public int sum() {
		return a + b;
	}

	public int subtract() {
		return b - a;
	}

	public int multi() {
		return a * b;
	}

	public int div() {
		return b / a;
	}
	
	public int moddiv(){
		return b%a;
	}
	public String reversString1(){
		System.out.print(st);
		StringBuffer str=new StringBuffer(st1);
		return str.reverse().toString();
	}
	%>
	
	<%
	System.out.println("the first number is: "+a+" and second number is: "+b);
	System.out.println("the sum of two numbers is: "+sum());
	System.out.println("the substraction of two numbers is: "+subtract());
	System.out.println("the multiplication of two numbers is: "+multi());
	System.out.println("the division of two numbers is: "+div());
	System.out.println("the modulas division of two numbers is:"+moddiv());
	System.out.println(reversString1());
	%>
	<div>
	<%= reversString1()%>
	the first number is: <%= a%> and second number is: <%=b%>
	</div>
	<div>
	<%@ include file="random_number.jsp" %>
	</div>
	<div><a href="redirect_page.jsp" target="blank_">click_for_redirect</a></div>
</body>
</html>