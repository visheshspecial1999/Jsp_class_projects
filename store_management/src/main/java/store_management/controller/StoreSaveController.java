package store_management.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import store_management.dto.Store;
import store_management.service.StoreService;

@WebServlet(value = "/savedata")
public class StoreSaveController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int productId = Integer.parseInt(req.getParameter("productId"));
		String productName = req.getParameter("productName");
		double productPrice = Double.parseDouble(req.getParameter("productPrice"));
		Store store = new Store();
		store.setProductId(productId);
		store.setProductName(productName);
		store.setProductPrice(productPrice);
		StoreService service = new StoreService();
		String st = service.saveStore(store);
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body>");
		printWriter.write(st);
		printWriter.write("</body></html>");

		RequestDispatcher dispatche = req.getRequestDispatcher("insert.jsp");
		dispatche.include(req, resp);
	}
}