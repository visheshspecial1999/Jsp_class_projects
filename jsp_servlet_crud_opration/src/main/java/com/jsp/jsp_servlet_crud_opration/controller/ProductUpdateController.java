package com.jsp.jsp_servlet_crud_opration.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jsp_servlet_crud_opration.dto.Product;
import com.jsp.jsp_servlet_crud_opration.service.ProductService;
@WebServlet(value = "/update")
public class ProductUpdateController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int productId=Integer.parseInt(req.getParameter("productId"));
		String productName=req.getParameter("productName");
		double productPrice=Double.parseDouble(req.getParameter("productPrice"));
		String expireDate=req.getParameter("expireDate");
		Product product=new Product();
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-DD");
		try {
			product.setExpireDate(dateFormat.parse(expireDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		product.setProductId(productId);
		product.setProductName(productName);
		product.setProductPrice(productPrice);
		ProductService productService=new ProductService();
		productService.updateProduct(product);
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("home.jsp");
		requestDispatcher.include(req, resp);
	}
}
