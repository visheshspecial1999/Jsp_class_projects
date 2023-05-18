package com.jsp.jsp_servlet_crud_opration.service;

import java.sql.Date;
import java.util.List;

import com.jsp.jsp_servlet_crud_opration.dao.ProductDao;
import com.jsp.jsp_servlet_crud_opration.dto.Product;

public class ProductService {
	
	ProductDao productDao =new ProductDao();
	// saveProduct method
	public String saveProduct(Product product) {
	return productDao.saveProduct(product);
	}

	// displayProduct method
		public List<Product> displayProducts() {
			return productDao.displayProducts();
		}
		
		// deleteProduct method
		public void deleteProduct(int productId) {
			productDao.deleteProduct(productId);
		}
		
		// updateProduct method
		public String updateProduct(Product product) {
			return productDao.updateProduct(product);
		}
		
		// getById method
		public  Product getById(int productId) {
			return productDao.getById(productId);
		}
}
