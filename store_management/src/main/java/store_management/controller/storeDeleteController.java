package store_management.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import store_management.service.StoreService;
@WebServlet(value = "/delete")
public class storeDeleteController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int productId = Integer.parseInt(req.getParameter("productId"));
		StoreService service = new StoreService();
		service.deleteById(productId);
		RequestDispatcher dispatcher = req.getRequestDispatcher("Home.jsp");
		dispatcher.include(req, resp);

	}
}