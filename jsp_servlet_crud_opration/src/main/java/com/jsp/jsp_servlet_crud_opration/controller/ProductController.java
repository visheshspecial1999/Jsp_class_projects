package com.jsp.jsp_servlet_crud_opration.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(value = "/insert")
public class ProductController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int productId=Integer.parseInt(req.getParameter("productId"));
		String productName=req.getParameter("productName");
		double productPrice=Double.parseDouble(req.getParameter("productPrice"));
		String expireDate=req.getParameter("expireDate");
		
		Product product=new Product();
		product.setProductId(productId);
		product.setProductName(productName);
		product.setProductPrice(productPrice);
		
		
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-YYYY");
		
		try {
			product.setExpireDate(dateFormat.parse(expireDate)); 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		ProductService productService=new ProductService();
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body>");
		printWriter.write(productService.saveProduct(product));
		printWriter.write("</body></html>");
		
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("insert.jsp");
		requestDispatcher.include(req, resp);
	}
}